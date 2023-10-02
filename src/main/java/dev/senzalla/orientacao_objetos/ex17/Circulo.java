package dev.senzalla.orientacao_objetos.ex17;


public class Circulo {
    private double raio;
    private double area;
    private double circunferencia;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
        calcularArea();
        calcularCircunferencia();
    }

    private void calcularArea() {
        calcularArea(raio);
    }

    public double calcularArea(double raio) {
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    private void calcularCircunferencia() {
        calcularCircunferencia(raio);
    }

    public double calcularCircunferencia(double raio) {
        circunferencia = 2 * Math.PI * raio;
        return circunferencia;
    }


    public void imprimaCalculos() {
        System.out.printf("Raio do círculo: %.2f \n", raio);
        System.out.printf("Área do círculo: %.2f \n", area);
        System.out.printf("Circunferência do círculo: %.2f \n", circunferencia);
    }
}
