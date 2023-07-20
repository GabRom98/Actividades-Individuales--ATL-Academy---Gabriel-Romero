package TEST.newsletters;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
public class EmailJob {
    //Permite ejecutar funciones de noche, hora que queramos.
    @Scheduled(cron = "0 0 0 * * ?")
    public void generarBackupBd(){
        //blabla
        //Puedo hacer que esta funcion se ejecute a la hora que quiero solo le tengo que poner anotacion:scheduled
    }

    //Otra idea seria enviar emails a tal hora por ejemplo.
}
