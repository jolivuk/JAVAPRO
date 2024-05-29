package lessons.lesson20240529;
/*
Создать класс Session, представляющий сеанс, который
содержит фильм, время и количество доступных билетов.
 */
public class Session {
    private AbstractFilm film;
    private String time;
    private int numTicket;

    public Session(AbstractFilm film, String time, int numTicket) {
        this.film = film;
        this.time = time;
        this.numTicket = numTicket;
    }

    @Override
    public String toString() {
        return "Title:" + film.getTitle() + " Genre: " + film.genre + " Time: " + this.time + " Free Places: " + this.numTicket;
    }


}
