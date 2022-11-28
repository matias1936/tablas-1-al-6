//Desarrollar el juego la cámara secreta, que consiste abrir una cámara mediante su combinación secreta,
//que está formado por una combinación de dígitos del uno al cinco. El jugador especificará cuál es la longitud de la combinación,
//a mayor longitud mayor será la dificultad del juego. La aplicación genera, de forma aleatoria, una combinación secreta que el usuario tendrá que acertar.
//En cada intento se muestra como pista, para cada dígito de la combinación introducido por el jugador,
//si es mayor, menor o igual que el correspondiente en la combinación secreta.

package tablas1al6;
import java.util.Scanner;
import java.util.Arrays;

public class Tablas1al6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Longitud de la combinación secreta...");
        int longitud = sc.nextInt();
        int combSecreta[]= new int[longitud];
        int combJugador[] = new int[longitud];
        
generaCombinacion(combSecreta);
System.out.println(Arrays.toString(combSecreta));
System.out.println("Escriba una combinación");
leeTabla(combJugador);

while (!Arrays.equals(combSecreta, combJugador)){
    muestraPistas(combSecreta, combJugador);
    System.out.println("Escriba una combinación: ");
    leeTabla(combJugador);
}
System.out.println("¡La cámara se ha abierto!");
}
    static void generaCombinacion(int t[]){
        final int MAX=5 ;
        for (int i=0; i< t.length; i++){
            t[i] = (int) (Math.random()*MAX+1);
            
        }
    }
    static void leeTabla(int t[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< t.length; i++){
            t[i]=sc.nextInt();
            
        }
    }
    static void muestraPistas(int secret [], int jug []){
        for (int i = 0; i < jug.length; i++){
            System.out.println(jug[i]);
            if (secret[i] >jug[i]){
                System.out.println("mayor");
            } else if (secret[i] < jug[i]){
                System.out.println("menor");
            } else {
                System.out.println("igual");
                
            }
            }
        }
    }
            


    
