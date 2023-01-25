import java.util.ArrayList;

public class Vector implements IPila, IPostfixCalculator {
    @Override
    public int count() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void push(Object value) {

    }

    @Override
    public Object pull() {
        return null;
    }

    @Override
    public boolean isOneItem(IPila operandos) {
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
