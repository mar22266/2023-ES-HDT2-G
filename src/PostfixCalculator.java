import java.util.ArrayList;
/**
 * @author Andre marroquin
 * Gabriell paz
 * Andy fuentes
 * Seccion 10 estructura de datos
 */
public class PostfixCalculator implements IPostfixCalculator {
    @Override
    public boolean isOneItem(IStack operandos) {
        return false;
    }

    @Override
    public int suma(int a, int b) {
        return 0;
    }

    @Override
    public int resta(int a, int b) {
        return 0;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return 0;
    }

    @Override
    public int division(int a, int b) {
        return 0;
    }

    @Override
    public boolean isOperator(String item) {
        return false;
    }

    @Override
    public ArrayList<String> getItems(String _expresion) {
        return null;
    }
}
