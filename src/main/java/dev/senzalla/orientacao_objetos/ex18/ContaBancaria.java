package dev.senzalla.orientacao_objetos.ex18;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        saldo = 0.0;
    }

    public ContaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito efetuado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso.");
        } else {
            System.out.println("Saque não autorizado. Saldo insuficiente.");
        }
    }

    public double verificarSaldo() {
        return saldo;
    }
}

