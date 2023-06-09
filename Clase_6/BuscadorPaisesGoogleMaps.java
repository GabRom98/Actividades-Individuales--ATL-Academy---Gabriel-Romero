package Clase_6;

import java.util.Scanner;

public class BuscadorPaisesGoogleMaps {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Porfavor ingrese un pais");
        String pais = scanner.next();
        String paisGenerado= generadorUrlPais(pais);

        System.out.println("Su link para ver el pais es: " + paisGenerado);
    }
    public static String generadorUrlPais(String paisIngresado){
        String pais = paisIngresado;
        String urlPais = "https://www.google.com/maps/search/" + pais;

        return urlPais;
    }
}
