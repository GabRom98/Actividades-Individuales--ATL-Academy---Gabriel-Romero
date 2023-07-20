package TEST.newsletters.validators;

import org.junit.Test;
import static org.junit.Assert.assertFalse;


public class EmailValidatorTest {
    @Test
    public void EmailHaveArroba(){
        EmailValidator validator = new EmailValidator();
       boolean resultado = validator.isValidate("feasf");

        assertFalse(resultado);
    }

    @Test
    public void EmailHaveDot(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValidate("gabriel@hotmailcom");

        assertFalse(resultado);
    }

    @Test
    public void EmailDontHaveDotatStart(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValidate(".gabriel@hotmail.com");

        assertFalse(resultado);
    }

    @Test
    public void EmailDontHaveSpaces(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValidate("ga briel@hotmail.com");

        assertFalse(resultado);
    }

    @Test
    public void EmailOnlyHaveOneArroba(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValidate("ga@briel@hot@mail.com");

        assertFalse(resultado);
    }

    @Test
    public void EmailMaxLength(){
        EmailValidator validator = new EmailValidator();
        boolean resultado = validator.isValidate("fesaffsafsesfsafesaffesaffsafsesfsafesaffesaffsafsesfsafesaffesaffsafsesfsafesaffesaffsafsesfsafesaffesaffsafsesfsafesaffesaffsafsesfsafesaffesaffsafsesfsafesaffesaffsafsesfsafesaffesaffsafsesfsafesaffesaffsafsesfsafesaffesaffsafsesfsafesaffesaffsafsesfsaf");

        assertFalse(resultado);
    }



}
