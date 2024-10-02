package s7_prueba_alejandra;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author aleja
 */
public class Main_prueba_matrices {
static Scanner leer = new Scanner (System.in);
static Random random = new Random ();
    public static void main(String[] args) {
        //fila2 columna4
       
        
        char resp='s';
        while (resp =='s' || resp =='S'){
            System.out.print("Ingrese numero para la dimension de la matriz: ");
            int numero = leer.nextInt();
            Prueba_matrices p = new Prueba_matrices(numero, "hola");
            
            

            int [][] matriz = new int [numero][numero];
            p.llenar(matriz);
            p.imprimir (matriz);
            System.out.println("Que numero desea buscar en la matriz?: ");
            int num = leer.nextInt();

            boolean esta = p.estaono(matriz,num);
            p.imprimex(esta, matriz,num);
            
            System.out.println("Numeros sobrantes: ");
            
            p.imprimirar(p.arregloss(matriz,num));
            System.out.println();
            
            System.out.println("Desea continuar? [s/n]: ");
            resp=leer.next().charAt(0);
        }
        
    }
    
    
    
    
}
