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
        return operandos.count() == 1;
    }

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

    @Override
    public boolean isOperator(String item) {
        return item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/");
    }

    @Override
    public ArrayList<String> getItems(String _expresion) {
        ArrayList<String> datos = new ArrayList<String>();
        String[] DatosEnLista = _expresion.split(" ");
        for (String dato : DatosEnLista) {
            datos.add(dato);
        }
        return datos;
    }
}
