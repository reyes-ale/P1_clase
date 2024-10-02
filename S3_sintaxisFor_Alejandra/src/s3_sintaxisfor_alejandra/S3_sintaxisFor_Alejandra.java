package s3_sintaxisfor_alejandra;
import java.util.Scanner;
/**
 *
 * @author alejandra
 */
public class S3_sintaxisFor_Alejandra {
    static Scanner leer = new Scanner (System.in);
    public static void main(String[] args) {
        
        System.out.println(" ********** M E N U **********");
        System.out.println(" 1. menor");
        System.out.println(" 2. Serie tabla del 2 y 3");
        System.out.println(" 3. serie de numeros con ceros");
        System.out.println(" 4. figuras");
        System.out.print(" Ingrese su opcion: ");
        int opcion=leer.nextInt();
        
        
        while (opcion>0 & opcion<5){
             switch (opcion){
                 case 1: 
                     int menor;
                     int numero=leer.nextInt();
                     menor=numero;
                     for (int contador=1; contador<5; contador++){
                         numero=leer.nextInt();
                         if (numero<menor){
                             menor=numero;
                         }
                     }
                     System.out.println("El menor es: " + menor);
                    break;
                    
                 case 2:
                     System.out.println("Serie de numeros tabla del 2 y 3");
                     int tabla2=2;
                     int tabla3=3;
                     
                     int limite=leer.nextInt();
                     for (int i=1;i<=limite;i++){
                         if(i%2==0){
                             System.out.print(tabla3 + " ");
                             tabla3=tabla3+3; 
                         }
                         else{
                             System.out.print(tabla2 + " ");
                             tabla2=tabla2+2;
                         }
   
                           
                     }
                    break;
                             
                             //2,3,4,6,6,9,8,12.....
                    
                 case 3:
                     System.out.println("Ingrese el limite: ");
                     limite=leer.nextInt();
                     int num=2;
                     int cero=0;
                     for (int contador=1; contador<=limite; contador++){
                         System.out.print(num + " ");
                         num++;
                         for (int contador2=0; contador2<contador; contador2++){
                             System.out.print(cero + " ");
                             
                         }
                             
                     } // for externo
                     break;
                
                 case 4:
                     System.out.println();
                     System.out.println(" ******** SUB-MENU DE FIGURAS********");
                     System.out.println("1. Cuadrado");
                     System.out.println("2. Cuadrado vacio");
                     System.out.println("3. Triangulo");
                     System.out.println("4. Triangulo invertido");
                     System.out.println("5. Pantalon");
                     System.out.println("6. Martillo");
                     System.out.print("Ingrese opcion: ");
                     int opcion2=leer.nextInt();
                     
                      switch (opcion2){
                        
                              case 1:
                                    System.out.println();
                                    System.out.println("------- Cuadrado -------");
                                    System.out.print("Filas: ");
                                    int filas = leer.nextInt();
                                    System.out.print("Columnas: ");
                                    int col = leer.nextInt();
                                    cuadrado(filas,col);
                                    break;

                              case 2:
                                    cuadradovacio();
                                    break;

                                case 3:
                                    triangulo();
                                    break;
                                    
                                case 4:
                                    trianguloinv();
                                    break;
                                    
                                case 5:
                                    pantalon();
                                    break;

                                case 6:
                                    martillo();
                                    break;
                       }
                                         
              }//cierre switch externo
             System.out.println();
                System.out.println(" ********** M E N U **********");
                System.out.println(" 1. menor");
                System.out.println(" 2. Serie tabla del 2 y 3");
                System.out.println(" 3. serie de numeros con ceros");
                System.out.println(" 4. figuras");
                System.out.print(" Ingrese su opcion: ");
                opcion=leer.nextInt();

             }// fin del while
                
                
        }//fin del main
    //metodo cuadrado
    public static void cuadrado(int filas, int col){
        for (int i = 1; i <= filas; i++ ){
            for (int j = 1; j<=col; j++){
               System.out.print("* ");
            }
            System.out.println();
        }
    }//fin del metodo cuadrado
    
    public static void cuadradovacio(){
         System.out.println();
         System.out.println("------- Cuadrado vacio -------");
         System.out.print("Filas: ");
         int filas = leer.nextInt();
         System.out.print("Columnas: ");
         int col = leer.nextInt();
         for (int i=1; i<=filas; i++){
                for (int j=1; j<=col;j++){
                if (i == 1 || i == filas || j == 1 || j == col){
                    System.out.print("*");
                }
                 else{
                     System.out.print(" ");
                 }

                                        }
            System.out.println(); 
        }
    }//fin del metodo cuadrado vacio
    
    public static void triangulo(){
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
    }//fin del metodo triangulo
       
    public static void trianguloinv(){
         System.out.println();
         System.out.println("------- Triangulo invertido -------");
         System.out.print("Base: ");
         int base=leer.nextInt();
                                    
         for (int i=base; i>=1; i--){
                for (int j=1; j<=i; j++){
                   System.out.print("* ");
                }
            System.out.println();
        }
    }//fin del metodo triangulo invertido
    
    public static void pantalon(){
        System.out.println();
        System.out.println("------- Pantalon -------");
        System.out.print("Tamaño: ");
        int tam = leer.nextInt();
                                    
        for (int i=0; i<tam; i++){
             for (int j=0; j<tam*2; j++){
                 System.out.print(" ");
                 if (i+j<tam){
                    System.out.print("*");
                  }
                    else if (j-i>=tam){
                        System.out.print("*"); 
                    }
                     else{
                          System.out.print(" ");
                        }
                                     
            }
            System.out.println();
        }
    }// fin del metodo pantalon
    
    public static void martillo(){
        System.out.println();
        System.out.println("------- Martillo -------");
        System.out.print("Tamaño: ");
        int tam2=leer.nextInt();
        for (int i=1; i<=tam2; i++){
            for (int j=1; j<=tam2+2;j++){
                if ((i==1 && j<= tam2) || (i==tam2 && j<=tam2)){
                    System.out.print("  ");
                }
                  else{
                      System.out.print("* ");
                    }
                }

                System.out.println();

        }
    }//fin del metodo martillo
    
}





        
            
        
    
    


