package com.Bootcamp.Bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@RestController
public class BusquedaController {
    @GetMapping("/busqueda-usuario/{busqueda}")
    public String[] obtenerPalabrasAutocompletar(@PathVariable String busqueda){

        String[] frasesTipicasDeBusqueda = {"java bootcamp", "bootcamp de python", "curso de nodejs", "curso de C", "bootcamp avanzado de java"};


        String[] resultadoDeLaBusqueda = new String[10];
        int contador = 0;

        for (String frase : frasesTipicasDeBusqueda){
            if (frase.contains(busqueda)){
                resultadoDeLaBusqueda[contador] = frase;
                contador++;
            }
        }

        /*String[] resultadoDeLaBusqueda = {busqueda,"java bootcamp","porque java es tan dificil", "java curso 2023"};*/

        return resultadoDeLaBusqueda;
    }
}
