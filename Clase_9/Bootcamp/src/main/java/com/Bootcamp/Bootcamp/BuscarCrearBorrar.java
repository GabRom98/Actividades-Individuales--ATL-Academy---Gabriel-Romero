package com.Bootcamp.Bootcamp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BuscarCrearBorrar {

     String[] personas = new String[10];
     int tamañoArrayPersonas = 0;

    @GetMapping("/personas")
    public String[] obtenerTodosLasPersonas(){
        return personas;
    }

    @GetMapping("/personas/{individuo}")
    public String buscarPersona(@PathVariable String individuo){
        for ( String persona : personas ){
            if (persona.equalsIgnoreCase(individuo)){
                return persona;
            }
        }
        return "No se ha encontrado un usuario con ese nombre";
    }

    @PostMapping("/persona")
    public ResponseEntity<String> agregarPersona(@RequestBody String persona){
        if (tamañoArrayPersonas < persona.length()){
            personas[tamañoArrayPersonas] = persona;
            tamañoArrayPersonas++;
            return ResponseEntity.ok("Persona agregada exitosamente.");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("El array está lleno. No se pueden agregar más elementos.");
        }
    }

    @DeleteMapping("/persona/{nombre}")
    public ResponseEntity<String> deletePerson(@PathVariable String nombre) {
        int indice = -1;
        for (int i = 0; i < tamañoArrayPersonas; i++) {
            if (personas[i].equalsIgnoreCase(nombre)) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            // Eliminar la persona del array
            for (int i = indice; i < tamañoArrayPersonas - 1; i++) {
                personas[i] = personas[i + 1];
            }
            tamañoArrayPersonas--;
            return ResponseEntity.ok("Persona eliminada exitosamente.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Persona no encontrada.");
        }
    }

}

