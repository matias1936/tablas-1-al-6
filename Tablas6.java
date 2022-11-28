 //Diseñar una aplicación para gestionar un campeonato de programación, donde se introducen la puntuación (enteros) obtenidos por 5 programadores,conforme van terminando su prueba.
 //La aplicación debe mostrar las puntuaciones ordenadas de los 5 participantes.
 //En ocasiones, cuando finalizan los 5 participantes anteriores, se suman al campeonato un máximo de 3 programadores de exhibición, cuyos puntos se incluyen con el resto.
 //La forma de especificar que no intervienen más programadores de exhibición es introducir como puntuación un -1(menos 1)
//La aplicación debe mostrar, finalmente, los puntos ordenados de todos los participantes.
package tablas1al6;
import java.util.Scanner;
import java.util.Arrays;

public class Tablas1al6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int puntos[] = new int[8];
        
for (int i=0; i < 5; i++);
System.out.println("Puntos programador ("+ (i + 1) + "): ");
puntos[i] = sc.nextInt();
    }
Arrays.sort(puntos, 0, 5);
System.out.println(Arrays.toString(puntos));
    
int numElem = 5;
System.out.print("Puntos del programador de exhibición: ");
int puntosProgExh = sc.nextInt();
while (puntosProgExh != -1 && numElem< puntos.length){
    int pos = Arrays.binarySearch(puntos, 0, numElem, puntosProgExh);
    int indiceInsercion;
    if (pos < 0) {
        indiceInsercion = -pos -1;
    } else {
        indiceInsercion = pos;
    }
    for (int i= numElem - 1; i >= indiceInsercion; i--) {
        puntos [i + 1]= puntos [i];
    }
    puntos [indiceInsercion] = puntosProgExh;
    numElem++;
    if (numElem <puntos.length){
        System.out.println("Puntos del programador de exhibición: ");
        puntosProgExh = sc.nextInt();
        
    }
    }
System.out.println("Puntuación final: ");
System.out.println(Arrays.toString(puntos));

}
        


    
