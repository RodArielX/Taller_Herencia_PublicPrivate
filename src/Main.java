public class Main {
    public static void main(String[] args){
        JugadorFutbol jugador1 = new JugadorFutbol(1751086628, "Ariel", 21);
        jugador1.mostrarInformacion();
        System.out.println("----------------------------");
        Defensa defensa1 = new Defensa(1713036752, "Piero", 3, "Back central", 3,6,6);
        defensa1.mostrarInfo();
    }
}
