package structural.decorator

class InstagramSender(sender: MessageSender) : BaseMessageSender(sender) {
    override fun send() {
        sender.send()
        println("sending via instagram")
    }
}