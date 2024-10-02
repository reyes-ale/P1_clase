
package s7_matrices_alejandra;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author aleja
 */
public class S7_Matrices_Alejandra {
  static Scanner leer = new Scanner (System.in);
  static Random rand = new Random();
  
    public static void main(String[] args) {
        System.out.println("* * * * * M E N U * * * * *");
        System.out.println("1. Llenar con Scanner");
        System.out.println("2. Llenar con Random");
        System.out.println("3. Suma de columnas");
        System.out.println("4. Suma de filas");
        System.out.println("5. Suma de diagonales");
        System.out.println("6. Suma de todos los elementos");
        System.out.println("7. Cuantos primos hay?");
        System.out.println("8. Imprimir con JOptionPane");
        System.out.println("9. Salir del programa");
        System.out.print("Ingrese una opcion: ");
        int opcion = leer.nextInt();
        
        while (opcion>0 && opcion<10){
            switch(opcion){
                case 1: 
                    System.out.print("Ingrese numero de filas: ");
                    int fila = leer.nextInt();
                    System.out.print("Ingrese numero de columnas: ");
                    int columna = leer. nextInt();
                    int [][] matrices = new int [fila][columna];
                    matrices = llenar_scanner(fila,columna);
                    System.out.println("Matriz generada");
                    imprimir(matrices);
                    break;

                case 2:
                    System.out.print("Ingrese numero de filas: ");
                    fila = leer.nextInt();
                    System.out.print("Ingrese numero de columnas: ");
                    columna = leer. nextInt();
                    matrices = new int [fila][columna];
                    matrices = llenar_random(fila,columna);
                    System.out.println("Matriz generada");
                    imprimir(matrices); 
                   break;

                case 3:
                    System.out.print("Ingrese numero de filas: ");
                    fila = leer.nextInt();
                    System.out.print("Ingrese numero de columnas: ");
                    columna = leer. nextInt();
                    matrices = new int [fila][columna];
                    matrices = llenar_random(fila, columna);
                    System.out.println("Matriz generada");
                    imprimir(matrices);
        
                    System.out.print("Suma de columnas: ");
                    int []suma_c = sumacolum(fila, columna, matrices);
                    imprimir_arreglo(suma_c);
                    


                    break;
                    
                case 4:
                    System.out.print("Ingrese numero de filas: ");
                    fila = leer.nextInt();
                    System.out.print("Ingrese numero de columnas: ");
                    columna = leer. nextInt();
                    matrices = new int [fila][columna];
                    matrices = llenar_random(fila, columna);
                    System.out.println("Matriz generada");
                    imprimir(matrices);
        
                    System.out.print("Suma de filas: ");
                    int []suma_f = sumfilas(fila, columna, matrices);
                    imprimir_arreglo(suma_f);
                    
                    break; 
                    
                case 5:
                    System.out.print("Ingrese numero de filas: ");
                    fila = leer.nextInt();
                    System.out.print("Ingrese numero de columnas: ");
                    columna = leer. nextInt();
                    matrices = new int [fila][columna];
                    matrices = llenar_random(fila, columna);
                    System.out.println("Matriz generada");
                    imprimir(matrices);
        
                    System.out.print("Suma de diagonales: ");
                    int []suma_d = sumdiag(fila, columna, matrices);
                    imprimir_arreglo(suma_d);
                    break; 
                    
                case 6:
                    System.out.print("Ingrese numero de filas: ");
                    fila = leer.nextInt();
                    System.out.print("Ingrese numero de columnas: ");
                    columna = leer. nextInt();
                    matrices = new int [fila][columna];
                    matrices = llenar_random(fila, columna);
                    System.out.println("Matriz generada");
                    imprimir(matrices);
        
                    System.out.print("Suma total: ");
                    System.out.print(sumamat(matrices));;
                    break; 
                    
                case 7:
                    System.out.print("Ingrese numero de filas: ");
                    fila = leer.nextInt();
                    System.out.print("Ingrese numero de columnas: ");
                    columna = leer. nextInt();
                    matrices = new int [fila][columna];
                    matrices = llenar_random(fila, columna);
                    System.out.println("Matriz generada");
                    imprimir(matrices);
        
                    System.out.print("Primos en la matriz: ");
                    System.out.print(contprim(matrices));;
                    break; 
                    
                   
                case 8:
                    System.out.print("Ingrese numero de filas: ");
                    fila = leer.nextInt();
                    System.out.print("Ingrese numero de columnas: ");
                    columna = leer. nextInt();
                    matrices = new int [fila][columna];
                    matrices = llenar_random(fila, columna);
                    JOptionPane.showMessageDialog(null,"Matriz generada: \n" + imprimeJoption(matrices));
 
                  break; 

            }
            System.out.println();
            System.out.println();
            System.out.println("* * * * * M E N U * * * * *");
            System.out.println("1. Llenar con Scanner");
            System.out.println("2. Llenar con Random");
            System.out.println("3. Suma de columnas");
            System.out.println("4. Suma de filas");
            System.out.println("5. Suma de diagonales");
            System.out.println("6. Suma de todos los elementos");
            System.out.println("7. Cuantos primos hay?");
            System.out.println("8. Imprimir con JOptionPane");
            System.out.println("9. Salir del programa");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
        }
        
        
        
        
    }
    
    public static int [][] llenar_scanner(int fila, int columna){
        int [][] temporal = new int [fila][columna];
        
        for (int i=0; i <fila; i++){
            for (int j=0; j< columna; j++){
                System.out.println("Ingrese el numero en la posicion " + i + " " + j);
                temporal [i][j] = leer.nextInt(); 
                
            }
        }
        return temporal; 
        
    }
public static int [][] llenar_random(int fila, int columna){
        int [][] temporal = new int [fila][columna];
        
        for (int i=0; i <fila; i++){
            for (int j=0; j< columna; j++){
                
                temporal [i][j] = rand.nextInt(20)+1; 
                
            }
        }
        return temporal; 
        
    }

public static void imprimir(int [][] matriz){
    for (int i=0; i <matriz.length; i++){
            for (int j=0; j< matriz[i].length; j++){
                 System.out.printf("%4d", matriz[i][j]);
            }
        }
            System.out.println("");
    
}

public static void imprimirint (int arreglo [] ){
        for (int i=0;i<arreglo.length; i++){
            System.out.print("[ " + arreglo [i] + " ]"  );
        }
        System.out.println("");
    }


    public static void imprimir_arreglo(int [] size){
        for (int i = 0; i < size.length; i++){
            System.out.print("[" + size[i] + "]");
        }
    }
    
    public static int [] sumacolum (int filas, int columnas, int [][]matriz) {
        int [] res = new int [columnas];
        int cont = 0;
        
        for (int i = 0; i < res.length; i++){
            for (int j = 0; j < matriz.length; j++){
                for (int k = 0; k < matriz[j].length; k++){
                    if (k == cont){
                        res [cont] += matriz[j][k];
                    }
                }
            }
            cont++;
        }
        
        return res;
    }
    
    public static int [] sumdiag (int filas, int columnas, int [][] matriz){
        int [] diag = new int [2];
        
        for (int i=0; i <matriz.length; i++){
            for (int j=0; j< matriz[i].length; j++){
                if (i==j){
                    diag[0] += matriz[i][j];
                    
                }
                else if (i+j==matriz.length-1){
                    diag[1] += matriz[i][j];
                }
            }
        }
        return diag;
    }
    
    public static boolean esprimo(int num){
       int cont=0;
       boolean prim = false;
       for (int i=1; i<= num; i++){
           if (num % i==0){
               cont++;
           }
       }
       if (cont==2){
           prim=true;
       }
       else{
           prim=false;
       }
       return prim;
    }
    
public static int contprim (int [][]matriz){
    int cont =0; 
    for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz[i].length; j++){
            if ((esprimo(matriz[i][j]))==true){
                cont++;
            }
        }
    }return cont;
}

public static int sumamat (int [][] matriz){
    int res = 0;
    for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz[i].length; j++){
            res+=matriz[i][j];
        }
    }return res;
}

public static int [] sumfilas (int filas, int columnas, int [][] matriz){
        int [] fil = new int [filas];
        
        for (int i=0; i <matriz.length; i++){
            int num;
            int suma=0;
            for (int j=0; j< matriz[i].length; j++){
                num=matriz[i][j];
                suma+=num;
                fil[i]=suma;
            }
        }
        return fil;
    }

public static String imprimeJoption (int [][] matriz){
        String imp = "";
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                imp+=matriz[i][j];
                if (j==matriz[i].length-1){
                    imp+="\n";
                }
                else {
                    imp+="  "; 
                }
            }
        }
      return imp;  
    }
        
        
}
    


     

