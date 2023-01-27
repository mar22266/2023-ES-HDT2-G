import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
/**
 * @author Andre marroquin
 * Gabriell paz
 * Andy fuentes
 * Seccion 10 estructura de datos
 */
public class Controladora {
    public ArrayList<String> datos = new ArrayList<String>();
    private IPostfixCalculator calc = new Pcalculator();
    private IStack<Integer> stack = new StackUsingArrayList<Integer>();


    /**
     * @param nameArchivo
     */
    public ArrayList<String> importArchivo(String nameArchivo) {
        String fpath = nameArchivo;
        String data = "";
        ArrayList<String> datos = new ArrayList<String>();
        try {
            File myObj = new File(fpath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                datos.add(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return datos;

    }

    public ArrayList<Integer> calcular(ArrayList<String> datoAcalcular) {
        ArrayList<Integer> resultados = new ArrayList<Integer>();
        for (int i = 0; i < datoAcalcular.size(); i++) {
            ArrayList<String> datossepa = calc.getItems(datoAcalcular.get(i));

            for (String dato : datossepa) {
                if (calc.isOperator(dato)) {
                    int a = stack.pull();
                    int b = stack.pull();
                    int resultado = 0;
                    switch (dato) {
                        case "+":
                            resultado = calc.suma(a, b);
                            break;
                        case "-":
                            resultado = calc.resta(a, b);
                            break;
                        case "*":
                            resultado = calc.multiplicacion(a, b);
                            break;
                        case "/":
                            resultado = calc.division(a, b);
                            break;
                        default:
                            break;
                    }
                    stack.push(resultado);
                } else {
                    stack.push(Integer.parseInt(dato));
                }
            }
            resultados.add(stack.pull());

        }

        return resultados;
    }

}

