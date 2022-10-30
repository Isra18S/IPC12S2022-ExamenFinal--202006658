
package examen_final;
import java.util.Scanner;

import java.util.Scanner;

public class Examen_final {
    public static void main(String[] args) {
        System.out.println("Examen final de Jonathan Israel Solis Gallina, Carnet;202006658");
        int ejer;
                int num1= 0;
                int num2= 0;
                boolean salir = false;


                while (!salir){
                     System.out.println("Menu:");
                    System.out.println("1. Ejercicio 1");
                    System.out.println("2. Ejercicio 2");
                    System.out.println("3. Ejercicio 3");
                    System.out.println("5. Salir");
                    System.out.println("Elija el ejercicio que desee ejecutar");
                    
                    Scanner ejercicio = new Scanner(System.in);
                            ejer = ejercicio.nextInt();
                            
                            switch (ejer){
                        case 1:
                            Scanner nu = new Scanner (System.in);
                            System.out.println("Comparacion de numeros");
                            System.out.println("Ingrese el primer numero");
                            num1 = nu.nextInt();
                            System.out.println("Ingrese el segundo numero");
                            num2 = nu.nextInt();
                            
                            if (num1>num2){
                                System.out.println(num1 + " " +"es el numero mas grande");}
                            else if (num1<num2){System.out.println(num2+ " " + "es el numero mas grande");}
                            break;
                            
                        case 2:
                            System.out.println("piramide impar");
                            Scanner piramide = new Scanner (System.in);
                            System.out.println("ingrese el numero impar");
                            int fi = piramide.nextInt();
                            piramide.close();
                            if(fi % 2==0){System.out.println("por favor ingresar un numero impar");}
                            else {
                                for (int alto=1; alto <= fi ; alto++){
                                    for (int espacio=1; espacio <= (fi-alto) ; espacio++){
                                        System.out.println(" ");}
                                    for (int as=1; as <= ((alto*2)-1) ; as++){
                                        System.out.println(" * ");}
                                }
                                
                                    
                            }
                                
                            
                            

                            break;
                        case 3:
                            System.out.println("no c");
                            Scanner pirami = new Scanner (System.in);
                            System.out.println("ingrese el numero impar");
                            int i = pirami.nextInt();
                            pirami.close();
                            System.out.println();
                             for (int alto=1; alto <= i ; alto++){
                                    for (int espacio=1; alto <= i-alto; espacio++){
                                        System.out.println(" ");}
                                    for (int as=1; as <= (alto*2)-1 ; as++){
                                        System.out.println("*");}
                                }
                                System.out.println();
                            break;
                        case 4:
                            salir=true;
                            break; 
                            }}
                   
                }
    

}
        
    
    

