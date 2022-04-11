package behavioral.state

class OrderedState(packageContext: Package) : PackageState(packageContext) {
    override fun nextState() {
        packageContext.packageState = ShippedState(packageContext)
    }

    override fun prevState() {
        println("The package is in the first state")
    }

    override fun getStatus() {
        println("The package is in the ordered state")
    }

}