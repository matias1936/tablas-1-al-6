//5.1. Diseñar un programa que solicite al usuario que introduzca por teclado 5 números decimales,
//a continuación debe mostrar los números en el mismo orden que se han introducido.
package tablas1al6;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Tablas1al6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        sc.useLocale(Locale.US);
        double t[]=new double[5];
        
        for (int i=0; i<5; i++){
            System.out.println("Introduzca un número:");
            t[i]=sc.nextDouble();
        }
System.out.println("Los números ingresados son:");
for (int i=0; i<5; i++){
    System.out.println(t[i]);
    
}
System.out.println("Otra forma de mostrar la tabla:");
System.out.println(Arrays.toString(t));

    }
    
}
