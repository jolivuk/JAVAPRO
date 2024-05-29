package lessons.lesson20240529;

public abstract class AbstractFilm implements Film{
    String title;
    String genre;

    public AbstractFilm(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getGenre() {
        return this.genre;
    }
}
