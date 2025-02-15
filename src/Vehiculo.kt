open class Vehiculo(val marca : String, val modelo : String, val capacidadCombustible : Int) {

    fun mostrarInformacion(){
        println("Vehiculo de marca $marca, modelo $modelo y con una capacidad de $capacidadCombustible litros de combustible")
    }

    open fun calcularAutonomia() : Int{
        return capacidadCombustible*10
    }
}