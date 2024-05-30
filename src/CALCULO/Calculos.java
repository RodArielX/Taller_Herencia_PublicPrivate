package CALCULO;

public class Calculos {
    int valor1;
    int valor2;
    int valor3;

    public Calculos(int valor1, int valor2, int valor3){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }
    public int getValor1() {
        return valor1;
    }
    public int getValor2() {
        return valor2;
    }
    public int getValor3() {
        return valor3;
    }


    public void mostrar(){
        System.out.println("Valores");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
        System.out.println("Valor 3: " + valor3);
    }
}

class Sumar extends Calculos{
    int valor4;

    public Sumar(int valor1, int valor2, int valor3, int valor4){
        super(valor1, valor2, valor3);
        this.valor4 = valor4;
    }
    public int getValor4() {
        return valor4;
    }

    public void mostrarSumatoria(){
        double sumatoria = getValor1() + getValor2() + getValor3() + getValor4();
        System.out.println("La sumatoria es: " + sumatoria);
    }
}
