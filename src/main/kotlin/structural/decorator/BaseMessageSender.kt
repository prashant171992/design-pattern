package structural.decorator

abstract class BaseMessageSender(val sender: MessageSender) : MessageSender {
    override fun send() {
        sender.send()
    }
}