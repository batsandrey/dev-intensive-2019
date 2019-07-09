package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.extensions.humanizeDiff
import java.util.*

class ImageMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncomming: Boolean = false,
    date: Date = Date(),
    var image: String?
) : BaseMessage(id, from, chat, isIncomming, date) {
//    TODO("fix it")
    override fun formatMessage(): String = "${from?.firstName}" +
                    " ${if (isIncomming) "получил" else "отправил"} изображение \"$image\" ${date.humanizeDiff()}"
}