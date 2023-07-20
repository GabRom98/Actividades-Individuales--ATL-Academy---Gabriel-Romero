package TEST.newsletters.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmailRepository {

    @PersistenceContext
   private EntityManager baseDeDatos;
@Transactional
    public void guardarEmail(String emailUsuario) {
/*        String consultaSql = "INSERT INTO lead (id, email)" + "VALUES (NULL, '"+ email +"')";*/
 /*   String consultaSql = "INSERT INTO lead (email) VALUES ('" + email + "')";
*/
    String consultaSql = "INSERT INTO Lead (email) VALUES (:paramEmail)";

    baseDeDatos.createNativeQuery(consultaSql)
            .setParameter("paramEmail",emailUsuario)
            .executeUpdate();

 /*       baseDeDatos.createNativeQuery(consultaSql).executeUpdate();*/
    }
@Transactional
    public void eliminarEmail(String emailUsuario) {
        String consultaSql = "DELETE FROM Lead WHERE email = :paramEmail ";

        baseDeDatos.createQuery(consultaSql)
                .setParameter("paramEmail",emailUsuario)
                .executeUpdate();
    }

    @Transactional
    public List<String> obtenerEmails() {
        String consultaSql = "SELECT email FROM Lead";

       return baseDeDatos.createQuery(consultaSql).getResultList();
    }
}