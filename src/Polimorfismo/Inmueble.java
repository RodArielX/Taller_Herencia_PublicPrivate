package Polimorfismo;

public class Inmueble {
    String direccion;
    double tamanio;
    int numHabitaciones;
    double precio;

    public String getDireccion() {
        return direccion;
    }

    public double getTamanio() {
        return tamanio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public Inmueble(String direccion, double tamanio, int numHabitaciones, double precio){
        this.direccion = direccion;
        this.tamanio = tamanio;
        this.numHabitaciones = numHabitaciones;
        this.precio = precio;
    }

    public void mostrarInformacion(){
        System.out.println("Informacion");
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Tamaño: " + getTamanio() );
        System.out.println("Numero de Habitaciones: " + getNumHabitaciones());
        System.out.println("Precio: " + getPrecio());
    }
}
