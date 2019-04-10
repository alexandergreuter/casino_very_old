package ch.bbbaden.casino;

import java.sql.SQLException;
import java.util.ArrayList;

public class AdminUser extends User {

    private ArrayList<User> users;

    public ArrayList<NormalUser> getNormalUsers() {
        ArrayList<NormalUser> normalUsers = new ArrayList<NormalUser>();
        for (User user : users) {
            if (user instanceof NormalUser) {
                normalUsers.add((NormalUser) user);
            }
        }
        return normalUsers;
    }

    private void updateUsers() {
        users = new ArrayList<User>();
        try {
            users.add(new NormalUser());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
