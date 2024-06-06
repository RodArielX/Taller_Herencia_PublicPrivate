package Polimorfismo;

public class Main {
    public static void main(String[] args){
        Inmueble inmueble1 = new Inmueble("Cumbayork", 1222.0,16, 32.40);
        Departamento departamento = new Departamento("Tumbayork",1231.54,45, 199.99, 10);
        CasaIndividual casaIndividual1 = new CasaIndividual("La Comuna",1792.12,
                25,129.99,12000.13);
        Suite suite1 = new Suite("Las Casas",123.56,34,178.99, true);
        inmueble1.mostrarInformacion();
        departamento.mostrarInformacion();
        casaIndividual1.mostrarInformacion();
        suite1.mostrarInformacion();
    }
}
