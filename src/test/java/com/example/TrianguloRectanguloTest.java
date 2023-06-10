package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrianguloRectanguloTest {
    private TrianguloRectangulo triangulo;

    @BeforeEach
    public void setUp(){
        triangulo = new TrianguloRectangulo(3, 4);
    }

    @Test
    public void testTrianguloRectangulo(){
        assertEquals(triangulo.calcularHipotenusa(), 5);
    }

    @Test
    public void testTrianguloRectangulo2(){
        assertTrue(triangulo.calcularPerímetro() == 12);
    }
}
