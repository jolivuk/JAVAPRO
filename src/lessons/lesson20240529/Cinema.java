package lessons.lesson20240529;

public class Cinema {
    public static void main(String[] args) {

        AbstractFilm comedy = new ComedyFilm("Mask");
        AbstractFilm drama = new DramaFilm("Titanic");
        AbstractFilm action = new ActionFilm("Avatar");

        Session session1 = new Session(comedy,"15:00",134);
        System.out.println(session1);

        Session session2 = new Session(drama,"20:00",134);
        System.out.println(session2);

        Session session3 = new Session(action,"18:00",134);
        System.out.println(session3);

    }
}
