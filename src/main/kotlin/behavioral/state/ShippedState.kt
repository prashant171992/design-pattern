package behavioral.state

class ShippedState(packageContext: Package) : PackageState(packageContext) {
    override fun nextState() {
        packageContext.packageState = DeliveredState(packageContext)
    }

    override fun prevState() {
        packageContext.packageState = OrderedState(packageContext)
    }

    override fun getStatus() {
        println("The package is in the shipped state")
    }

}