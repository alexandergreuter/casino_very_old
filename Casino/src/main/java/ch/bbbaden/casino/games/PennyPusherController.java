package ch.bbbaden.casino.games;

import ch.bbbaden.casino.Controller;
import ch.bbbaden.casino.Model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class PennyPusherController implements Controller {
    public GridPane field;
    public Label coins;

    private int lastField[][] = new int[6][13];
    private PennyPusherModel pennyPusherModel;

    public void update(Model model) {
        pennyPusherModel = (PennyPusherModel) model;
        coins.setText(pennyPusherModel.getCoins());
        updateField(pennyPusherModel.getField());
    }

    public void updateField(int[][] curField) {
        if (!lastField.equals(curField)) {
            for (int i = 0; i < curField.length; i++) {
                for (int j = 0; j < curField[i].length; j++) {
                    if (curField[i][j] == 0) {
                        getFieldLabel(i, j).setText("");
                    } else {
                        getFieldLabel(i, j).setText(Integer.toString(curField[i][j]));
                    }
                }
            }
            lastField = curField;
        }
    }

    public Label getFieldLabel(final int row, final int column) {
        Label result = null;
        ObservableList<Label> childrens = FXCollections.observableArrayList();
        for (Node node : field.getChildren()) {
            if (node instanceof Label) {
                childrens.add((Label) node);
            }
        }

        for (Label label : childrens) {
            if (field.getRowIndex(label) == row && field.getColumnIndex(label) == column) {
                result = label;
                break;
            }
        }

        return result;
    }
}
