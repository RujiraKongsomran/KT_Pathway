import example.myapp.Aquarium

fun buildAquarium(){
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    println("-----------")

    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    println("-----------")

    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    println("-----------")

    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
    println("-----------")

    val aquarium5 = Aquarium()
    aquarium5.printSize()
}

fun main(){
    buildAquarium()
}