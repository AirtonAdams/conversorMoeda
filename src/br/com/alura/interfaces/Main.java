package br.com.alura.interfaces;

import br.com.alura.interfaces.conversor.ConversorDolar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorDolar convercao1 = new ConversorDolar();
        System.out.print("Digite o valor em dolar: ");
        convercao1.setDolar(sc.nextDouble());
        System.out.printf("Valor convertido para Real: %.2f ", convercao1.converterMoeda());

        sc.close();
    }

}