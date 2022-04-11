package behavioral.strategy

class TravelByBus: TravelStrategy {
    override fun travel(source: String, destination: String) {
        print("We travel by bus from $source to $destination")
    }

}