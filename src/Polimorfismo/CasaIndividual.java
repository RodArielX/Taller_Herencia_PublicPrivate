package Polimorfismo;

class CasaIndividual extends Inmueble {
    double tamanioTerreno;

    public double getTamanioTerreno() {
        return tamanioTerreno;
    }

    public CasaIndividual(String direccion, double tamanio,
                          int numHabitaciones, double precio, double tamanioTerreno){
        super(direccion, tamanio, numHabitaciones, precio);
        this.tamanioTerreno = tamanioTerreno;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño del Terreno: " + tamanioTerreno);
        System.out.println("------------------------------------");

    }
}
