package org.example;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void calculoPermitro() {
        assertEquals(20, Figura.CalculoPerimetro(5, 5));
        assertEquals(20, Figura.CalculoPerimetro(4, 6));
    }

    @org.junit.jupiter.api.Test
    void tipoFigura() {
        assertEquals("cuadrado", Figura.tipoFigura(5, 5));
        assertEquals("rectángulo", Figura.tipoFigura(4, 6));
    }
}