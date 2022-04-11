package behavioral.state

class Package {

    var packageState: PackageState = OrderedState(this)

    fun getState() {
        return packageState.getStatus()
    }

    fun nextState() {
        packageState.nextState()
    }
}

fun main(args : Array<String>) {
    val orderPackage = Package()
    orderPackage.getState()
    orderPackage.nextState()
    orderPackage.getState()
    orderPackage.nextState()
    orderPackage.getState()
}