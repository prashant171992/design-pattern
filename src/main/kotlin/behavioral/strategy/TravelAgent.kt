package behavioral.strategy

class TravelAgent(private val travelStrategy: TravelStrategy) {
    fun travel(source: String, destination: String) {
        travelStrategy.travel(source, destination)
    }
}

fun main(args : Array<String>) {
    val travelAgent = TravelAgent(TravelByBus())
    travelAgent.travel("A", "B")
}
