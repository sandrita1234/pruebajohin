

import java.util.Scanner;

public class SolicitarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;  // Para llevar la cuenta del orden de los números
        int numero;
        int cantidadNumeros = 0;  // Para contar cuántos números introduce el usuario
        int suma=0;

        // Bucle para pedir números hasta que se ingrese 0
        while (true) {//esto es un bucle infinito hasta que no salga el break no se termina 
            System.out.print("Dar el número " + contador + "º: ");
            numero = scanner.nextInt();
            
            System.out.println(numero);
            if(numero >= 10) {
            	break;
            }

            if (numero == 0) {
                break;  // Terminamos el bucle si el número es 0
            } 

            cantidadNumeros++;  // Aumentamos la cantidad de números introducidos
            contador++;  // Aumentamos el número de orden
        }
        
     

        // Mostrar cuántos números fueron introducidos
        System.out.println("El usuario ha introducido " + cantidadNumeros + " números antes de finalizar.");
        System.out.println();
    }
}
