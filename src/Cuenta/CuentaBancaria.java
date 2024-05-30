package Cuenta;

public class CuentaBancaria {
    int cedula;
    String nombre;
    int monto;

    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }

    public CuentaBancaria(int cedula, String nombre, int monto){
        this.cedula = cedula;
        this.nombre = nombre;
        this.monto = monto;
    }
    public void mostrarCuentaBancaria(){
        System.out.println("Detalle Cuenta");
        System.out.println("Cedula: "  + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Monto: " + monto);
    }
}
class CuentaAhorros extends CuentaBancaria{
    String empresaBancaria;
    int rucBanco;
    int deposito;

    public CuentaAhorros(int cedula, String nombre, int monto,
                          String empresaBancaria, int rucBanco, int deposito){
        super(cedula, nombre, monto);
        this.empresaBancaria = empresaBancaria;
        this.rucBanco = rucBanco;
        this.deposito = deposito;
    }
    public void Depositar(){
        System.out.println("El deposito ingresado es: " + deposito);
        double suma = deposito + getMonto();
        System.out.println("La cantidad total es: " + suma);
    }
}
