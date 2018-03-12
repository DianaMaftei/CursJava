public class Login
{
    public static void main(String[] args) {
        // authentication problem
        
        
        
        // invalid email
        
        // invalid password
        
        
        
        // authorization problem
        // email/username already exists
    }
    
    public static void doLogin(String email, String password) {
    // invalid email
        if(!email.contains("@")) {
            throw new InvalidEmailException("this is not a valid email");
        }
        
        if (!(password != null && password.length() > 1 && password.length() > 7)) {
            throw new InvalidPasswordException();
        }
        
        // invalid password
    }
}
