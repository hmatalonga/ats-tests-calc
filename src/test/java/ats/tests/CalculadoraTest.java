package ats.tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void adiciona1() {
        Calculadora c = new Calculadora();
        int x = c.adiciona(5);
        assertEquals(5, x);
    }

    @Test
    public void adiciona2() {
        Calculadora c = new Calculadora();
        int x = c.adiciona(2,2);
        assertEquals(4,x);
    }

    @Test
    public void adiciona3() {
        Calculadora c = new Calculadora();
        int x = c.adiciona(3,2);
        assertEquals(5,x);
    }

    @Test
    public void subtrai1() {
        Calculadora c = new Calculadora();
        int x = c.subtrai(3,2);
        assertEquals(1,x);
    }

    @Test
    public void subtrai2() {
        Calculadora c = new Calculadora();
        int x = c.subtrai(2);
        assertEquals(-2, x);
    }

    @Test
    public void ultimoResultado() {
        Calculadora c = new Calculadora();
        int x = c.ultimoResultado();
        assertEquals(0, x);
    }
}
