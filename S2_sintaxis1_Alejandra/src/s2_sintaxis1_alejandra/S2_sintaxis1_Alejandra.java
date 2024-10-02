
package s2_sintaxis1_alejandra;
import java.util.Scanner;
/**
 *
 * @author Alejandra
**/
public class S2_sintaxis1_Alejandra {
    public static void main(String[] args) {
      int opcion;
      //lectura
      Scanner leer=new Scanner (System.in);
        System.out.println(" ***********  M E N U  ***********");
        System.out.println("1. practica clase 16");
        System.out.println("2. practica clase 17");
        System.out.println("3. practica de operadores logicos");
        System.out.println("4. practica de ciclo con respuesta de usuario ");
        System.out.println("5. practica de ciclo con contador ");
        System.out.println("6. 5 numeros en un rango de 1-100 ");
        System.out.println("7. dados 3 valores (x,y,z) muestre su suma, si 2 son iguales omitalo de la suma ");
        System.out.println("8. terminos de una secuencia ");
        System.out.println("9. si son multiplos sumarlos si no realizar la resta de estos  ");
        System.out.println("10. producto de una base elevado a una potencia ");
        System.out.println("11. es primo o no? ");
        System.out.println("12. separar un numero en sus digitos");
        System.out.println("13. salir del programa");
        System.out.print("Ingrese su opcion ");
        
        
        opcion=leer.nextInt();
        while (opcion<13 && opcion>0){
            switch (opcion){
                case 1:
                    System.out.println("Mi primer programa de sintaxis");
                    System.out.println("Ingrese el Numero entero ");
                    int Numero=leer.nextInt();
                    System.out.println("Ingrese el Numero real ");
                    double Valor =leer.nextDouble();
                    System.out.println("Ingrese la letra ");
                    char Letra=leer.next().charAt(0);
                    //Asignacion
                    //Numero=5
                    //Valor=30.50
                    //Letra='r'
                    //Decisiones
                    if(Numero<0){
                        System.out.println("negativo " +Numero);
                    }
                    else
                        if (Numero==0){
                            System.out.println("cero " + Numero);
                        }
                        else{
                            System.out.println("positivo " +Numero);
                        }
                    
                    System.out.println("Se termino la practica del lunes 16 Valor: " + Valor +" y Letra " +Letra+ " No se usaron");
                    System.out.println("Valor: " + Valor + " y Letra" + Letra + " no se usaron");
              

                case 2: 
                    System.out.println("Uso de residuo ");
                    System.out.println("Ingrese un numero entero");
                    int nuumero = leer.nextInt();
                    if (nuumero%2==0){
                        System.out.println(" PAR " + nuumero );
                    }
                    else{
                        System.out.println(" IMPAR " + nuumero);
                    }
                    break;
              


                case 3:
                    System.out.println("Uso de Operadores Logicos matematicos [ "
                            + ""
                            + "y ] en donde 1 es verdadero, 0 Falso");
                    System.out.println(" p | q");
                    System.out.println(" V | V");
                    System.out.println(" V | F");
                    System.out.println(" F | V");
                    System.out.println(" F | F");
                    System.out.println(" Ingrese el Numero1 entero V=1 o F=0 ");
                    int Numero1=leer.nextInt();
                    System.out.println(" Ingrese el Numero2 entero V=1 o F=0 ");
                    int Numero2 = leer.nextInt();

                    if (Numero1==1 && Numero2==1){
                        System.out.println(" respuesta Verdadera ");
                    }
                    else{
                        if(Numero1==0 && Numero2==0){
                            System.out.println(" respuesta Falsa ");
                        }
                        else
                            if(Numero1==0 || Numero2==1){
                                System.out.println(" respuesta Falsa ");
                            }
                            else
                                if (Numero1==1 || Numero2==0){
                                    System.out.println(" respuesta Falsa ");
                                }
                    }
                    break;
              

                case 4: 
                    char respuesta='s';
                    while(respuesta=='s' || respuesta=='S'){
                        System.out.println(" Ingrese numero1");
                        int numero1=leer.nextInt();
                        System.out.println(" Ingrese numero2");
                        int numero2=leer.nextInt();
                        System.out.println(" Dividendo " + numero1);
                        System.out.println(" Divisor " + numero2);
                        System.out.println(" cociente " + numero1/numero2);
                        System.out.println(" residuo " + numero1%numero2);
                        
                        //sintaxis
                        System.out.println(" Desea continuar ");
                        respuesta=leer.next().charAt(0);
                    }
                    break;
              

                case 5:
                    int c=1;
                    int numero,limite;
                    System.out.println(" Ingrese el numero a multiplicar  ");
                    numero=leer.nextInt();
                    System.out.println(" Ingrese el limite"   );
                    limite=leer.nextInt();
                    while(c<=limite){
                        System.out.println(numero + " * " + c + " = " + numero*c);
                        c=c+1;
                        //c++
                    }
                    break;
              

                case 6:
                    System.out.println(" Ingrese numero1 ");
                    int num1=leer.nextInt();
                    System.out.println(" Ingrese numero2 ");
                    int num2=leer.nextInt();
                    System.out.println(" Ingrese numero3 ");
                    int num3=leer.nextInt();
                    System.out.println(" Ingrese numero4 ");
                    int num4=leer.nextInt();
                    System.out.println(" Ingrese numero5 ");
                    int num5=leer.nextInt();
                   
                    
                    
                    
                    
                    if (num1>=1 && num1<=100 && num2>=1 && num2<=100 && num3>=1 && num3<=100 && num4>=1 && num4<=100 && num5>=1 && num5<=100 && num1<num2 && num1<num3 && num1<num4 && num1<num5){
                        
                        System.out.println(" El numero menor es: " + num1);
                    }
                    else{
                        if (num1>=1 && num1<=100 && num2>=1 && num2<=100 && num3>=1 && num3<=100 && num4>=1 && num4<=100 && num5>=1 && num5<=100 && num2<num1 && num2<num3 && num2<num4 && num2<num5){
                            
                            System.out.println(" El numero menor es: " + num2);
                        }
                        else{
                            if (num1>=1 && num1<=100 && num2>=1 && num2<=100 && num3>=1 && num3<=100 && num4>=1 && num4<=100 && num5>=1 && num5<=100 && num3<num2 && num3<num1 && num3<num4 && num3<num5){
                                
                                System.out.println(" El numero menor es: " + num3);
                            }
                            else{
                                if (num1>=1 && num1<=100 && num2>=1 && num2<=100 && num3>=1 && num3<=100 && num4>=1 && num4<=100 && num5>=1 && num5<=100 && num4<num2 && num4<num3 && num4<num1 && num4<num5){
                                    
                                    System.out.println(" El numero menor es: " + num4);
                                }
                                else{
                                    if (num1>=1 && num1<=100 && num2>=1 && num2<=100 && num3>=1 && num3<=100 && num4>=1 && num4<=100 && num5>=1 && num5<=100 && num5<num2 && num5<num3 && num5<num1 && num5<num4){
                                        System.out.println(" El numero menor es: " + num5);
                                    }
                                    
                                }
                            }
                            
                        }
                    }
            
                        break;
                    
              
                case 7:
                    int suma;
                    System.out.println(" Ingrese el primer valor: ");
                    int x = leer.nextInt();
                    System.out.println(" Ingrese el segundo valor: ");
                    int y = leer.nextInt();
                    System.out.println(" Ingrese el tercer valor: ");
                    int z = leer.nextInt();

                    if (x==y){
                        suma = z;
                        System.out.print("La suma es: " + suma);
                    }
                    else{
                        if (y==z){
                            suma= x;
                            System.out.println("La suma es: " + suma);
                        }
                        else{
                            if (x==z){
                                suma=y;
                                System.out.println("La suma es: " + suma);
                            }
                            else{
                                suma=x+y+z;
                                System.out.println("La suma es: " + suma);

                            }
                        }
                    }
                    break;
              
                    

                case 8:
                    System.out.println(" Ingrese la cantidad de terminos que desea mostrar: ");
                    int cant=leer.nextInt();
                    int veces=0;
                    int inicio=-3;
                    int inicio2=4;
                    
                    
                    while (veces<=cant){
                        System.out.println(inicio);
                        System.out.println(inicio2);
                        inicio=inicio+1;
                        inicio2=inicio2*2;
                        
                        
                        veces=veces+1;
                    }
                    break;
              

                case 9:
                    System.out.println("Ingrese el primer numero: ");
                    int num_1=leer.nextInt();
                    System.out.println(" Ingrese el segundo numero: ");
                    int num_2=leer.nextInt();
                   
                  if (num_1%num_2==0 || num_2%num_1==num_1 || num_2%num_1==0 || num_1%num_2==num_2){
                      
                      suma=num_1+num_2;
                      System.out.println(" La suma de los numeros es: " + suma);
                  }
                  else{
                      suma=num_1-num_2;
                      System.out.println(" La diferencia de los numeros es: " + suma);
                  }
                  break;
              

                case 10:
                    System.out.print(" Ingrese la base: ");
                    int base=leer.nextInt();
                    System.out.print(" Ingrese el exponente: ");
                    int expo=leer.nextInt();
                    int prod=1;
                    int lim=1;
                    while (lim<=expo){
                        prod=prod*base;
                        lim=lim+1;
                    }
                    System.out.println(" El producto de " + base + " elevado a la " + expo+ " es igual a " +prod );
                    break;

                case 11:
                    int contprim=0;
                    int contnoprim=0;
                    int contfac=0;
                    int limi=1;
                    char res='s';
                    while (res=='s' || res=='S'){
                        System.out.println(" Ingrese el numero que desea evaluar: ");
                        int nummm=leer.nextInt();
                        while (limi<=nummm){
                            if (nummm%limi==0){
                                contfac=contfac+1;
                            }
                            limi=limi+1;
                        }

                        if (contfac>2){
                            System.out.println(nummm +" no es primo ");
                            contnoprim=contnoprim+1;
                        }
                        else{
                            if (contfac<=2){
                                System.out.println(nummm + " es primo ");
                                contprim=contprim+1;
                            }
                        }
                        
                        System.out.println(" Desea ingresar mas numeros [s/n]: ");
                        res=leer.next().charAt(0);
                    }
                    System.out.println(" Cantidad de primos: " + contprim);
                    System.out.println(" Cantidad de no primos: " + contnoprim);
                    break;

                case 12:
                    System.out.println(" Ingrese un numero de 5 digitos: ");
                    int numm=leer.nextInt();
                    int mod1=numm%10;
                    int nuvnum1=numm/10;
                    int mod2=nuvnum1%10;
                    int nuvnum2=nuvnum1/10;
                    int mod3=nuvnum2%10;
                    int nuvnum3=nuvnum2/10;
                    int mod4=nuvnum3%10;
                    int nuvnum4=nuvnum3/10;
                    int mod5=nuvnum4%10;

                    System.out.println(mod1 + " unidades");
                    System.out.println(mod2 + " décimas");
                    System.out.println(mod3 + " centésimas");
                    System.out.println(mod4 + " milésimas");
                    System.out.println(mod5 + " decenas de milésimas");
                    break;
              
        }// fin del switch
                
            

      //Repito el menu para leer denuevo la opcion 
        System.out.println(" ***********  M E N U  ***********");
        System.out.println("1. practica clase 16");
        System.out.println("2. practica clase 17");
        System.out.println("3. practica de operadores logicos");
        System.out.println("4. practica de ciclo con respuesta de usuario");
        System.out.println("5. practica de ciclo con contador ");
        System.out.println("6. 5 numeros en un rango de 1-100 ");
        System.out.println("7. dados 3 valores (x,y,z) muestre su suma, si 2 son iguales omitalo de la suma ");
        System.out.println("8. terminos de una secuencia ");
        System.out.println("9. si son multiplos sumarlos si no realizar la resta de estos  ");
        System.out.println("10. producto de una base elevado a una potencia ");
        System.out.println("11. es primo o no? ");
        System.out.println("12. separar un numero en sus digitos");
        System.out.println("13. salir del programa");
        System.out.print("Ingrese su opcion ");
        
       opcion=leer.nextInt();
      
       
        }//fin del while
          
    }//fin del main
    
    }//fin de la clase







