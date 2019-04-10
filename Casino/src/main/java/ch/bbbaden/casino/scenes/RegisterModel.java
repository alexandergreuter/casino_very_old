package ch.bbbaden.casino.scenes;

import ch.bbbaden.casino.Model;
import ch.bbbaden.casino.NormalUser;

import java.sql.SQLException;

class RegisterModel extends Model {

    NormalUser normalUser;

    RegisterModel() {
        super("/fxml/register.fxml", "register", true);
    }

    private void showErrorMessage(String message) {
        RegisterFailedModel errView = new RegisterFailedModel(message);
        changeScene(errView);
        if (errView.doRetry()) {
            show();
        } else {
            changeScene(new StartModel());
        }
        errView.close();
    }

    public void register(String username, String password, int coins) {
        normalUser = new NormalUser();
        try {
            normalUser.register(username, password, coins);
        } catch (Exception ex) {
            System.out.println(ex);
            showErrorMessage(ex.getLocalizedMessage());
        }
        changeScene(new HomeModel(normalUser));
    }
}
