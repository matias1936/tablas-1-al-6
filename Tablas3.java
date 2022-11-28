//Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números. 
//Realizar la media de los números positivos, la media de los negativos y contar el número de ceros introducidos.
package tablas1al6;
import java.util.Scanner;

public class Tablas1al6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.println("Ingrese un número:");
int n = sc.nextInt();
int numeros[] = new int[n];
int sumaPositivos = 0,
        contPositivos = 0,
        sumaNegativos = 0,
        contNegativos = 0,
        contCeros = 0;

for (int i=0; i< numeros.length; i++){
    System.out.println("Ingrese un número: ");
    numeros[i] = sc.nextInt();
}
for (int x : numeros){
    if (x==0){
        contCeros++;
    } else {
        if (x>0){
            sumaPositivos += x;
            contPositivos++;
        }else{
            sumaNegativos+=x;
            contNegativos++;
        }
    }
 }
if (contPositivos == 0){
    System.out.println("Imposible realizar la media de positivos...");
} else {
    System.out.println("La media de los positivos es:"
    + (double) sumaPositivos/contPositivos);
}

if (contNegativos == 0){
    System.out.println("Imposible realizar la media de negativos...");
} else {
    System.out.println("La media de los negativos es:"
    + (double) sumaNegativos/contNegativos);
}
System.out.println("La cantidad de ceros es:"+contCeros);
    }
}