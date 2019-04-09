package ch.bbbaden.casino;

import java.util.ArrayList;

public class AdminUser extends User {

    private ArrayList<User> users;

    public AdminUser(){
        updateUsers();
    }

    public ArrayList<NormalUser> getNormalUsers() {
        ArrayList<NormalUser> normalUsers = new ArrayList<NormalUser>();
        for (User user : users) {
            if (user instanceof NormalUser) {
                normalUsers.add((NormalUser) user);
            }
        }
        return normalUsers;
    }

    private void updateUsers(){
        users = new ArrayList<User>();
        users.add(new NormalUser());
    }
}
