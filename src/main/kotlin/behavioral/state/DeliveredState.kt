package behavioral.state

class DeliveredState(packageContext: Package) : PackageState(packageContext) {
    override fun nextState() {
        println("The package is in the last state")
    }

    override fun prevState() {
        packageContext.packageState = ShippedState(packageContext)
    }

    override fun getStatus() {
        println("The package is in the delivered state")
    }
}