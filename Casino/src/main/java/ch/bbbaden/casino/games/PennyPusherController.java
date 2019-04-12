package ch.bbbaden.casino.games;

import ch.bbbaden.casino.Controller;
import ch.bbbaden.casino.Model;

public class PennyPusherController implements Controller {
    PennyPusherModel pennyPusherModel;

    public void update(Model model) {
        pennyPusherModel = (PennyPusherModel) model;
    }
}
