package example.myapp

abstract class AquariumFish {
    abstract val color: String
}

interface FishAction {
    fun eat()
}

class Shark : AquariumFish(), FishAction {
    // Because color is abstract, the subclasses must implement it.
    override val color = "grey"
    // Implement eat()
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus : AquariumFish(), FishAction {
    // Because color is abstract, the subclasses must implement it.
    override val color = "gold"
    // Implement eat()
    override fun eat() {
        println("eat algae")
    }
}