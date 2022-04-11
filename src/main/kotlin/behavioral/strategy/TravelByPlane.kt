package behavioral.strategy

class TravelByPlane: TravelStrategy {
    override fun travel(source: String, destination: String) {
        print("We travel by plane from $source to $destination")
    }

}