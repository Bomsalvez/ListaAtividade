package dev.senzalla.orientacao_objetos.ex20;

public class Carro {
    private final String marca;
    private final String modelo;
    private double velocidade;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0.0;
    }

    public void acelerar(double valor) {
        if (valor >= 0) {
            velocidade += valor;
            System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Valor de aceleração inválido.");
        }
    }

    public void frear(double valor) {
        if (valor >= 0 && valor <= velocidade) {
            velocidade -= valor;
            System.out.println("Freando. Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Valor de frenagem inválido ou maior que a velocidade atual.");
        }
    }
}
