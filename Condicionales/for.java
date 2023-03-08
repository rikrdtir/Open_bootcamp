
/*
Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
*/
//by ricardt

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero:");
        int limite = scanner.nextInt();
        scanner.close();

        for (int numeroFor = 0; numeroFor <= limite; numeroFor++) {
            System.out.println(numeroFor);
        }
    }
}

