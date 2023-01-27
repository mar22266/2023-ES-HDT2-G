import java.util.ArrayList;
/**
 * @author Andre marroquin
 * Gabriell paz
 * Andy fuentes
 * Seccion 10 estructura de datos
 */
public class Pcalculator implements IPostfixCalculator {
    
    /** 
     * @param operandos
     * @return boolean
     */
    @Override
    public boolean isOneItem(IStack operandos) {
        return operandos.count() == 1;
    }

    
    /** 
     * @param a
     * @param b
     * @return int
     */
    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    
    /** 
     * @param a
     * @param b
     * @return int
     */
    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    
    /** 
     * @param a
     * @param b
     * @return int
     */
    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    
    /** 
     * @param a
     * @param b
     * @return int
     */
    @Override
    public int division(int a, int b) {
        return a / b;
    }

    
    /** 
     * @param item
     * @return boolean
     */
    @Override
    public boolean isOperator(String item) {
        return item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/");
    }

    
    /** 
     * @param vocablo
     * @return ArrayList<String>
     */
    @Override
    public ArrayList<String> getItems(String vocablo) {
        ArrayList<String> datos = new ArrayList<String>();
        String[] DatosEnLista = vocablo.split(" ");
        for (String dato : DatosEnLista) {
            datos.add(dato);
        }
        return datos;
    }
}
