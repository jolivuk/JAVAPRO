package lessons.lesson20240529;
/*
Создать класс Ticket, представляющий билет,
который содержит информацию о пользователе,
сеансе и месте.
 */
public class Ticket {
    User user;
    Session session;
    int place;

    public Ticket(User user, Session session, int place) {
        this.user = user;
        this.session = session;
        this.place = place;
    }
}
