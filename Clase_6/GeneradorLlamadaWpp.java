package Clase_6;

import java.util.Scanner;

public class GeneradorLlamadaWpp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Porfavor ingrese el numero de telefono");
        String numeroTel = scanner.next();

        String urlGenerado = generadorCelebridad(numeroTel);
        System.out.println("Su link para llamar numero de telefono en wpp: " + urlGenerado);
    }

    public static String generadorCelebridad(String telefono){
        return "https://api.whatsapp.com/send?phone=" + telefono;
    }
}
