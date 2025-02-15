class Motocicleta (nombre : String, modelo : String, capacidadCombustible : Int, cilindrada : Int) : Vehiculo(nombre,modelo,capacidadCombustible) {

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia()-40
    }

}