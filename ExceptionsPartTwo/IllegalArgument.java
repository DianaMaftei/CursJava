public class IllegalArgument
{
    public static void main(String[] args) {
            login("Diana", "superUberPassword");
    }
    
    public static void login(String username, String password) {
        if(password != null &&  password.length() >= 1 && password.length() < 7) {
            throw new Exception();
        } else {
            System.out.println("You are in!");
        }
    }
}
