
package s10.examen2.alejandrareyes;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author aleja
 */
public class S10Examen2AlejandraReyes {

    /**
     * @param args the command line arguments
     */
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);
    static Scanner leers = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        System.out.print("Ingrese filas: ");
        int filas = leer.nextInt();
        System.out.print("Ingrese columnas: ");
        int col = leer.nextInt();
        int [][] matriz = new int [filas][col];
        llenar(matriz);
        
        System.out.print("Ingrese cadena: ");
        String cadena = leers.nextLine(); 
        
        Cadenas c = new Cadenas(cadena);
        Matrices m = new Matrices (matriz);
        
        
        
         JOptionPane.showMessageDialog(null,imprijop(matriz));
         JOptionPane.showMessageDialog(null,imprijop(m.modifica()));
       
        if (c.vocaseguid() == true){
            JOptionPane.showMessageDialog(null,"Vocales seguidas");
        }
        else {
             JOptionPane.showMessageDialog(null,"Vocales no seguidas");
        }
        
        
    }
    public static int [][] llenar (int [][]matriz){
        for (int i=0; i<matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                matriz[i][j]=rand.nextInt(10)+1;
            }
        }
        return matriz;
    }
    
    public static String imprijop (int [][] matriz){
        String temp = "";
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
            temp+=matriz[i][j];
                if (j==matriz[i].length-1){
                    temp+="\n";
                }
                else {
                    temp+="  "; 
                }
            }
        }
      return temp;  
    }
    
    
}
