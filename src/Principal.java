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
        for(int i=0;i<datos.size(); i++){
            System.out.println(datos.get(i));
        }
        
        

    }
}
