package com.Clase10Ejercicios.Clase10Ejercicios.services;

import com.Clase10Ejercicios.Clase10Ejercicios.models.Category;

import java.util.ArrayList;
import java.util.List;

public class TriviaService {
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();

        Category categoria1 = new Category();
        categoria1.setCategory("Salud");
        categoria1.setDescription("Preguntas relacionadas con el área de Salud.");
        categories.add(categoria1);

        Category categoria2 = new Category();
        categoria2.setCategory("Musica");
        categoria2.setDescription("Preguntas relacionadas con Música.");
        categories.add(categoria2);

        Category categoria3 = new Category();
        categoria3.setCategory("Programacion");
        categoria3.setDescription("Preguntas relacionadas con el mundo de la programación.");
        categories.add(categoria3);

        Category categoria4 = new Category();
        categoria4.setCategory("Equipos de Futbol");
        categoria4.setDescription("Preguntas relacionadas con los diferentes equipos de fútbol existentes.");
        categories.add(categoria4);

        Category categoria5 = new Category();
        categoria5.setCategory("Paises");
        categoria5.setDescription("Preguntas relacionadas con los países del mundo.");
        categories.add(categoria5);

        Category categoria6 = new Category();
        categoria6.setCategory("Animales");
        categoria6.setDescription("Preguntas relacionadas con la diversidad de la fauna.");
        categories.add(categoria6);

        return categories;
    }
}
