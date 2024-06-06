package Polimorfismo;

class Suite extends Inmueble {
    boolean tieneJacuzzi;

    public boolean isTieneJacuzzi() {  //Es un get pero sale diferente pq es booleano
        return tieneJacuzzi;
    }

    public Suite(String direccion, double tamanio,
                 int numHabitaciones, double precio, boolean tieneJacuzzi){
        super(direccion, tamanio, numHabitaciones, precio);
        this.tieneJacuzzi = tieneJacuzzi;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cuenta con Jacuzzi: " + isTieneJacuzzi());
        System.out.println("------------------------------------");

    }
}
