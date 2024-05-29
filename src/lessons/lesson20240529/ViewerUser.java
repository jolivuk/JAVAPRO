package lessons.lesson20240529;

public class ViewerUser implements User {
    String userName;
    String userRole = "User";

    public ViewerUser(String userName) {
        this.userName = userName;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public String getUserRole() {
        return this.userRole;
    }
}
