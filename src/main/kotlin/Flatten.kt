fun main(){
    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val myList = listOf(mysports, myplayers, mycities)

    println("Flatten: ${myList.flatten()}")
}
