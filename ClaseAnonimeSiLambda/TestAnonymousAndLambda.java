public class TestAnonymousAndLambda {
    public static void main(String[] args) {
        Validator validator = new Validator() {
            @Override
            public boolean check(SerialTV serial, SerialTV.Genre genre) {
                return serial.getGenre() == SerialTV.Genre.SF && serial.getRating() > 8;
            }
        };

        SerialTV blackMirror = new SerialTV(SerialTV.Genre.SF, "Black Mirror", 10, 4);
        SerialTV gameOfThrones = new SerialTV(SerialTV.Genre.FANTASY, "Game Of Thrones", 10, 7);

        boolean doIWantToSeeIt = validator.check(blackMirror, SerialTV.Genre.SF);
        System.out.println(doIWantToSeeIt);

        Validator fanOfGenre = (serial, genre) -> serial.getGenre() == genre;
        Validator pickyFan = (serial, genre) -> serial.getRating() > 8;

        doIWantToSeeIt = fanOfGenre.check(gameOfThrones, SerialTV.Genre.SF);
        System.out.println("gameOfThrones " + doIWantToSeeIt);

        doIWantToSeeIt = fanOfGenre.check(blackMirror, SerialTV.Genre.SF);
        System.out.println("blackMirror " + doIWantToSeeIt);

    }

}
