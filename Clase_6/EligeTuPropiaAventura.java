package Clase_6;

import java.util.Scanner;

public class EligeTuPropiaAventura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eres un intrépido explorador en busca de un tesoro legendario oculto en una antigua pirámide. Tendrás que tomar decisiones cruciales en tu camino hacia la riqueza y la gloria. ¿Estás listo para la aventura?");
        System.out.println("Capítulo 1: La entrada misteriosa\n" +
                "\n" +
                "Te encuentras frente a la entrada de una antigua pirámide. A tu izquierda, ves una puerta de piedra con inscripciones jeroglíficas y a tu derecha, una oscura cueva. ¿Qué camino eliges?\n" +
                "\n" +
                "1 -Entras por la puerta de piedra para descifrar los jeroglíficos.\n" +
                "2 -Te adentras en la oscura cueva en busca de otra salida.");

        System.out.print("Escribe 1 o 2 para hacer tu elección: ");
        String camino = scanner.next();

        if (camino.equals("1")){

            System.out.println("Al entrar por la puerta de piedra, descubres una habitación llena de trampas mortales. ¿Qué haces?\n" +
                    "\n" +
                    "1 -Intentas desactivar las trampas con cuidado.\n" +
                    "2 -Corres a través de la habitación, evitando las trampas lo mejor que puedes.");

            System.out.print("Escribe 1 o 2 para hacer tu elección: ");
            String camino_1 = scanner.next();

            if (camino_1.equals("1")){
                System.out.println("Al desactivar las trampas, no tuviste cuidado en manipular una trampa,y termino explotando todo provocando tu muerte");
            }
            if (camino_1.equals("2")){
                System.out.println("Lograste esquivar las trampas y pudiste salir vivo de esa situacion, lograste escapar");
            }
        }

        if (camino.equals("2")){
            System.out.println("Dentro de la oscura cueva, encuentras una bifurcación. ¿Cuál camino eliges?\n" +
                    "\n" +
                    "1 -Tomas el camino de la izquierda, guiándote por un destello de luz.\n" +
                    "2 -Tomas el camino de la derecha, siguiendo el eco de un suave murmullo.");

            System.out.print("Escribe 1 o 2 para hacer tu elección: ");
            String camino_2 = scanner.next();

            if (camino_2.equals("1")){
                System.out.println("El destello de luz te llevo a la salida y proseguiste tu aventura");
            }
            if (camino_2.equals("2")){
                System.out.println("Su personaje se encontro con un asesino y moriste");
            }

        }


    }
}
