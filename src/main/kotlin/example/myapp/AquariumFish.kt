package example.myapp

abstract class AquariumFish {
    abstract val color: String
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

class Shark : FishAction, FishColor {
    override val color: String = "grey"

    // Implement eat()
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus : FishAction, FishColor {
    override val color = "gold"

    // Implement eat()
    override fun eat() {
        println("eat algae")
    }
}