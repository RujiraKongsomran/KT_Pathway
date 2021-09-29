import example.myapp.Aquarium
import example.myapp.Plecostomus
import example.myapp.Shark
import example.myapp.TowerTank

fun buildAquarium() {
//    val aquarium1 = Aquarium()
//    aquarium1.printSize()
//    println("-----------")
//
//    val aquarium2 = Aquarium(width = 25)
//    aquarium2.printSize()
//    println("-----------")
//
//    val aquarium3 = Aquarium(height = 35, length = 110)
//    aquarium3.printSize()
//    println("-----------")
//
//    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
//    aquarium4.printSize()
//    println("-----------")
//
//    val aquarium5 = Aquarium()
//    aquarium5.printSize()

//    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
//    aquarium6.printSize()
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()

    //println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
}

fun main() {
    makeFish()
}