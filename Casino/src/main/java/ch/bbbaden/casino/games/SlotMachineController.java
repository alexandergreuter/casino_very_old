package ch.bbbaden.casino.games;

import ch.bbbaden.casino.Controller;
import ch.bbbaden.casino.Model;

public class SlotMachineController implements Controller {

    private SlotMachineModel slotMachineModel;

    public void update(Model model) {
        slotMachineModel = (SlotMachineModel) model;

    }
}
