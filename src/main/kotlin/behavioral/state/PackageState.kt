package behavioral.state

abstract class PackageState(val packageContext: Package) {
    abstract fun nextState()
    abstract fun prevState()
    abstract fun getStatus()
}