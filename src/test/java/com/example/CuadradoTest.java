package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CuadradoTest {
    @Test
    void testCalcularArea(){
        //Arrange
        Cuadrado areaCuadrado =new Cuadrado(3);
        //Act
        double area = areaCuadrado.calcularArea();
        //Assert
        assertEquals(area, 9);
    }
    
}
