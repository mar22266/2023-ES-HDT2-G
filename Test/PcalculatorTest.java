import static org.junit.jupiter.api.Assertions.*;

class PcalculatorTest {

        void testSuma() {
            Pcalculator calc = new Pcalculator();
            int a = 5;
            int b = 5;
            int resultado = calc.suma(a, b);
            assertEquals(10, resultado);
        }

        void testResta() {
            Pcalculator calc = new Pcalculator();
            int a = 5;
            int b = 5;
            int resultado = calc.resta(a, b);
            assertEquals(0, resultado);
        }
        void testMultiplicacion() {
            Pcalculator calc = new Pcalculator();
            int a = 5;
            int b = 5;
            int resultado = calc.multiplicacion(a, b);
            assertEquals(25, resultado);
        }

        void testDivision() {
            Pcalculator calc = new Pcalculator();
            int a = 5;
            int b = 5;
            int resultado = calc.division(a, b);
            assertEquals(1, resultado);
        }
}