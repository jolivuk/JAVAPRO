package lessons.lesson20240529;

public class AdminUser implements User {
    String userName;
    String userRole = "Admin";

    public AdminUser(String userName) {
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
