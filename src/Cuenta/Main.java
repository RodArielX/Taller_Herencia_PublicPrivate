package Cuenta;

public class Main {
    public static void main(String[] args){
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria(1713036752, "Edwin", 300);
        cuentaBancaria1.mostrarCuentaBancaria();
        CuentaAhorros cuentaAhorros1 = new CuentaAhorros(1751086628,"Ariel",
                500,"Banco Pichincha", 1234567, 200);
        cuentaAhorros1.Depositar();
    }
}
