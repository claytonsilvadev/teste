package com.teste;


import org.jdom.Element;

/**
 * Created by clayton on 07/07/16.
 */
public class Main {

    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        Calculadora c = new Calculadora();

        Element teste;

        System.out.println("Soma.........: " + c.soma(a,b));
        System.out.println("Subtração....: " + c.subtrai(a,b));
        System.out.println("Multiplicação: " + c.multiplica(a,b));
        System.out.println("Divisão......: " + c.divide(a,b));
    }
}
