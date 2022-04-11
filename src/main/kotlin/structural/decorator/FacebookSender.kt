package structural.decorator

class FacebookSender(sender: MessageSender): BaseMessageSender(sender) {
    override fun send() {
        sender.send()
        println("sending via facebook")
    }
}