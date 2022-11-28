//Implementar un programa que inicialice una tabla con nuestros números favoritos.
//A continuación, pedir al usuario el índice de un elemento que será eliminado de la tabla.
//Continuaremos eliminando elementos hasta que el índice introducido sea negativo o hasta que no existan más elementos que borrar.
//Es imprescindible controlar que el índice leído corresponde a un dato válido.
package tablas1al6;
import java.util.Scanner;
import java.util.Arrays;

public class Tablas1al6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
int t[]= {23,8,1,-3,17,5,99};

int numElem =t.length;
System.out.println("Índice del elemento a borrar;");
int indiceBorrar = sc.nextInt();
while (indiceBorrar >=0 && numElem !=0){
    if (indiceBorrar< numElem){
        t[indiceBorrar] = t[numElem - 1];
        numElem--;
        mostrarTabla(t, numElem);
    } else {
        System.out.println("No existe elemento a borrar:");
    }
    System.out.println("Índice del elemento a borrar:");
    indiceBorrar=sc.nextInt();
    
    }
    }
    static void mostrarTabla (int a[], int n){
        System.out.print("[");
        for (int i=0; i<n;i++){
            System.out.print(a[i]+"");
        }
        System.out.println("]");
        }
}

    
