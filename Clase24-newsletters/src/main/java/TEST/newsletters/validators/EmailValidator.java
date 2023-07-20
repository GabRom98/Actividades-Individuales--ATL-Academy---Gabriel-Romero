package TEST.newsletters.validators;

public class EmailValidator {

    public boolean isValidate(String email){
 /*       if (!email.contains("@")){
            return false;
        }
        if(email.startsWith(".")){
            return false;
        }
        if (!email.contains(".")){
            return false;
        }
        if(email.contains(" ")){
            return false;
        }
        if(!(email.split("@").length == 2)){
            return false;
        }

        if(email.length() > 255){
            return false;
        }


        return true;*/
        String regex = "^(?!\\.)(?!.*\\.{2})[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }
}
