package Clase_8;

import java.util.Random;
import java.util.Scanner;

public class RemakePiedraPapelTijera {
    public static void main(String[] args) {

        String[] arrayPiedraPapelTijera = generadorArrayPiedraPapelTijera();

        System.out.println("Bienvenido a nuestro juego de Piedra Papel o Tijera!");

        System.out.println("Porfavor ingrese el arma con el que va a jugar: " + "Piedra-" + " Papel-" + " Tijera");

        String seleccionElementoUsuario = eleccionUsuario(arrayPiedraPapelTijera);

        String seleccionElementoConsola = eleccionConsola(arrayPiedraPapelTijera);

        System.out.println("la Consola a seleccionado " + seleccionElementoConsola);

        String resultado = resultadoJuego(seleccionElementoUsuario, seleccionElementoConsola);

        System.out.println("El Resultado del juego es: " + "\n" + resultado);

    }

    public static String[] generadorArrayPiedraPapelTijera() {
        return new String[]{"Piedra", "Papel", "Tijera"};
    }

    public static String eleccionUsuario(String[] arrayPiedraPapelTijera) {
        Scanner scanner = new Scanner(System.in);
        String eleccionUsuario = scanner.next();

        for (String elemento : arrayPiedraPapelTijera) {
            if (elemento.equalsIgnoreCase(eleccionUsuario)) {
                return elemento;
            }
        }

        System.out.println("Elección inválida. Inténtalo de nuevo.");
        return eleccionUsuario(arrayPiedraPapelTijera);
    }

    public static String eleccionConsola(String[] arrayPiedraPapelTijera) {
        Random numeroRandom = new Random();
        int eleccionConsola = numeroRandom.nextInt(arrayPiedraPapelTijera.length);
        return arrayPiedraPapelTijera[eleccionConsola];
    }

    public static String resultadoJuego(String usuario, String consola) {
        if (usuario.equalsIgnoreCase("Piedra") && consola.equalsIgnoreCase("Tijera")) {
            return "El ganador es usted. ¡Felicitaciones!";
        } else if (usuario.equalsIgnoreCase("Piedra") && consola.equalsIgnoreCase("Papel")) {
            return "Lo lamento, perdiste. Vuelve a intentarlo.";
        } else if (usuario.equalsIgnoreCase("Papel") && consola.equalsIgnoreCase("Piedra")) {
            return "El ganador es usted. ¡Felicitaciones!";
        } else if (usuario.equalsIgnoreCase("Papel") && consola.equalsIgnoreCase("Tijera")) {
            return "Lo lamento, perdiste. Vuelve a intentarlo.";
        } else if (usuario.equalsIgnoreCase("Tijera") && consola.equalsIgnoreCase("Papel")) {
            return "El ganador es usted. ¡Felicitaciones!";
        } else if (usuario.equalsIgnoreCase("Tijera") && consola.equalsIgnoreCase("Piedra")) {
            return "Lo lamento, perdiste. Vuelve a intentarlo.";
        } else {
            return "Haz empatado, casi lo logras. ¡La próxima tal vez ganes!";
        }
    }


}
