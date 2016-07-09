package com.teste;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by clayton on 07/07/16.
 */
public class CalculadoraTest {
    @Test
    public void soma() throws Exception {

        int a = 2;
        int b = 3;

        int resultadoEsperado = 5;
        int resultadoObtido = new Calculadora().soma(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void subtrai() throws Exception {
        int a = 2;
        int b = 3;

        int resultadoEsperado = -1;
        int resultadoObtido = new Calculadora().subtrai(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void multiplica() throws Exception {
        int a = 2;
        int b = 3;

        int resultadoEsperado = 6;
        int resultadoObtido = new Calculadora().multiplica(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void divide() throws Exception {
        int a = 3;
        int b = 3;

        Double resultadoEsperado = 1d;
        Double resultadoObtido = new Calculadora().divide(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }

}