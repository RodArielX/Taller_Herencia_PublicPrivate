package Fulbo;

public class JugadorFutbol {
    int cedula;
    String nombre;
    int camiseta;

    public JugadorFutbol(int cedula, String nombre, int camiseta){
        this.cedula = cedula;
        this.nombre = nombre;
        this.camiseta = camiseta;
    }

    private void mostrarInformacion(){
        System.out.println("Informacion del Jugador");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de la camiseta: " + camiseta);
    }
    public void ayudaMostrar(){//Ayuda a pedir la informacion cuando usamos private
        mostrarInformacion();
    }
}
class Defensa extends JugadorFutbol {
    String posicion;
    int tarjetas;
    int goles;
    int faltas;

    public Defensa(int cedula, String nombre, int camiseta,
                   String posicion, int tarjetas, int goles, int faltas) {
        super(cedula, nombre, camiseta);
        this.posicion = posicion;
        this.tarjetas = tarjetas;
        this.goles = goles;
        this.faltas = faltas;
    }
    public void mostrarInfo(){
        super.ayudaMostrar();
        System.out.println("Posicion: " + posicion);
        System.out.println("Numero de tarjetas: " + tarjetas);
        System.out.println("Numero de goles: " + goles);
        System.out.println("Numero de faltas: " + faltas);
    }
}