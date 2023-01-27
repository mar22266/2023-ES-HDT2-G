import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Andre marroquin
 * Gabriel paz
 * Andy fuentes
 * Seccion 10 estructura de datos
 */
public class Principal {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Controladora miControladora = new Controladora();
        Pcalculator calculator = new Pcalculator();

        Scanner scan = new Scanner(System.in);
        System.out.println("----------------CALCULATOR SIMULATOR--------------");
        System.out.println("Porfavor ingrese la ruta de su archivo: ");
        String fileString = scan.nextLine();
        ArrayList<String> datos = miControladora.importArchivo(fileString);
        ArrayList<Integer> resultados = miControladora.calcular(datos);

        for (int i = 0; i < resultados.size(); i++) {
            System.out.println("El resultado de la operacion " + (i+1) + " es: " + resultados.get(i));
        }



        

    }
}
