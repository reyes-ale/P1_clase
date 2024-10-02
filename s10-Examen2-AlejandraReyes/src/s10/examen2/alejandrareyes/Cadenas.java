
package s10.examen2.alejandrareyes;

/**
 *
 * @author aleja
 */
public class Cadenas {
    static String cadena;
    
    public Cadenas (String cadenaa){
        this.cadena=cadenaa;
    
    }
    
    public static boolean vocaseguid (){
        boolean tiene = false;
        for (int i=0; i<cadena.length(); i++){
            if ((cadena.charAt(i)== 'a'|| cadena.charAt(i)== 'e' || cadena.charAt(i)== 'i' || cadena.charAt(i)== 'o' || cadena.charAt(i)== 'u'
                    || cadena.charAt(i)== 'A'|| cadena.charAt(i)== 'E' || cadena.charAt(i)== 'I' || cadena.charAt(i)== 'O' || cadena.charAt(i)== 'U')){
                    tiene = true;
                }
                else {
                    tiene = false;
                }
            }
        return tiene;  
        }
        
       
    
    
}
