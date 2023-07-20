package TEST.newsletters.controllers;

import TEST.newsletters.models.Lead;
import TEST.newsletters.repository.EmailRepository;
import TEST.newsletters.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsLettersController {

    @Autowired
    EmailRepository repositorioDeEmails;

    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Lead lead){

        String email = lead.getEmail();

        EmailValidator emailValidator= new EmailValidator();
        if(emailValidator.isValidate(email) == false){
            return "EMAIL no valido";
        }

        repositorioDeEmails.guardarEmail(email);

        return "Email: " + email;
    }

    @DeleteMapping("/api/newsletter/unsuscribe")
    public String borrarRegistro(@RequestBody Lead lead){

        String email = lead.getEmail();

        repositorioDeEmails.eliminarEmail(email);

        return "Email Borrado: " + email;
    }

    @GetMapping("/api/newsletter")
    public List<String> obtenerEmails(){

        return repositorioDeEmails.obtenerEmails();

    }

}
