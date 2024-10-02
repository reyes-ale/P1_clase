
package s3_menufor_alejandra;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class S3_menuFor_Alejandra {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        
        System.out.println(" ********** M  E  N  U **********");
        System.out.println("1. Cuadrado");
        System.out.println("2. Cuadrado vacio");
        System.out.println("3. Triangulo");
        System.out.println("4. Pantalon");
        System.out.println("5. Martillo");
        System.out.print("Ingrese una opcion: ");
        int opcion = leer.nextInt();
        
        while (opcion>0 && opcion<6){
                switch (opcion){
                        
                    case 1:
                        System.out.println();
                        System.out.println("------- Cuadrado -------");
                        System.out.print("Filas: ");
                        int filas = leer.nextInt();
                        System.out.print("Columnas: ");
                        int col = leer.nextInt();
                        
                        for (int i = 1; i <= filas; i++ ){
                            for (int j = 1; j<=col; j++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                        
                    case 2:
                        System.out.println();
                        System.out.println("------- Cuadrado vacio -------");
                        System.out.print("Filas: ");
                        filas = leer.nextInt();
                        System.out.print("Columnas: ");
                         col = leer.nextInt();
                        for (int i=1; i<=filas; i++){
                            for (int j=1; j<=col;j++){
                                if (i == 1 || i == filas || j == 1 || j == col){
                                    System.out.print("* ");
                                }
                                  else{
                                    System.out.print(" ");
                                }
                                
                            }
                        System.out.println(); 
                        }
                        break;
                        
                    case 3:
                        System.out.println();
                        System.out.println("------- Triangulo -------");
                        System.out.print("Base: ");
                        int base = leer.nextInt();
                        
                        for (int i=1; i<=base; i++){
                               for (int j =1; j<=i; j++){
                                   System.out.print("* ");
                               }
                               System.out.println();
                        }
                        
                    case 4:
                        System.out.println();
                        System.out.println("------- Pantalon -------");
                        System.out.print("Tamaño: ");
                        int tam = leer.nextInt();
                        for (int i=1; i<=tam; i++){
                              for (int j=1; j<=tam*2;i++){
                                  if ( j==tam || j==tam+1){
                                      System.out.print(" ");
                                  }
                                  else{
                                      System.out.print("*");
                                  }
                              }
                              System.out.println();
                        }
                        

                }
                
                System.out.println();
                System.out.println(" ********** M  E  N  U **********");
                System.out.println("1. Cuadrado");
                System.out.println("2. Cuadrado vacio");
                System.out.println("3. Triangulo");
                System.out.println("4. Pantalon");
                System.out.println("5. Martillo");
                System.out.print("Ingrese una opcion: ");
                 opcion = leer.nextInt();
                
            
        }
    }
    
}
