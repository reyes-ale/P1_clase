
package s10.examen2.alejandrareyes;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author aleja
 */
public class Matrices {
    static int [][] matriz;
    
    public Matrices(int [][] matrizz){
         this.matriz=matrizz;
    }
    
    public static int [][] modifica (){
        ArrayList <Integer> numeros = new ArrayList<>();
        
        for (int i=0; i<matriz.length; i++){
           
            for (int j =0; j<matriz[i].length; j++){
                if (i==0 || i==matriz.length ){
                    numeros.add(matriz[i][j]);
                }
                else if (j==0 || j==matriz[i].length){
                    numeros.add(matriz[i][j]);
                }
                
            }
        }
       
        Collections.sort(numeros);
        int cont=0; 
        for (int i=0; i<matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                if (i==0 || i==matriz.length ){
                    matriz[i][j] = numeros.get(cont);
                    cont ++; 
                }
                else if (j==0 || j==matriz[i].length){
                    matriz[i][j] = numeros.get(cont);
                    cont ++;
                }
                
            }
        
        }
       
         return matriz;
       
}
}
    

