import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PcalculatorTest {

    @Test
    void suma() {
        Pcalculator calc = new Pcalculator();
        int a = 5;
        int b = 5;
        int resultado = calc.suma(a, b);
        assertEquals(10, resultado);
    }

    @Test
    void resta() {
        Pcalculator calc = new Pcalculator();
        int a = 5;
        int b = 5;
        int resultado = calc.resta(a, b);
        assertEquals(0, resultado);
    }

    @Test
    void multiplicacion() {
        Pcalculator calc = new Pcalculator();
        int a = 5;
        int b = 5;
        int resultado = calc.multiplicacion(a, b);
        assertEquals(25, resultado);
    }

    @Test
    void division() {
        Pcalculator calc = new Pcalculator();
        int a = 5;
        int b = 5;
        int resultado = calc.division(a, b);
        assertEquals(1, resultado);
    }
}