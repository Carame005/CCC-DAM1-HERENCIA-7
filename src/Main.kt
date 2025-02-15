fun main() {
    val moto = Motocicleta("Kawasaki","P30",400,10)
    val auto = Automovil("Ford","Fiesta",600,"3C")

    println(moto.calcularAutonomia())
    println(auto.calcularAutonomia())
}