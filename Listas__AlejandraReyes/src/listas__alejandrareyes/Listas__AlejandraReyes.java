
package listas__alejandrareyes;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author aleja
 */
public class Listas__AlejandraReyes {
    static Scanner leer = new Scanner (System.in);
    static Scanner leerS = new Scanner (System.in);
    static Random rand = new Random();
        
 
    public static void main(String[] args) {
        
        
        System.out.println("* * * * * MENU ARRAYLISTS * * * * *");
        System.out.println("1. Libreria");
        System.out.println("2. Laboratorio 8: uso de arraylist");
        System.out.println("3. Laboratorio 9: uso de arraylist");
        System.out.println("4. Laboratorio 10: uso de arraylist");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opcion: ");
        int opcion = leer.nextInt();
        System.out.println();
        
        while (opcion>0 && opcion<5){
            switch(opcion){
                case 1:
                    ArrayList <String> libreria = new ArrayList<>();
                    libreria.add("Harry Potter");
                    libreria.add("El Rey Leon");
                    
                    System.out.println("+ + + + + Libreria + + + + +");
                    System.out.println("1. Agregar");
                    System.out.println("2. Listar");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Actualizar");
                    System.out.println("5. Salir de la libreria");
                    System.out.print("Ingrese una opcion: ");
                    int opcion2 = leer.nextInt();
                    
                    while (opcion2>0 && opcion2<5){
                        switch (opcion2){
                            case 1:
                                System.out.print("Ingrese el nombre del libro a agregar: ");
                                String libro = leerS.nextLine();
                                libreria.add(libro);
                                System.out.println("Se agrego el libro: " + libro + " a la libreria");
                                System.out.println();
                              break; 
                              
                            case 2:
                               System.out.println("Libros: ");
                                for (int i=0; i<libreria.size(); i++){
                                    System.out.println(i + 1 + "." + libreria.get(i));
                                }
                                System.out.println();
                              break;
                              
                            case 3:
                                System.out.println("Libros: ");
                                for (int i=0; i<libreria.size(); i++){
                                    System.out.println(i + 1 + "." + libreria.get(i));
                                }
                                System.out.print("Ingrese el indice del libro que quiera eliminar: ");
                                int indice = leer.nextInt();
                                libreria.remove(indice-1);

                                System.out.println();
                              break;
                              
                            case 4:
                                System.out.println("Libros: ");
                                for (int i=0; i<libreria.size(); i++){
                                    System.out.println(i + 1 + "." + libreria.get(i));
                                }
                                System.out.print("Ingrese el indice del libro que desea actualizar: ");
                                int indice2 = leer.nextInt();

                                System.out.print("Ingrese el texto que desea ingresar en esa posicion: ");
                                String libro2 = leerS.nextLine();
                                libreria.set(indice2-1,libro2);
                              break;
                        }
                        
                        System.out.println("+ + + + + Libreria + + + + +");
                        System.out.println("1. Agregar");
                        System.out.println("2. Listar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Actualizar");
                        System.out.println("5. Salir de la libreria");
                        System.out.print("Ingrese una opcion: ");
                        opcion2 = leer.nextInt();
                    }
                break; 
                
                case 2:
                    //Laboratorio 8: se utilizaron arralists para almacenar coordenas y eliminar estas si estaban ocupadas
                    ArrayList<String> coord = new ArrayList<>();
                    System.out.println("* * * * * M E N U * * * * * ");
                    System.out.println("1. Game of Life");
                    System.out.println("2. Salir del programa");
                    opcion = leer.nextInt();
        
                    while (opcion>0&& opcion<2){
                         int [][] actual= new int [10][10];
                        int [][] nextgen = new int [10][10];
                        
                        System.out.println("Ingrese el numero de rondas: ");
                        int rondas = leer.nextInt();
                        for (int i=0; i<=rondas; i++){
                            llenar(actual,coord);
                            imprimir(actual);
                            Game g = new Game(rondas,actual, nextgen,coord);
                            g.imprimirtab(coord);
                        }
                        
                    }
                   break;
                  
                   
                case 3:
                    /*Laboratorio 9: se utilizaron arraylista para las opciones del JOption y para ir almacenando los distintos tableros dependiendo del movimiento 
                        para despues poder acceder a estos y mostrarlos al usuario.*/
                    Object [] opciones = {"Gusanito", "Salir"};
        
                    int elijio = JOptionPane.showOptionDialog(null, "Lab 9 - Q4 - 2023", "Lab9",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                    switch (elijio) {
                        case 0:
                            String tablero = JOptionPane.showInputDialog("Ingrese las dimensiones del tablero en el formato ancho,alto");

                            String [] dimensiones = tablero.split(",");
                            int filas = Integer.parseInt(dimensiones[0]);
                            int columnas = Integer.parseInt(dimensiones[1]);

                            while (filas<4 || filas >10 || columnas < 4 || columnas>10){
                                JOptionPane.showMessageDialog(null, "Las dimensiones deben estar entre 4 y 10 \n");
                                tablero = JOptionPane.showInputDialog("Ingrese denuevo las dimensiones del tablero en el formato ancho,alto");
                                dimensiones = tablero.split(",");
                                filas = Integer.parseInt(dimensiones[0]);
                                columnas = Integer.parseInt(dimensiones[1]);

                            }
                            Gusanito gus = new Gusanito(filas, columnas);
                        break;
                
                        case 1:
                            System.exit(0);
                        break; 
                    }
                break; 
            
    
                case 4:
                    /*Laboratorio 10: se utilizaron arraylists de objetos tipo personaje y items. En los arraylists de personajes se
                      creo uno para la reserva y  otra para la party. En lo que iban muriendo se eliminaban del arraylist o si pasaban
                      a pelear como cambio, estas listas se alteraban. En los arraylist de items se creo una mochila donde se iban guardando 
                     los distintos items y se quitaban los que se daban a los amigos o se utilizaban en la pelea.*/
                    ArrayList <Items> mochila = new ArrayList<>();
                    ArrayList <Personaje> party = new ArrayList<>();
                    ArrayList <Personaje> reserva = new ArrayList<>();

                     party.add(new Personaje("Sora",300, 300,75,15));
                     party.add(new Personaje("Donald", 150,450,45,10));
                     party.add(new Personaje("Goofy", 450,100,150,50));

                     reserva.add(new Personaje("Mickey",100, 500,150,35));
                     reserva.add(new Personaje("Roxas", 300,300,15,75));
                     reserva.add(new Personaje("Kairi", 200,200,50,15));

                     mochila.add(new Items ("Pocion", 50, 0));
                     mochila.add(new Items ("Ether", 0, 50));
                     mochila.add(new Items ("Elixir", 100, 100));
         
         
                    char resp='s';

                            int cuarto =1;
                            System.out.println("Estas en el cuarto " + cuarto);
                            System.out.println("- - - - - - - - - - - - - - - - - - -");

                            while (cuarto <21|| !party.isEmpty()|| resp=='s' || resp=='S' || resp=='n' || resp=='N'){

                                int ocurre = rand.nextInt(5)+1;
                                if (resp=='n' || resp=='N'){
                                    cuarto++;
                                    System.out.println("Estas en el cuarto " + cuarto);
                                    System.out.println("- - - - - - - - - - - - - - - - - - -");
                                }

                                switch (ocurre){
                                        case 1:
                                            int cantheart = rand.nextInt(3)+1;
                                            System.out.println("Te has encontrado a " + cantheart + " Heartless!");
                                            double vidaheartless = cantheart*75;
                                            double ataqueheartless = cantheart*25;


                                            imprimirpersonajes(party);

                                            while (vidaheartless>0 && !party.isEmpty()){ 
                                                System.out.print("Elije el personaje: ");
                                                int per = leer.nextInt();


                                                System.out.println();
                                                System.out.println("###### M e n u ######");
                                                System.out.println("   1.-  Attack +");
                                                System.out.println("   2.-  Magic  =");
                                                System.out.println("   3.-  Items  $");
                                                System.out.println("   4.-  Party  *");
                                                int op = leer.nextInt();


                                                switch (op){// menu attack
                                                    case 1: 
                                                        System.out.println((party.get(per)).getNombre() + " ataco!");
                                                        System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                        party.get(per).setHP(party.get(per).getHP()-(ataqueheartless*(1-((party.get(per)).getDefensePoints())/100)));
                                                        vidaheartless = vidaheartless-party.get(per).getAttackPoints();
                                                        if (vidaheartless<0){
                                                            vidaheartless=0;
                                                        }
                                                        System.out.println("Los heartless les queda: " + vidaheartless);

                                                        break;

                                                    case 2:
                                                        System.out.println("    1. - Blizzard  50MP - 50DMG");
                                                        System.out.println("    2. - Firaga    25MP - 25DMG");
                                                        System.out.println("    3. - Gravity   75MP - 100DMG");
                                                        int magic = leer.nextInt();
                                                        switch(magic){
                                                            case 1:
                                                                System.out.println( ((party.get(per)).getNombre()) + " uso Blizzard");
                                                                System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                                party.get(per).setMP(party.get(per).getMP()-50);
                                                                vidaheartless = vidaheartless - 50;

                                                                 if (vidaheartless<0){
                                                                    vidaheartless=0;
                                                                     System.out.println("Los heartless les queda: " + vidaheartless);
                                                                }
                                                                 else{
                                                                     System.out.println("Los heartless les queda: " + (vidaheartless));
                                                                 }

                                                                break; 

                                                            case 2:
                                                                System.out.println( ((party.get(per)).getNombre()) + " uso Firaga");
                                                                System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                                party.get(per).setMP(party.get(per).getMP()-25);
                                                                 vidaheartless = vidaheartless - 25;
                                                                if (vidaheartless<0){
                                                                    vidaheartless=0;
                                                                     System.out.println("Los heartless les queda: " + vidaheartless);
                                                                }
                                                                else {
                                                                     System.out.println("Los heartless les queda: " + (vidaheartless));
                                                                }

                                                                break;

                                                            case 3:
                                                                System.out.println( ((party.get(per)).getNombre()) + " uso Gravity");
                                                                System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                                party.get(per).setMP(party.get(per).getMP()-75);
                                                                 vidaheartless = vidaheartless - 100;
                                                                if (vidaheartless<0){
                                                                    vidaheartless=0;
                                                                     System.out.println("Los heartless les queda: " + vidaheartless);
                                                                } else{
                                                                System.out.println("Los heartless les queda: " + (vidaheartless));
                                                                }
                                                                break;

                                                        }

                                                        break; 

                                                    case 3:
                                                        imprimiritems(mochila);
                                                        if (mochila.isEmpty()==false){
                                                            System.out.println("Elige un item: ");
                                                            int it = leer.nextInt();
                                                            if (mochila.get(it).getNombre()=="Pocion"){

                                                                party.get(per).setHP(party.get(per).getHP()+50);
                                                                System.out.println( ((party.get(per)).getNombre()) + " uso Pocion");
                                                                 System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                                 if (vidaheartless<0){
                                                                        vidaheartless=0;
                                                                         System.out.println("Los heartless les queda: " + vidaheartless);
                                                                    } else{
                                                                    System.out.println("Los heartless les queda: " + (vidaheartless));
                                                                    }
                                                                mochila.remove(it);
                                                            }
                                                            else if (mochila.get(it).getNombre()=="Ether"){

                                                                party.get(per).setMP(party.get(per).getMP()+50);
                                                                 System.out.println( ((party.get(per)).getNombre()) + " uso Ether");
                                                                  System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                                  if (vidaheartless<0){
                                                                        vidaheartless=0;
                                                                         System.out.println("Los heartless les queda: " + vidaheartless);
                                                                    } else{
                                                                    System.out.println("Los heartless les queda: " + (vidaheartless));
                                                                    }
                                                                 mochila.remove(it);
                                                            }
                                                            else if (mochila.get(it).getNombre()=="Elixir"){

                                                                party.get(per).setHP(party.get(per).getHP()+100);
                                                                party.get(per).setMP(party.get(per).getMP()+100);
                                                                 System.out.println( ((party.get(per)).getNombre()) + " uso Elixir");
                                                                  System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                                  if (vidaheartless<0){
                                                                        vidaheartless=0;
                                                                         System.out.println("Los heartless les queda: " + vidaheartless);
                                                                    } else{
                                                                    System.out.println("Los heartless les queda: " + (vidaheartless));
                                                                    }
                                                                 mochila.remove(it);
                                                            }
                                                        }
                                                        else if (mochila.isEmpty()==true){
                                                                System.out.println("No tienes items");
                                                        }   


                                                        break; // items

                                                    case 4:
                                                        imprimirpersonajes(reserva);
                                                        System.out.println("Elige por quien cambiar: ");
                                                        int in = leer.nextInt();
                                                        party.remove(per);
                                                        party.add((per),reserva.get(in));
                                                        imprimirpersonajes(party);
                                                        System.out.println("El personaje ha sido cambiado antes del ataque");
                                                        System.out.println("");
                                                        System.out.println("Los heartless les queda: " + (vidaheartless));
                                                        break; // party 


                                                }
                                                if (party.get(per).getHP()==0 || party.get(per).getHP()<0){
                                                                    party.remove(per);
                                                                }
                                                if (vidaheartless == 0 || vidaheartless<0) {
                                                     break;
                                                }
                                                System.out.println();
                                                imprimirpersonajes(party);

                                                }

                                            break;



                                        case 2:
                                            System.out.println("Te has encontrado un cofre que contiene una Pocion!");
                                            mochila.add(new Items ("Pocion", 50, 0));

                                            break;

                                        case 3:
                                            System.out.println("Te has encontrado un cofre que contiene un Ether!");
                                            mochila.add(new Items ("Ether", 0, 50));

                                            break;

                                        case 4:
                                            System.out.println("Te has encontrado un cofre que contiene un Elixir!");
                                            mochila.add(new Items ("Elixir", 100, 100));
                                            break;

                                        case 5:
                                            System.out.println("Te has encontrado a amigos que ocupan tu ayuda y decides darles Items!");
                                            System.out.println("Quedan:");

                                            imprimiritems(mochila);
                                            mochila.remove(0);
                                            if (mochila.isEmpty()==true){
                                                System.out.println("No tienes items");
                                            }
                                            // amigos
                                            break; 

                                }

                                System.out.println("Deseas continuar? ");
                                resp =leer.next().charAt(0);
                                System.out.println();


                            }
                break;
                
                    }
                    System.out.println();
                    System.out.println("* * * * * MENU * * * * *");
                    System.out.println("1. Libreria");
                    System.out.println("2. Laboratorio 8: uso de arraylist");
                    System.out.println("3. Laboratorio 9: uso de arraylist");
                    System.out.println("4. Laboratorio 10: uso de arraylist");
                    System.out.println("5. Salir");
                    System.out.print("Ingrese una opcion: ");
                    opcion = leer.nextInt();
                    
                
                    }
          

}
    public static void llenar (int[][]actual,ArrayList<String> coord){
       
        for (int i=0; i<10; i++){
            for (int j=0; j<10;j++){
                if (i==0 || i==9 || j==0 || j==9){
                     actual[i][j]=0;
                }
                else{
                    actual[i][j]=rand.nextInt(2);
                    if (actual[i][j] == 1) {
                    coord.add(i + ":" + j);
                }
                }
               
                
            }
        }
        
   }
   
   
   public static void imprimir(int [][]matriz){
       for (int i=0; i<10; i++){
            for (int j=0; j<10;j++){
                System.out.print("[" +matriz[i][j]+"]");
              
                
            }
            System.out.println();
        }
   }
   
   public static void imprimirpersonajes (ArrayList<Personaje> lista){
        for(int i=0; i<lista.size(); i++){
            Personaje temp = lista.get(i);
            System.out.println((i) + ". "+ temp.toString());
        }   
    }
    
    
    public static void imprimiritems (ArrayList<Items> lista){
         for(int i=0; i<lista.size(); i++){
            Items temp = lista.get(i);
             System.out.println((i) + ". " + temp.toString());
        }    
    }

}
    

