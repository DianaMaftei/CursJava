// pt a testa unul din exercitiile din kahoot

import java.util.function.Predicate;

public class KahootMyCalendar
{
    public static void main(String arguments[]) {
        Season season1 = new Season();
        season1.name = "Spring";

        Season season2 = new Season();
        season2.name = "Autumn";

        Predicate<String> aSeason = (s) -> true;
        season1 = season2;

        System.out.println(season1.name);
        System.out.println(season2.name);
        System.out.println(aSeason.test(new String("Summer")));
        
        
    }
}

class Season {
    String name;
}
