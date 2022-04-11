package structural.decorator

class UniversalMessagingApp: MessageSender {
    override fun send() {
        println("using universal messaging app")
    }
}

fun main(args: Array<String>) {
    val allMessagingApp = FacebookSender(InstagramSender(UniversalMessagingApp()))
    allMessagingApp.send()
}