public class SerialTV {

    public enum Genre {
        COMEDY, HORROR, THRILLER, SF, DRAMA, FANTASY
    }

    //TODO make private and getters and setter
    private Genre genre;
    private String name;
    private int rating;
    private int numberOfSeasons;

    public SerialTV(Genre genre, String name, int rating, int numberOfSeasons) {
        this.genre = genre;
        this.name = name;
        this.rating = rating;
        this.numberOfSeasons = numberOfSeasons;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }
}
