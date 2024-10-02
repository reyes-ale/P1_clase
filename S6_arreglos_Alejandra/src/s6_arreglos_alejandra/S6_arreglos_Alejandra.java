package s6_arreglos_alejandra;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author aleja
 */
public class S6_arreglos_Alejandra {
    static Scanner leer=new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
       
        System.out.println(" * * * * * MENU * * * * * ");
        System.out.println("1. Suma de elementos");
        System.out.println("2. Elemento menor");
        System.out.println("3. Suma paralela");
        System.out.println("4. Imprimir con JOptionPane");
        System.out.println("5. Sub menu");
        System.out.print("Ingrese una opcion: ");
        int opcion = leer.nextInt();
        
        
        while (opcion>0 && opcion<6){
            switch (opcion){
                case 1:
                    System.out.print("Ingrese el tamaño para el arreglo: ");
                    int size =leer.nextInt();
                    int numeros [] = new int[size];

                    System.out.print("Desea llenarlo con scanner (1) o con random (2): ");
                    int opcion2 = leer.nextInt();


                    switch (opcion2){
                        case 1:
                            numeros = leer_scanner(size);
                         break;

                        case 2:
                            numeros=leer_random(size);
                         break;
                    }
                    
                    imprimir(numeros);
                    System.out.println("La suma es: " + suma(numeros));
                    
                   break;
                    
                    
                case 2:
                    System.out.print("Ingrese el tamaño para el arreglo: ");
                    size =leer.nextInt();
                    int numeross [];
                    numeross = new int[size];

                    System.out.print("Desea llenarlo con scanner (1) o con random (2): ");
                    opcion2 = leer.nextInt();


                    switch (opcion2){
                        case 1:
                            numeross = leer_scanner(size);
                        break;

                        case 2:
                            numeross=leer_random(size);
                        break;
                    }  
                    
                    imprimir(numeross);
                    System.out.println("El menor es: " + menor(numeross));
                    
                    break;
                    
                case 3:
                    System.out.print("Ingrese el tamaño para el arreglo: ");
                    size =leer.nextInt();
                    numeros = new int[size]; 
                    int [] numeros2 = new int[size];
                    numeros2=leer_random(size);
                    numeros=leer_random(size);
                    
                    int [] suma = new int[size];
                    suma=sumaDos(numeros, numeros2);
                    
                    System.out.println("Arreglo 1");
                    imprimir(numeros);
                    System.out.println("Arreglo 2");
                    imprimir(numeros2);
                    
                    
                    System.out.println("Suma de los arreglos");
                    imprimir (suma);
                    
                  break;   
                  
                case 4:
                    System.out.print("Ingrese el tamaño para el arreglo: ");
                    size =leer.nextInt();
                                
                    numeros = new int[size];

                    System.out.print("Desea llenarlo con scanner (1) o con random (2): ");
                    opcion2 = leer.nextInt();
                    switch (opcion2){
                        case 1:
                            numeros = leer_scanner(size);
                        break;

                        case 2:
                            numeros=leer_random(size);
                        break;
                    }
                    
                    JOptionPane.showMessageDialog(null,imprimeJoption(numeros));
                    
                    
                                
                    break;
                    
                  
                case 5:
                    System.out.println();
                    System.out.println(" * * * * * SUB-MENU * * * * * ");
                    System.out.println("1. Conjuntos");
                    System.out.println("2. ¿Cuantos primos tienes?");
                    System.out.println("3. Ordenamiento ");
                    System.out.println("4. Busqueda ");
                    System.out.println("5. Salir del submenu");
                    System.out.print("Ingrese una opcion: ");
                    int opcionsub = leer.nextInt();
                    
                    while (opcionsub>0 && opcionsub<5){
                        switch(opcionsub){
                            case 1:
                                System.out.print("Size SET1: ");
                                int size1=leer.nextInt();
                                System.out.print("Size SET2: ");
                                int size2=leer.nextInt();


                                System.out.println("Conjuntos generados:");
                                System.out.print("SET1: " );
                                char [] set1 = genRandCharArray(size1);
                                imprimirchar(set1);

                                System.out.print("SET2: " );
                                char [] set2 = genRandCharArray(size2);
                                imprimirchar(set2);
                                System.out.println();
                                System.out.println("Operaciones");
                                System.out.println("1. Interseccion");
                                System.out.println("2. Diferencia");
                                System.out.print("Ingrese una opcion: ");
                                int op = leer.nextInt();

                                switch(op){
                                    case 1: 
                                        char [] inter = intersection(set1, set2);
                                        printCharArray(inter);
                                        break; 

                                    case 2:
                                        char [] dif = new char [set1.length];
                                        dif = difference(set1, set2);
                                        printCharArray(dif);
                                        break; 
                                }
                                break;
                                
                            case 2:
                                System.out.print("Ingrese el tamaño del arreglo: ");
                                int tam = leer.nextInt();
                                System.out.print("Ingrese el limite inferior: ");
                                int inf = leer.nextInt();
                                System.out.print("Ingrese el limite superior: ");
                                int sup = leer.nextInt();


                                while (tam<1){
                                    System.out.println("EL tamaño del arreglo tiene que ser mayor a 1");
                                    System.out.print("Ingrese el tamaño del arreglo denuevo: ");
                                    tam = leer.nextInt();
                                 }
                                while (sup<inf){
                                    System.out.println("El limite superior no puede ser menor que el inferior");
                                    System.out.print("Ingrese el limite inferior denuevo: ");
                                   inf = leer.nextInt();
                                   System.out.print("Ingrese el limite superior denuevo: ");
                                   sup = leer.nextInt();
                                 }

                                int [] arreglo = genRandArray(tam,inf,sup);

                                System.out.print("Arreglo generado: ");
                                imprimirint(arreglo);

                                int [] arreglo2 = getTotalPrimeCount(arreglo);
                                System.out.print("No. divisores primos: ");
                                imprimirint(arreglo2);
                                break;
                                
                            case 3:
                                System.out.print("Ingrese el tamaño para el arreglo: ");
                                size =leer.nextInt();
                                
                                numeros = new int[size];

                                System.out.print("Desea llenarlo con scanner (1) o con random (2): ");
                                opcion2 = leer.nextInt();
                                switch (opcion2){
                                    case 1:
                                        numeros = leer_scanner(size);
                                     break;

                                    case 2:
                                        numeros=leer_random(size);
                                     break;
                                }
                                imprimir(numeros);
                                System.out.println("Cadena ordenada:");
                                Ordenamiento(numeros);
                                imprimir(numeros);
                                
                                break;
                                
                            case 4:
                                System.out.print("Ingrese el tamaño para el arreglo: ");
                                size =leer.nextInt();
                                numeros = new int[size];

                                System.out.print("Desea llenarlo con scanner (1) o con random (2): ");
                                opcion2 = leer.nextInt();

                                switch (opcion2){
                                    case 1:
                                        numeros = leer_scanner(size);
                                    break;

                                    case 2:
                                        numeros=leer_random(size);
                                    break;
                                }
                                imprimir(numeros);
                                
                                System.out.print("Ingrese el elemento que desea buscar en el arreglo (int):");
                                int elemento=leer.nextInt();
                                
                                    if ((Busqueda(numeros, elemento))==1){
                                        
                                        
                                        System.out.println(elemento + " esta en el arreglo");
                                        System.out.println("Esta en la posicion: " + Busqueda2(numeros, elemento));
                                    }
                                      else if ((Busqueda(numeros, elemento))==2){
                                            System.out.println(elemento + " no esta en el arreglo");
                                        }
                                break;
                        }
                        System.out.println();
                        System.out.println(" * * * * * SUB-MENU * * * * * ");
                        System.out.println("1. Conjuntos");
                        System.out.println("2. ¿Cuantos primos tienes?");
                        System.out.println("3. Ordenamiento ");
                        System.out.println("4. Busqueda ");
                        System.out.println("5. Salir del submenu");
                        System.out.print("Ingrese una opcion: ");
                        opcionsub = leer.nextInt();
                    }
                    break;
                    
            }
                    
            System.out.println();  
            System.out.println(" * * * * * MENU * * * * * ");
            System.out.println("1. Suma de elementos");
            System.out.println("2. Elemento menor");
            System.out.println("3. Suma paralela");
            System.out.println("4. Imprimir con JOptionPane");
            System.out.println("5. Sub menu");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
    
                
                    
            }
            
        
    }//fin del main
    
    
    public static int [] leer_scanner(int size){
        int temporal[] = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("Ingresar posicion " + i);
            temporal[i] = leer.nextInt();
        }
       return temporal;
    }
    
    public static int [] leer_random (int size){
        int temporal[] = new int[size];
        for (int i=0; i<size; i++){
            temporal[i] = random.nextInt(20)+1;
        }
       return temporal;
    }
    
    public static void imprimir (int arreglo [] ){
        for (int i=0;i<arreglo.length; i++){
            System.out.println("pos " + i + " = " + arreglo [i]);
        }
        System.out.println("");
    }
    
    public static void imprimirint (int arreglo [] ){
        for (int i=0;i<arreglo.length; i++){
            System.out.print("[" + arreglo [i] + "]" );
        }
        System.out.println("");
    }
    
    //recibe como parametro un arreglo y retorna la suma de sus elementos
    public static int suma (int [] arreglo){
        int suma = 0;
        
        //recorrer areglos
        for (int i=0; i<arreglo.length; i++){
            suma += arreglo[i];
        }
              
        return suma;
    }
    
    public static int menor (int [] arreglo){
        int menor=arreglo[0];
          for (int i=0; i<arreglo.length; i++){ 
              
              if (arreglo[i]<menor){
                  menor=arreglo[i];
              }
          }
          return menor;
    }
    
    public static int [] sumaDos (int [] a, int [] b ){
        int [] temporal = new int [a.length];
        for (int i=0; i<temporal.length;i++){
                temporal [i] = a[i] + b[i];   
        }
        
        return temporal;
    }
     
    public static int Busqueda (int [] arreglo,int element){
        int esta=0;
        for (int i=0; i<arreglo.length; i++){
            if (arreglo [i]==element){
                esta=1;
            }
            else if (arreglo [i]!=element){
                esta=2;
            }
        }
        return esta;
    }
    public static int Busqueda2 (int [] arreglo,int element){
        int esta=0;
        for (int i=0; i<arreglo.length; i++){
            if (arreglo [i]==element){
                return i;
                
            }
            else if (arreglo [i]!=element){
                esta=2;
            }
        }
        return esta;
    }
    
    public static int [] Ordenamiento (int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
        int menor = arreglo[i];

        for (int j = i ; j < arreglo.length; j++) {
            if (arreglo[j] < menor) {
                int temp = arreglo[j];
                arreglo[j] = menor;
                menor = temp;
            }
        }

        arreglo[i] = menor;
    }
        
         return arreglo;
    }
    
    public static char [] genRandCharArray(int size){
          char [] carac = new char [size];
          for (int i=0; i<size;i++){
              int num = random.nextInt(9)+65;
              char ascii = (char)num;
              carac [i]= ascii;
           }
          return carac;
    }
    
    public static void printCharArray(char[] arreglo) {
        
    for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == (char)0)continue;
            
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println();
    }
    
    public static char [] intersection (char [] set1, char[] set2){
        int menor= 0;
        
        if (set1.length>set2.length){
            menor = set2.length;
        }  
        else if(set2.length>set1.length){
            menor = set1.length;
        }
        char [] arreglo2= new char [menor];
       
        int resIdx = 0;
        for (int i = 0; i < set1.length; i++) {
            boolean added = false;
            for (int j = 0; j < set2.length; j++) {
                if (set1[i] == set2[j] && added==false) {
                    arreglo2[resIdx++] = set1[i];
                    set2[j] = (char) 0;
                    added = true;
                } 
                 else if (set1[i] == set2[j] && added) {
                     set2[j] = (char) 0;
                }
            }
        }
        
        while (resIdx < arreglo2.length - 1) {
            arreglo2[resIdx++] = (char)0;
        }

        return arreglo2;
    }
    
    public static char[] difference (char []set1, char []set2){
        for (int i = 0; i < set2.length; i++) {
            for (int j = 0; j < set1.length; j++) {
                
                if (set2[i] == set1[j]) {
                    set1[j] = (char)0;
                }
            }
        }
        
        for (int i = 0; i < set1.length; i++) {
            for (int j = 0; j < set1.length; j++) {
                
                if (i != j && set1[i] == set1[j])
                    set1[j] = (char)0;
            }
        }
        return set1;
    }
    
    
    public static int [] genRandArray (int tam, int inf, int sup){
        int [] arreglo = new int [tam];
        int inf2= (sup-inf) + 1;
        
        for (int i=0; i<tam; i++){
            arreglo[i] = random.nextInt(inf2)+inf;
        }
        
       return arreglo; 
    }
    
    public static boolean isPrime (int num){
        boolean primo=false;
        if (num>0){
            int contfac=0;
            for (int i=1; i<=num; i++){
              if (num%i==0){
                  contfac=contfac+1;
                }         
            }
            if (contfac==2){
                primo=true;
            }
            else{
                primo=false;
            }
        }   
        
        return primo;
    }
    
    public static int countPrimeFactors (int num){
            int contfac=0;
            for (int i=1; i<=num; i++){
                if (isPrime(i)&& num%i==0){
                    contfac=contfac+1;
                }   
            }
            
        return contfac;
    }
    
    public static int [] getTotalPrimeCount (int [] arreglo){
        int[] arreglo2= new int [arreglo.length];
        for (int i=0; i<arreglo.length;i++){
            int num = arreglo[i];
            for (int j=0;j<arreglo2.length;j++){
                arreglo2[i]=countPrimeFactors(num);
            }
        }
        
        return arreglo2;
    }
    
    public static void imprimirchar (char arreglo [] ){
        for (int i=0;i<arreglo.length; i++){
            System.out.print("[" + arreglo [i] + "]" );
        }
        System.out.println("");
    }
    
    public static String imprimeJoption (int [] arreglo){
        String imp = "";
        
        for (int i=0; i < arreglo.length; i++){
                imp+=arreglo[i];
                
                if (i==arreglo.length-1){
                    imp += " ";
                }
                else{
                    imp += " - ";
                }
            }
        
      return imp;  
    }
    
    
}// fin de la clase


