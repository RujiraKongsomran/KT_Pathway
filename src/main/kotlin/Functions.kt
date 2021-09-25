fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun main() {
    swim() // Default parameter
    swim("slow") // Required parameter
    swim(speed = "turtle-like") // Named parameter
}

