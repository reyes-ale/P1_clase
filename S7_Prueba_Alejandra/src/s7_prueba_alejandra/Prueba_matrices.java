package s7_prueba_alejandra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Prueba_matrices {
    static Scanner leer = new Scanner (System.in);
    static Random random = new Random ();
    //Constructor
    //Get y Set
    
    int size;// variable de instancia
    String palabra;
    
    public Prueba_matrices(int size){// Constructor
        this.size=size;
    }
    
    public Prueba_matrices(int size, String palabra){
        this.size=size;
        this.palabra=palabra;
    }
    
    public int getSize (){//Get de la variable de instancia
        return size;   
    }
    
    public void setSize(int size){//Set de la variable de instancia
        this.size = size;
    }
    
    public static int [][] llenar (int [][] matriz){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length;j++){
                matriz[i][j]= random.nextInt(9)+1;
            }
        }
        return matriz;
}
    public static void imprimir (int [][]matriz){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length;j++){
                System.out.print(matriz [i][j] + "  ");
            }
            System.out.println();
        }
        
    }
    public static void imprimirar (int [] arreglo){
        
            for (int j=0; j<arreglo.length;j++){
                System.out.print("[" + arreglo[j] + "]");
            }
           
    }
        
    public static boolean estaono(int [][] matriz, int num){
        boolean esta = true;
        int cont=0;
        int cont2=0;
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length;j++){
                if (matriz[i][j]==num){
                   cont++;
                    
                }
                else if(matriz[i][j]!=num){
                    cont = cont+0;
                    
                }
               
            }
        }
        if (cont>0){
            esta=true;
        }
        else if (cont==0){
            esta=false;
        }
       
        return esta; 
    }
    
    public static void imprimex (boolean esta, int [][]matriz,int num){
        if (esta==true){
            for (int i=0; i<matriz.length; i++){
                for (int j=0; j<matriz.length;j++){
                    if ((i+j==matriz.length-1) || (i==j)){
                        matriz[i][j]= num;
                    }
                    System.out.print(matriz [i][j] + "  ");
                }
                System.out.println();
            }
        }
         else if (esta==false){
            for (int i=0; i<matriz.length; i++){
                for (int j=0; j<matriz.length;j++){
                    if ((i+j==matriz.length-1) || (i==j)){
                        matriz[i][j]= -1;
                    } 
                    System.out.print(matriz [i][j] + "  ");
                }
                System.out.println();
                    }
        
        }
    }
    
   
    public static int [] arregloss (int [][] matriz, int num){
        int cont=0;
        
        for (int i=0; i<matriz.length; i++){
                for (int j=0; j<matriz.length;j++){
                    if (i!=j && i+j!=matriz.length-1){
                        cont++;
                    }
                    else if (matriz[i][j]==num){
                        cont = cont+0;
                    }
                    
                }
        }
        int [] arreglo = new int [cont];
        
        int ind = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i!=j && i+j!=matriz.length-1) {
                    arreglo[ind] = matriz[i][j];
                 ind++;
                }
            }
        }
        
        
         
  return arreglo; 
}
}
