package ir.hfathi.template.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

abstract class BaseViewModel<M : UiModel, S : UiState<M>, A : UiAction> constructor(initState: S) :
    ViewModel() {

    private val _uiStateFlow: MutableStateFlow<S> by lazy {
        MutableStateFlow(initState)
    }
    val uiStateFlow: StateFlow<S> = _uiStateFlow
    private val actionFlow: MutableSharedFlow<A> = MutableSharedFlow()
    private val _singleEventFlow = Channel<S>()
    val singleEventFlow = _singleEventFlow.receiveAsFlow()

    var uiState by Delegates.observable(initState) { _, _, newViewState ->
        viewModelScope.launch {
            _uiStateFlow.emit(newViewState)
        }
    }
        private set

    init {
        viewModelScope.launch {
            actionFlow.collect { action ->
                reduceState(action)
            }
        }
    }

    abstract fun reduceState(action: A)

    fun sendAction(action: A) {
        viewModelScope.launch {
            actionFlow.emit(action)
        }
    }

    fun submitState(state: S) {
        viewModelScope.launch {
            if (state is UiState.Navigation || state is UiState.ResetState<*> || state is UiState.OpenUrl || state is UiState.PopUp || state is UiState.ShowMessage<*, *>) {
                _singleEventFlow.send(state)
            } else {
                uiState = state
            }
        }
    }
}
