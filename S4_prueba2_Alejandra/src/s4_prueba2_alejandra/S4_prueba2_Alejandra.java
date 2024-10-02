package s4_prueba2_alejandra;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class S4_prueba2_Alejandra {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println(" ****** M E N U ******");
        System.out.println("1<- opcion 1");
        System.out.println("2<- opcion 2");
        System.out.print("Ingrese una opcion: ");
        int opcion = leer.nextInt();
        
        //char resp=
        
        while (opcion>0 && opcion<2){
            System.out.print("Ingrese un numero para la figura: ");
            int tam=leer.nextInt();
            
            if (tam>=6){
                for(int i=1; i<=tam; i++){
                    for(int j=1;j<=tam*3; j++){
                        System.out.print("_"); 
                        
                    }
                    
                    System.out.println();
                }
                for
            }
            
            
                   
        }
    }
    
}
