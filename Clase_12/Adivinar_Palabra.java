package Clase_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Adivinar_Palabra {
    public static void main(String[] args){
        Pregunta_Respuesta_Clase preguntaRespuesta1 = new Pregunta_Respuesta_Clase("¿Cuál es la capital de Francia?","París");
        Pregunta_Respuesta_Clase preguntaRespuesta2 = new Pregunta_Respuesta_Clase("¿Cuál es el resultado de 2 + 2?", "4");
        Pregunta_Respuesta_Clase preguntaRespuesta3 = new Pregunta_Respuesta_Clase("¿Quién pintó la Mona Lisa?", "Leonardo da Vinci");
        Pregunta_Respuesta_Clase preguntaRespuesta4 = new Pregunta_Respuesta_Clase("¿Cuál es el océano más grande?", "Océano Pacífico");
        Pregunta_Respuesta_Clase preguntaRespuesta5 = new Pregunta_Respuesta_Clase("¿Cuál es la fórmula química del agua?", "H2O");
        Pregunta_Respuesta_Clase preguntaRespuesta6 = new Pregunta_Respuesta_Clase("¿En qué año se descubrió América?", "1492");
        Pregunta_Respuesta_Clase preguntaRespuesta7 = new Pregunta_Respuesta_Clase("¿Cuál es el metal más abundante en la corteza terrestre?", "Aluminio");
        Pregunta_Respuesta_Clase preguntaRespuesta8 = new Pregunta_Respuesta_Clase("¿Cuál es el río más largo del mundo?", "Amazonas");
        Pregunta_Respuesta_Clase preguntaRespuesta9 = new Pregunta_Respuesta_Clase("¿Cuál es el planeta más grande del sistema solar?", "Júpiter");
        Pregunta_Respuesta_Clase preguntaRespuesta10 = new Pregunta_Respuesta_Clase("¿Quién escribió el libro '1984'?", "George Orwell");

        List<Pregunta_Respuesta_Clase> preguntasRespuestas = new ArrayList<>();
        preguntasRespuestas.add(preguntaRespuesta1);
        preguntasRespuestas.add(preguntaRespuesta2);
        preguntasRespuestas.add(preguntaRespuesta3);
        preguntasRespuestas.add(preguntaRespuesta4);
        preguntasRespuestas.add(preguntaRespuesta5);
        preguntasRespuestas.add(preguntaRespuesta6);
        preguntasRespuestas.add(preguntaRespuesta7);
        preguntasRespuestas.add(preguntaRespuesta8);
        preguntasRespuestas.add(preguntaRespuesta9);
        preguntasRespuestas.add(preguntaRespuesta10);

        Random numRandom = new Random();
        Integer indexRandom = numRandom.nextInt(preguntasRespuestas.size());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenidos a nuestro juego de Preguntados");
        System.out.println("Porfavor adivine la respuesta");

        Pregunta_Respuesta_Clase pregResp = preguntasRespuestas.get(indexRandom);

        String pregunta = pregResp.getPregunta();
        String respuesta = pregResp.getRespuesta();

        System.out.println(pregunta);
        String respuestaUsuario = scanner.nextLine().trim();

        if (respuestaUsuario.equalsIgnoreCase(respuesta)){
            System.out.println("La respuesta es correcta!");
        } else {
            System.out.println("La respuesta es Incorrecta!");
        }
    }
}
