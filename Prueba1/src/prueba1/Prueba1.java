
package prueba1;
import java.util.Scanner;

/**
 *
 * @author alejandra reyes
 */
public class Prueba1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println(" Ingrese su numero");
        int num=leer.nextInt();
        int res=num%10;
        if (res%2==0){
            System.out.println(res +" es par");
        }
        else{
            System.out.println(res+" es impar");
        }
    }
    
}
