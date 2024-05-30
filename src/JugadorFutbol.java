//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JugadorFutbol {
    public int cedula;
    public String nombre;
    public int camiseta;

    public JugadorFutbol(int cedula, String nombre, int camiseta){
        this.cedula = cedula;
        this.nombre = nombre;
        this.camiseta = camiseta;
    }

    public void mostrarInformacion(){
        System.out.println("Informacion del Jugador");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de la camiseta: " + camiseta);

    }
}
class Defensa extends JugadorFutbol{
    public String posicion;
    public int tarjetas;
    public int goles;
    public int faltas;

    public Defensa(int cedula, String nombre, int camiseta,
                   String posicion, int tarjetas, int goles, int faltas) {
        super(cedula, nombre, camiseta);
        this.posicion = posicion;
        this.tarjetas = tarjetas;
        this.goles = goles;
        this.faltas = faltas;
    }
        public void mostrarInfo(){
            super.mostrarInformacion();
            System.out.println("Posicion: " + posicion);
            System.out.println("Numero de tarjetas: " + tarjetas);
            System.out.println("Numero de goles: " + goles);
            System.out.println("Numero de faltas: " + faltas);

        }
}
