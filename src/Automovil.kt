class Automovil(nombre : String, modelo : String, capacidadCombustible : Int, tipo : String) : Vehiculo(nombre,modelo,capacidadCombustible) {

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia()+100
    }
}