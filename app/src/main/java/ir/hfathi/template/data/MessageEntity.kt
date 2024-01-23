package ir.hfathi.template.data

data class MessageEntity(
    val id: Int,
    val text: String,
    val date: Long,
    val sendByMe: Boolean
)
