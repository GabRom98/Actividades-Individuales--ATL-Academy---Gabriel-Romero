package TestCRUD1.CrudTest.controllers;

import TestCRUD1.CrudTest.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    static List<Usuario> usuarios = new ArrayList<Usuario>();
    @CrossOrigin("*")
    @GetMapping("/api/usuarios")
    public List<Usuario> listarUsuarios(){

        return usuarios;
    }

    @CrossOrigin("*")
    @DeleteMapping("/api/usuarios/{id}")
    public void eliminarUsuario(@PathVariable String id){

        for (Usuario user : usuarios){
            if(id.equals(user.getId().toString())){
                usuarios.remove(user);
            }
        }
    /*    Usuario usuarioEncontrado = usuarios.stream().filter(user -> user.getId().equals(id)).findFirst().get();
        usuarios.remove(usuarioEncontrado);*/
    }
    @CrossOrigin("*")
    @PostMapping("/api/usuarios")
    public void agregarUsuario(@RequestBody Usuario user){
       usuarios.add(user);
    }
    @CrossOrigin("*")
    @PutMapping("/prueba")
    public String prueba4(){
        return "Prueba de Request PUT";
    }
    @CrossOrigin("*")
    @PatchMapping("/prueba")
    public String prueba5(){
        return "Prueba de Request PATCH";
    }

}

