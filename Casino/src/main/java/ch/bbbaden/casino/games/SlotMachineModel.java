package ch.bbbaden.casino.games;

import ch.bbbaden.casino.Model;

public class SlotMachineModel extends Model {
    public SlotMachineModel() {
        super(fxmlDocument, windowTitle, isPrimary);
        notifyController();
    }
}
