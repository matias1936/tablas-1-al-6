//Escribir una aplicación que solicite al usuario cuántos números desea introducir.
//A continuación, se introducirá por teclado esa cantidad de números enteros,
//y por último, los mostrará en el orden inverso al introducido.
package tablas1al6;
import java.util.Scanner;

public class Tablas1al6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.println("¿Cuántos números desea introducir?");
int cuantosNumeros = sc.nextInt();

int t[]=new Int[cuantosNumeros];
for (int i=0; i <t.length; i++){
    System.out.println("Ingrese un número:");
    t[i] = sc.nextInt();
}
System.out.println("A continuación se mostrarán los números en orden inverso:");
for (int i=t.length - 1; i >=0; i--){
        System.out.println(t[i]);
        }
    }
}

