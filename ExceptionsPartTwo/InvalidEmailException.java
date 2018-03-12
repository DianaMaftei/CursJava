public class InvalidEmailException extends AuthenticationException 
{
   InvalidEmailException(String message) {
       super(message);
    }
}
