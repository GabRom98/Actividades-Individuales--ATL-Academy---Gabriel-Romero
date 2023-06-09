package Clase_6;

import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args){
        System.out.println("A continuacion jugaras piedra papel o tijera con la consola!" + "\n" + "estas preparado?");

        String armaUsuario = eleccionUsuario();
        System.out.println("Haz escogido " + armaUsuario + "!");

        System.out.println("Turno de la consola:");

        String armaConsola = eleccionConsola();
        System.out.println("La consola a escogido " + armaConsola + "!");

        if(armaUsuario.equals("Piedra")){
           String rta = armaUsuarioPiedra( armaUsuario,armaConsola );
           System.out.println(rta);
        }

        if(armaUsuario.equals("Papel")){
            String rta = armaUsuarioPapel( armaUsuario,armaConsola );
            System.out.println(rta);
        }

        if(armaUsuario.equals("Tijera")){
            String rta = armaUsuarioTijera( armaUsuario,armaConsola );
            System.out.println(rta);
        }

        /*String vencedor = ganador( armaUsuario, armaConsola);
        System.out.println(vencedor);*/
    }

    public static String eleccionUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione su arma, colocar el numero correspondiente: " + "\n" + "1 -Piedra" + "\n" + "2 -Papel" + "\n" + "3 -Tijera" );
        String eleccionArma = scanner.next();
        String armaSeleccionada = "";

        if(eleccionArma.equals("1")){
            armaSeleccionada = "Piedra";
        }
        if (eleccionArma.equals("2")) {
            armaSeleccionada = "Papel";
        }
        if (eleccionArma.equals("3")){
            armaSeleccionada = "Tijera";
        }
        return armaSeleccionada;
    }

    public static String eleccionConsola(){
        int eleccionArma = (int) Math.floor(Math.random()*3+1);
        String eleccionArmaConsola = "";

        if (eleccionArma == 1){
            eleccionArmaConsola = "Piedra";
        }
        if (eleccionArma == 2){
            eleccionArmaConsola = "Papel";
        }
        if (eleccionArma == 3){
            eleccionArmaConsola = "Tijera";
        }

        return eleccionArmaConsola;
    }

    public static String armaUsuarioPiedra(String armaUsuario,String armaConsola){

        if (armaConsola.equals("Tijera")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es el usuario!. Felicidades, ganaste!";
        }
        if (armaConsola.equals("Papel")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es la consola!. Lo lamento, perdiste. Pero puedes volver a intentarlo.";
        }
        if (armaConsola.equals("Piedra")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "No hay ningun ganador, el juego termino en empate. Vuelve a intentarlo!";
        }

        return "Armas seleccionadas inválidas. Por favor, selecciona nuevamente.";
    }

    public static String armaUsuarioPapel(String armaUsuario,String armaConsola){

        if (armaConsola.equals("Piedra")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es el usuario!. Felicidades, ganaste!";
        }
        if (armaConsola.equals("Tijera")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es la consola!. Lo lamento, pero puedes volver a intentarlo.";
        }
        if (armaConsola.equals("Papel")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "No hay ningun ganador, el juego termino en empate. Vuelve a intentarlo!";
        }

        return "Armas seleccionadas inválidas. Por favor, selecciona nuevamente.";
    }

    public static String armaUsuarioTijera(String armaUsuario,String armaConsola){

        if (armaUsuario.equals("Tijera") && armaConsola.equals("Papel")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es el usuario!. Felicidades, ganaste!";
        }
        if (armaUsuario.equals("Tijera") && armaConsola.equals("Piedra")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es la consola!. Lo lamento, pero puedes volver a intentarlo.";
        }
        if (armaUsuario.equals("Tijera") && armaConsola.equals("Tijera")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "No hay ningun ganador, el juego termino en empate. Vuelve a intentarlo!";
        }

        return "Armas seleccionadas inválidas. Por favor, selecciona nuevamente.";
    }

    /*public static String ganador(String armaUsuario, String armaConsola){

        if (armaUsuario.equals("Piedra") && armaConsola.equals("Tijera")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es el usuario!. Felicidades, ganaste!";
        }
        if (armaUsuario.equals("Piedra") && armaConsola.equals("Papel")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es la consola!. Lo lamento, perdiste. Pero puedes volver a intentarlo.";
        }
        if (armaUsuario.equals("Piedra") && armaConsola.equals("Piedra")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "No hay ningun ganador, el juego termino en empate. Vuelve a intentarlo!";
        }


        if (armaUsuario.equals("Papel") && armaConsola.equals("Piedra")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es el usuario!. Felicidades, ganaste!";
        }
        if (armaUsuario.equals("Papel") && armaConsola.equals("Tijera")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es la consola!. Lo lamento, pero puedes volver a intentarlo.";
        }
        if (armaUsuario.equals("Papel") && armaConsola.equals("Papel")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "No hay ningun ganador, el juego termino en empate. Vuelve a intentarlo!";
        }


        if (armaUsuario.equals("Tijera") && armaConsola.equals("Papel")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es el usuario!. Felicidades, ganaste!";
        }
        if (armaUsuario.equals("Tijera") && armaConsola.equals("Piedra")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "El ganador es la consola!. Lo lamento, pero puedes volver a intentarlo.";
        }
        if (armaUsuario.equals("Tijera") && armaConsola.equals("Tijera")){
            return "El usuario a seleccionado: " + armaUsuario + "\n" + "La consola a seleccionado: " + armaConsola + "\n" + "No hay ningun ganador, el juego termino en empate. Vuelve a intentarlo!";
        }

        return "Armas seleccionadas inválidas. Por favor, selecciona nuevamente.";
    }*/

}
