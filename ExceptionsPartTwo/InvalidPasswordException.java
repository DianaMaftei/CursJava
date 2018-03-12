public class InvalidPasswordException extends AuthenticationException
{
    InvalidPasswordException() {
        super();
    }
    
    InvalidPasswordException(String message) {
        super(message);
    }
    
    InvalidPasswordException(Throwable e) {
        super(e);
    }
}
