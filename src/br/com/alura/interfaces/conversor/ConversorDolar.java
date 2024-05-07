package br.com.alura.interfaces.conversor;

import br.com.alura.interfaces.calculos.ConversaoFinanceira;

public class ConversorDolar implements ConversaoFinanceira {
    private double dolar = 0;


    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public double converterMoeda() {
        return dolar * 5.06;
    }
}
