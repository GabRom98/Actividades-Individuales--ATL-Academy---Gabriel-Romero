package Clase_6;

import java.util.Scanner;

public class BuscadorTweets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Porfavor ingrese el nombre de una celebridad");
        String celebridad = scanner.next();

        String urlGenerado = generadorCelebridad(celebridad);
        System.out.println("Su link para ver el twitter de la celebridad es: " + urlGenerado);
    }

    public static String generadorCelebridad(String celebridad){
        String celebridadIngresada = celebridad;
        String generadorUrl = "https://twitter.com/search?q=" + celebridadIngresada;

        return generadorUrl;
    }

}
