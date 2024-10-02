package s4_cadenas_alejandra;
import java.util.Scanner;
/*
Integrantes del grupo:
Alejandra Reyes
Hanne Mendoza
Gerardo Hasbum
Mia Elvir
Maria Belen Padilla
 */
public class S4_cadenas_Alejandra {
    static Scanner leer = new Scanner(System.in); 
    static Scanner leerS= new Scanner (System.in);
    public static void main(String[] args) {
        
        System.out.println(" ******** M E N U  ********");
        System.out.println("1. Clave");
        System.out.println("2. Cadena alfanumerica");//ultima diapo de cadenas
        System.out.println("3. Acumulador"); // cualquier que acumule cadenas
        System.out.println("4. Intercalado");
        System.out.println("5. Ordenamiento");
//opcion4 metodo de intercalado
        //opcion 5 metodo que haga el ordenamiento
        System.out.print("Ingrese una opcion: ");
        int  opcion = leer.nextInt();
        
        while (opcion>0 && opcion<6){
                switch (opcion){
                    case 1:
                        System.out.println("Clave: ");
                        String palabra =leer.next().toLowerCase(); // lea palabra y pasela a minusculas
                        String acumulador = " ";
                        int acum = 0; 
                        
                        for (int a=0; a < palabra.length(); a++){
                            char caracter=palabra.charAt(a);
                            int numero = caracter;
                              acumulador +=numero;
                              acum++;
                            if (acum<palabra.length()){ 
                              acumulador += "-";
                            }
                        }
                        System.out.println(acumulador);
                        
                        break;
                        
                    case 2: 
                        
                        char r3 = 's'; 
                        while (r3 == 's' || r3 == 'S'){
                            String alfanumerica, digito; 
                            int numero = 0, cposicion = 1; 
                            int c2 = 0; 
                        
                            System.out.println(" ");
                            System.out.println("Ingrese la cadena alfanumerica: ");
                            alfanumerica = leer.next(); 
                            for (int i = 0; i < alfanumerica.length(); i += 2){
                                char y = alfanumerica.charAt(i); 
                                char x = alfanumerica.charAt(cposicion); 
                                //pasamos caracter a String
                                digito = Character.toString(y); 
                                numero = Integer.parseInt(digito); 

                                for (int j = 0; j < numero; j++){
                                    System.out.print(x);
                                }
                                cposicion+=2; 
                            }

                            System.out.println(" ");
                            System.out.println("Desea seguir? (s/n)");
                            r3 = leer.next().charAt(0); 
                    
                    }
                        
                        break;
                        
                    case 3:
                       
                        String todnomb = "";
                         for (int i=1; i<=5;i++){
                             System.out.println("Ingrese el nombre de uno de los miembros (5): ");
                             String nomb = leerS.nextLine();
                             todnomb =todnomb + nomb;
                             if(i<5){
                                 todnomb +=", ";
                             }
                         }
                         System.out.println("Los miembros son: " + todnomb);
                        break;
                        
                    case 4: 
                         intercalar();
                           
                        break;
                        
                    case 5:
                        System.out.println("Ingrese su cadena: ");
                        leer.nextLine();
                        String cadena = leer.next().toUpperCase();
                        ordenar(cadena);
                        break;
                        
                        
                        
                
        }
                System.out.println();
                System.out.println(" ******** M E N U  ********");
                System.out.println("1. Clave");
                System.out.println("2. Cadena alfanumerica");
                System.out.println("3. Acumulador");
                System.out.println("4. Intercalado");
                System.out.println("5. Ordenamiento");
                System.out.print("Ingrese una opcion: ");
                opcion = leer.nextInt();
        }
        
       
    }
    
    public static void intercalar(){
        System.out.println("Ingrese cadena1: ");
        leer.nextLine();
        String cad1 = leer.nextLine();
        System.out.println("Ingrese cadena 2");
        String cad2 = leer.nextLine();
        char char1, char2;
        String cadint="",sob="";
        
        for (int i=0; i<cad1.length(); i++){
            char1 = cad1.charAt(i);
            
            cadint += (char)char1;
          if (i<cad2.length() -1 && i!=cad1.length()-1){
              char2=cad2.charAt(i);
              cadint += (char)char2;
          }
          if (i==cad1.length()-1){
              if (cad2.length() > cad1.length()){
              for ( int x=i; x < cad2.length(); x++){
                  sob+=cad2.charAt(x);
              }
                  
          }
        }
    }
        System.out.println(cadint+" sobra " + sob);
    }
   
    public static void ordenar(String cadena){
        
        String acum="";
        
        for (int i=65;i<=90; i++){
            for (int j=0; j<cadena.length(); j++){
                char x= cadena.charAt(j);
                        int ascii = (int)x;
                        if (ascii==i){
                            acum += x;
                        }        
            }
        }   
        System.out.println(acum);
                
               
                
                
                
            
        }
           
            
            
            
        }
          
    
    


