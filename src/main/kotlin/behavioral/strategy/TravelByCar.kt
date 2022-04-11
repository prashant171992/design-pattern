package behavioral.strategy

class TravelByCar: TravelStrategy {
    override fun travel(source: String, destination: String) {
        print("We travel by car from $source to $destination")
    }
}