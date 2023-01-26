/**
 * @author Seccion 10
 */
/**
 * @author Andre marroquin
 * Gabriell paz
 * Andy fuentes
 * Seccion 10 estructura de datos
 */
public interface IPostfixCalculator {

    boolean isOneItem(IStack operandos);

    int suma(int a, int b);

    int resta(int a, int b);

    int multiplicacion(int a, int b);

    int division(int a, int b);

    boolean isOperator(String item);

    java.util.ArrayList<String> getItems(String _expresion);
}