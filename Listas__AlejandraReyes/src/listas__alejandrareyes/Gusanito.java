package listas__alejandrareyes;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author aleja
 */


public class Gusanito {
    int filmanzana;
    int colmanzana;
    static int filgus;
    static int colgus;
    static char [][] tablero; 
    private int indact = 0;
    static ArrayList <char[][]> tableros = new ArrayList<>();
    
    static ArrayList <String> instrucciones;
    
    public int getFilmanzana() {
        return filmanzana;
    }

    public int getColmanzana() {
        return colmanzana;
    }

    public int getFilgus() {
        return filgus;
    }

    public int getColgus() {
        return colgus;
    }

    public ArrayList<String> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(ArrayList<String> instrucciones) {
        this.instrucciones = instrucciones;
    }


    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }
    
    
    public Gusanito(int filas, int columnas){
        
        Random rand = new Random ();
        tablero = new char [filas][columnas]; 
        filmanzana = rand.nextInt(filas-1);
        colmanzana = rand.nextInt(columnas-1);
        filgus = rand.nextInt(filas-1);
        colgus = rand.nextInt(columnas-1);
        int numobs = rand.nextInt((columnas-filas)+1)+filas;
       
        int cont=0;
            for (int i=0; i<tablero.length; i++){
                for (int j=0; j<tablero[i].length; j++){
                    tablero[i][j]='['+   + ']';
                    while (filmanzana==filgus || colmanzana ==colgus){
                            filmanzana = rand.nextInt(filas-1);
                            colmanzana = rand.nextInt(columnas-1);
                        }
                    if(i==filmanzana && j==colmanzana){
                        tablero[i][j]='Ó';
                    }
                    while (filgus==filmanzana || colgus ==colmanzana){
                            filmanzana = rand.nextInt(filas-1);
                            colmanzana = rand.nextInt(columnas-1);
                        }
                    if(i==filgus && j==colgus){
                        tablero[i][j]='§';
                    }
                }
            }
    
            while (cont<=numobs){
                        int filobs = rand.nextInt(filas-1);
                        int colobs = rand.nextInt(columnas-1);
                        while (filobs==filmanzana || filobs ==filgus || colobs==colmanzana || colobs==colgus){
                            filobs = rand.nextInt(filas-1);
                            colobs = rand.nextInt(columnas-1);
                        }
                        tablero[filobs][colobs]='#';
                        cont++;
            }
        
            String ingresa = JOptionPane.showInputDialog("Mapa \n" + imprimeJoption(tablero) + "\n 1. Ingresar instruccion \n 2. Ejecutar instrucciones");
            int num = Integer.parseInt(ingresa);
            //instrucciones.add(ingresa);
            
        
            while (num>0 && num<3){
                if (num==1){
                    
                        String opcion = JOptionPane.showInputDialog("Mapa \n" + imprimeJoption(tablero) +"\n Ingrese la instruccion de la forma magnitudDIRECCION (ej. 2UP)");
                     
                        int finalnum = 0;
                        for (int i=0; i<opcion.length(); i++){
                            if (Character.isDigit(opcion.charAt(i))){
                                finalnum++;
                            }
                        }
                        String movistring = opcion.substring(0, finalnum);
                        String donde = opcion.substring(finalnum,opcion.length());
                        int movimientos = Integer.parseInt(movistring);

                        for (int i = 0; i < tablero.length; i++) {
                            for (int j = 0; j < tablero[i].length; j++) {
                                if (i == filgus && j == colgus) {
                                    tablero[i][j] = ' ';
                                }
                            }
                        }

                        for (int k = 0; k < donde.length()-1; k++) {
                            if (donde.charAt(0) == 'U' || donde.charAt(0) == 'u') {
                                filgus = filgus - movimientos;
                            } 
                            else if (donde.charAt(0) == 'D' || donde.charAt(0) == 'd') {
                                filgus = filgus + movimientos;
                            } 
                            else if (donde.charAt(0) == 'R' || donde.charAt(0) == 'r') {
                                colgus = colgus + movimientos;
                            } 
                            else if (donde.charAt(0) == 'L' || donde.charAt(0) == 'l') {
                                colgus = colgus - movimientos;
                            }
                             tablero[filgus][colgus] = '§';
                        }
                        
                     tableros.add(Guardatab(tablero));
                     
                    imprimeJoption(tablero);
                    String ing = JOptionPane.showInputDialog("Mapa \n" + imprimeJoption(tablero) + "\n Mostrando \n 1. Ver siguiente paso \n 2. Ver paso anterior \n 3. Seleccionar paso \n 4. Volver al menu");

                    //instrucciones.add(ingresa);



                    //separar en num (movimientos) y primer char(letra para identificar)
                    //instrucciones.add(opcion);
                    // vsalidar que no se salga
                    //lo de mostrar 0 (pos de tab
                    // tablero antes
                    //tablero despues
                    //elegir tablero que quiero
                    
                    

                }
                else if(num==2){
                    while (num>0 && num<3){
                    String ingresa2 = JOptionPane.showInputDialog("Mapa \n" + imprimeJoption(tablero) + "\n 1. Ver siguiente paso \n 2. Ver paso anterior \n 3. Seleccionar paso \n 4. Volver al menu ");
                    int num2 = Integer.parseInt(ingresa2);
                    
                        while (num2>0 && num2<3){
                            switch (num2){
                            case 1:
                                mostrarPaso(num-1);
                                break;
                            case 2:
                                mostrarPaso(num+1);
                                break;
                            case 3:
                                ingresa2 = JOptionPane.showInputDialog("Mapa \n" + imprimeJoption(tablero) + "\n Ingrese el paso que desea");
                                num = Integer.parseInt(ingresa2);
                                mostrarPaso(num);
                                break;
                            }
                        }


                    }
                }
                
                
                ingresa = JOptionPane.showInputDialog("Mapa \n" + imprimeJoption(tablero) + "\n 1. Ingresar instruccion \n 2. Ejecutar instrucciones");
                num = Integer.parseInt(ingresa);
            }
    
    }
            
     
    
    public static String imprimeJoption (char [][] matriz){
        String imp = "";
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if (j==matriz[i].length-1){
                    imp+="\n";
                }
                else {
                    imp+="[ " + matriz[i][j] +" ]" + "  "; 
                }
            }
        }
      return imp;  
    }
    
    public static String mostrarPaso (int paso){
        String mensaje="";
        tableros.indexOf(paso);
        if(paso>tableros.size()){
            JOptionPane.showMessageDialog(null, "Paso no valido");
              
        }
        int tempfilgus = filgus;
         int tempcolgus = colgus;
        for (int i=0; i<tableros.size(); i++){
            for (int j=0; j< tableros.size();j++){
                if(tableros.indexOf(i)==tableros.indexOf(paso)){
                    mensaje="Mostrando" + paso;
            }
                 if (tempfilgus < 0 || tempfilgus > tableros.size()) {
                                int x = colgus-1;
                                String ingresa2 = JOptionPane.showInputDialog(imprimeJoption(tablero) + "Te pasastes! x:"  + x +"\n 1. Ver siguiente paso \n 2. Ver paso anterior \n 3. Seleccionar paso \n 4. Volver al menu ");
                                int num2 = Integer.parseInt(ingresa2);
                                break;
                }
                            /*else if (tempcolgus < 0 || tempcolgus > tableros[i][j].size()){
                                int y = filas-1;
                                String ingresa2 = JOptionPane.showInputDialog( imprimeJoption(tablero) + "Te pasastes! y:"  + y + "\n 1. Ver siguiente paso \n 2. Ver paso anterior \n 3. Seleccionar paso \n 4. Volver al menu ");
                         break;
                        }*/
                            else {
                                filgus = tempfilgus;
                                colgus = tempcolgus;
                                tablero[filgus][colgus] = '§';
                                imprimeJoption(tablero);
                                String ing = JOptionPane.showInputDialog("Mapa \n" + imprimeJoption(tablero) + "\n Mostrando \n 1. Ver siguiente paso \n 2. Ver paso anterior \n 3. Seleccionar paso \n 4. Volver al menu");
                            }
            }
        }
        
        
        return mensaje;
    }
        
    
    //paso-1 )+1 ind
    
    private char[][] Guardatab (char[][] tablero) {
        char[][] tablerotemp = new char[tablero.length][tablero[0].length];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablerotemp[i][j] = tablero[i][j];
            }
        }
        return tablerotemp;
    }
    
    }
    

