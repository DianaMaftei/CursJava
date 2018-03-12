public class AuthenticationException extends RuntimeException {
    
    AuthenticationException() {
    
    }
    
    AuthenticationException(String message) {
        super(message);
    }
    
    AuthenticationException(Throwable e) {
        super(e);
    }
    
    
   
}
