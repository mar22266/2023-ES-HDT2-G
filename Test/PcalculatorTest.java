import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PcalculatorTest {
    @Test
    /**
     * Prueba de suma
     */
    void suma() {
        Pcalculator calc = new Pcalculator();
        int a = 5;
        int b = 5;
        int resultado = calc.suma(a, b);
        assertEquals(10, resultado);
    }
/**
 * Prueba de resta
 */

    @Test
    void resta() {
        Pcalculator calc = new Pcalculator();
        int a = 5;
        int b = 5;
        int resultado = calc.resta(a, b);
        assertEquals(0, resultado);
    }
/**
 * Prueba de multiplicacion
 */

    @Test
    void multiplicacion() {
        Pcalculator calc = new Pcalculator();
        int a = 5;
        int b = 5;
        int resultado = calc.multiplicacion(a, b);
        assertEquals(25, resultado);
    }

    /**
     * Prueba de division
     */
    @Test
    void division() {
        Pcalculator calc = new Pcalculator();
        int a = 5;
        int b = 5;
        int resultado = calc.division(a, b);
        assertEquals(1, resultado);
    }
}