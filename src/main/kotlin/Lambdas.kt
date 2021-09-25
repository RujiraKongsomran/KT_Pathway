fun main() {
    val dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    val waterFilter1: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter1(80))
}