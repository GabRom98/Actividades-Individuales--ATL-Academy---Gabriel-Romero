package TestCRUD1.CrudTest.models;

import lombok.*;

//o @Data menos constructor con argumentos AllArgsConstructor
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Usuario {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
