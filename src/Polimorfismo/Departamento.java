package Polimorfismo;

class Departamento extends Inmueble {
    int numPiso;

    public int getNumPiso() {
        return numPiso;
    }

    public Departamento(String direccion, double tamanio, int numHabitaciones,
                        double precio, int numPiso){
        super(direccion, tamanio, numHabitaciones, precio);
        this.numPiso = numPiso;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de Piso: " + getNumPiso());
        System.out.println("------------------------------------");

    }
}
