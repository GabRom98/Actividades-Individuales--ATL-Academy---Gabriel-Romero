package com.Clase10Ejercicios.Clase10Ejercicios.controllers;

import com.Clase10Ejercicios.Clase10Ejercicios.services.ChatGptClient;
import com.Clase10Ejercicios.Clase10Ejercicios.models.Category;
import com.Clase10Ejercicios.Clase10Ejercicios.models.Question;
import com.Clase10Ejercicios.Clase10Ejercicios.services.TriviaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TriviaController {
    @GetMapping("/categories")
    public List<Category> getCategories() {
      TriviaService service = new TriviaService();
      return service.getCategories();
    }

    @GetMapping("/question")
    public String getQuestions(){

        Question question = new Question();
        question.setCategory("Animales");
        question.setQuestion("¿Cual es el animal mas grande del mundo?");

        String[] opciones = {"Orca","Elefante","Ballena Azul"};
        question.setOptions(opciones);

        question.setAnswer("2");
        question.setExplanation("La ballena azul antártica (Balaenoptera musculus Intermedia) es el animal más grande del planeta. Llega a pesar hasta 400,000 libras (180 ton) o el equivalente a unos 33 elefantes y medir unos 98 pies (29 m) de largo.");

        return "{\n" +
                "  \"category\": \""+ question.getCategory() +"\",\n" +
                "  \"question\": \"" + question.getQuestion() +"\",\n" +
                "  \"options\": \""+ question.getOptions() +"\",\n" +
                "  \"answer\": \""+ question.getAnswer() + "\",\n" +
                "  \"explanation\": \"" + question.getExplanation() + "\" \n" +
                "}";
    }

    @GetMapping("/question/{categoria}")
    public String getQuestion(@PathVariable String categoria) {

        ChatGptClient chatGpt = new ChatGptClient();
        String respuestaJson = chatGpt.enviarPregunta("Generame una pregunta de una categoria "+ categoria +" que tenga la siguiente estructura json. Solo necesito un json no quiero que me des ninguna aclaracion. La respuesta no siempre tiene que estar en la primera posicion, lo que debe cumplir es que es unica entre las opciones. Necesito que solo haya una respuesta correcta. Te paso la estructura de debe seguir la respuesta. Recuerda solo JSON y sin nada mas.:\n" +
                "\n" +
                "{\n" +
                "  \"category\": \"aca va el nombre de la categoria\",\n" +
                "  \"question\": \"aca va la pregunta\",\n" +
                "  \"options\": [\n" +
                "    \"aca va la opcion 1\",\n" +
                "    \"aca va la opcion 2\",\n" +
                "    \"aca va la opcion 3\"\n" +
                "  ],\n" +
                "  \"answer\": aqui va la respuesta correcta en caso de ser la primera es el numero 0 en caso de ser la segunda es el 1 y en caso de ser la tercera es el 2,\n" +
                "  \"explanation\": \"aca tienes que poner una explicacion diciendo porque es la respuesta correcta\"\n" +
                "}");
        return respuestaJson;
        //ObjectMapper convertidor = new ObjectMapper();
        //Pregunta preg = convertidor.convertValue(respuestaJson, Pregunta.class);
        //return preg;
    }
}
