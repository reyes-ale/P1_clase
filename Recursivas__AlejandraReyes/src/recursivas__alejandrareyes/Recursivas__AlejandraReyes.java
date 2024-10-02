
package recursivas__alejandrareyes;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Recursivas__AlejandraReyes {
    static Scanner leer = new Scanner (System.in);
    static Random rand = new Random();
    static DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {
        System.out.println("* * * * * MENU * * * * *");
        System.out.println("1. Ejemplos recursivos");
        System.out.println("2. Recursivas utilizadas en el proyecto");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opcion: ");
        int opcion = leer.nextInt();
        
        while (opcion>0 && opcion <3){
        /*metodos recursivos: ocurren cuando un metodo se llama dentro de si mismo y se repite n de veces hasta que cierta condicion se cumpla
          Se conforman por: 
          caso base: es lo que detiene la recursion usualmente es un if y contiene tambien 
          llamada recursiva: es donde el metodo se lllama a si mismo y eventualmente la llamada ayudara a que se pueda alcanzar el caso base y la recursion se detenga*/
    
         switch(opcion){
             case 1:
                //ejemplo 1 -> factorial
                 System.out.println();
                 System.out.println("Factorial --> ");
                System.out.print("Ingrese un numero para calcular su factorial: ");
                int num = leer.nextInt();
                System.out.println("El factorial de " + num + " es: " + recursivafact(num));
                
                 //ejemplo 2 -> suma
                 System.out.println();
                 System.out.println("Suma -->");
                System.out.print("Ingrese un numero para calcular su suma en orden: ");
                int num2 = leer.nextInt();
                System.out.println("La suma es de " + suma(num2));
                
                  //ejemplo 3 -> potencia
                 System.out.println();
                 System.out.println("Potencia -->");
                System.out.print("Ingrese la base: ");
                int base = leer.nextInt();
                 System.out.print("Ingrese el exponente: ");
                int expo = leer.nextInt();
                System.out.println(base + " a la " + expo + " es igual a " + potencia(base, expo));
                
               break;
               
             case 2:
                 //recursivasumalaps -->
                 System.out.println();
                 System.out.println("recursivasumalaps -->");
                 float [][] matriz = new float [5][3];
                 ArrayList <Float> puntajesfinales = new ArrayList ();
                 puntajesfinales.clear();
                
                for(int i = 0 ; i < matriz.length ; i++){
                    for(int j = 0 ; j < matriz[i].length ; j++){                        
                        float nad1 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad2 = 10 + ( 50 - 10 ) * rand.nextFloat();  
                        float nad3 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad4 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad5 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        
                        switch(i){
                            case 0 -> matriz[i][j] += nad1;
                            case 1 -> matriz[i][j] += nad2;
                            case 2 -> matriz[i][j] += nad3;
                            case 3 -> matriz[i][j] += nad4;
                            case 4 -> matriz[i][j] += nad5;
                                
                        }                                               
                    }                    
                }
                
                imprimir(matriz);
                 System.out.println();
                 
                int cont = 1; 
                for (int i = 0; i < 5; i++) {
                    float suma = recursivasumalaps(matriz, i, 0);
                    puntajesfinales.add(suma);
                    
                    System.out.println("Nadador " + cont + ": " + df.format(suma));
                    cont++;
                }// <-- fin de recursivasumalaps
                
                
                 System.out.println();
                 
                 
                //recursivabuscaeliminado -->
                 System.out.println();
                 System.out.println("recursivabuscaeliminado -->");
                imprimirlista(puntajesfinales); 
                 System.out.println();
                int eliminado2 = 0;
                switch(indicedelganador(puntajesfinales, (recursivabuscaeliminado(puntajesfinales, 0, puntajesfinales.get(0))))){
                    case 1 -> eliminado2 = 1;
                    case 2 -> eliminado2 = 2;
                    case 3 -> eliminado2 = 3;
                    case 4 -> eliminado2 = 4;
                    case 5 -> eliminado2 = 5;
                }
                puntajesfinales.remove(eliminado2);
                System.out.println("El eliminado es el nadador: "+ (eliminado2+1));
                 // <-- fin de recursivabuscaeliminado
                
                
                 System.out.println();
                 
                 
                 //recursivabuscaganador -->
                 System.out.println();
                 System.out.println("recursivabuscaganador -->");
                 System.out.println("El ganador es... \n ˗ˏˋ Nadador " + (indicedelganador(puntajesfinales, recursivabuscaganador(puntajesfinales, 0, puntajesfinales.get(0)))+1)+"´ˎ˗  \n" + " con " 
                        + df.format(recursivabuscaganador(puntajesfinales, 0, puntajesfinales.get(0)))+ " segundos");
                 // <-- fin de recursivabuscaganador
                 
                 break;
               
         }
          System.out.println();
          System.out.println("* * * * * MENU * * * * *");
          System.out.println("1. Ejemplos recursivos");
          System.out.println("2. Recursivas utilizadas en el proyecto");
            System.out.println("3. Salir");
          System.out.print("Ingrese una opcion: ");
          opcion = leer.nextInt();

       
        }
    
    }
    
    public static int recursivafact (int num) {
        //EJEMPLO
        if (num == 0 || num == 1) { //<- caso base
            return 1;
        } else {
            
            return num * recursivafact(num - 1);//<- el metodo se llama a si mismo
        }
    }
    
     public static int suma (int num) {
         //EJEMPLO
        if (num == 1) { //<- caso base
            return 1;
        } else {
            return num + suma(num - 1);//<- el metodo se llama a si mismo restando 1 hasta que llegue a 1
        }
    }
     
    public static int potencia(int base, int exponente) {
        //EJEMPLO
        if (exponente == 0) { //<- caso base
            return 1;
        } else {
            return base * potencia(base, exponente - 1);// Llamada recursiva
        }
    }
     
     public static float recursivabuscaganador (ArrayList <Float> puntajes, int cont, float menor){
         //RECURSIVA DE PROYECTO
          /* esta recursiva se encarga de buscar el puntaje menor en un arreglo de puntajes finales en la simulacion de natacion. 
           Se elige el menor como el ganador ya que significa que este competidor se tardo menor en recorrer la piscina, por lo tanto esta cerca de ganar. 
           Se recorre el arreglo y se va sustituyendo numero por numero en lo que se va encontrando un valor menor al que anteriormente era identificado como menor.
        */
        if (cont == puntajes.size()){ //<- caso base: termina el contador ez igual al tamaño del arreglo de puntajes (ya no hay mas elementos a identificar)
            return menor;              
        }
        else{
            if (puntajes.get(cont) < menor){
                  menor = puntajes.get(cont);
            }
              
            return recursivabuscaganador(puntajes, cont+1, menor);/* <- llamada recursiva: con el else de arriba se va identificando si el elemnto actual 
            es menor que menor y si lo es que lo reemplace. Despues se llama al metodo incrementando el contador hasta que este sea igual al tamaño del arreglo*/
        }
           
    }
    
    public static float recursivabuscaeliminado (ArrayList <Float> puntajes, int cont, float mayor){   
        //RECURSIVA DE PROYECTO
        /* esta recursiva se encarga de buscar el puntaje mayor en un arreglo de puntajes finales en la simulacion de natacion. 
           Se elige el mayor como el eliminado ya que significa que este competidor se tardo mas en recorrer la piscina, por lo tanto sale de la competencia. 
           Se recorre el arreglo y se va sustituyendo numero por numero en lo que se va encontrando un valor mayor al que anteriormente era identificado como mayor.
        */
        if (cont == puntajes.size()){//<- caso base: termina el contador ez igual al tamaño del arreglo de puntajes (ya no hay mas elementos a identificar)
            return mayor;              
        }
        else{
            if (puntajes.get(cont) > mayor){
                  mayor = puntajes.get(cont);
            }
              
            return recursivabuscaeliminado(puntajes, cont+1, mayor);/* <- llamada recursiva: con el else de arriba se va identificando si el elemnto actual 
            es mayor que mayor y si lo es que lo reemplace. Despues se llama al metodo incrementando el contador hasta que este sea igual al tamaño del arreglo*/
        }
           
    }  
    
    public static float recursivasumalaps (float [][] matriz, int fila, int col){
        //RECURSIVA DE PROYECTO
        /* esta recursiva se encarga de sumar los puntajes de los nadadores en nuestro proyecto de simulacion de competencia
           ya que los puntajes estan posicionados en las filas de una matriz bidimensional, esta recursiva la 
           recorre horizontalmente por medio de sus columnas y devuelve la suma de los elementos en esta fila o en 
           otras palabras lo puntajes por vuelta de cada nadador
           
        */
        if (col == matriz[fila].length){//<- caso base: termina la recursiva cuando la columna es igual al tamaño da la fila de la matriz
            return 0;              
        }
        else{
            return matriz[fila][col] + recursivasumalaps(matriz, fila, col+1);/* <- llamada recursiva: aqui se suma lo que esta en cierta posicion 
            y llama al metodo pero sumandole 1 a la columna hasta que esta eventualmente sea igual al tamaño de la fila*/
        }           
    }
    
    public static void imprimirlista(ArrayList <Float> puntajes){
        
        for (int i = 0; i < puntajes.size(); i++){            
            System.out.print("[" + df.format(puntajes.get(i)) + "]");
        }
    }
    
    public static int indicedelganador (ArrayList <Float> puntajes, float menoromayor){
     int ind = 0; 
        for (int i = 0; i < puntajes.size(); i++){
        if (puntajes.get(i) == menoromayor){
            ind = i;
        }
    }
        return ind;
    }
    
    public static void imprimir(float[][]matriz){
        for(int i = 0 ; i < matriz.length ; i++){
                    for(int j = 0 ; j < matriz[i].length ; j++){
                        System.out.print(df.format(matriz[i][j])+ " ");                        
                    }
                    System.out.println("");
                }
    }
}
    

