package com.example.ud1_exercise1_skell;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;

public class UD1Exercise1Controller {
    @FXML
    private Button btnKillAll;
    @FXML
    private ToggleButton tbtnApache;
    @FXML
    private ToggleButton tbtnMariaDB;
    @FXML
    private Label lblMariaDBPid;
    @FXML
    private Label lblApachePid;


    @FXML
    public void initialize() {

        tbtnApache.setOnAction(touchEvent -> onToggleButtonClick(tbtnApache));
        tbtnMariaDB.setOnAction(touchEvent -> onToggleButtonClick(tbtnMariaDB));
        btnKillAll.setOnAction(touchEvent -> accionBtnKillAll());

        lblMariaDBPid.setText("PID: ");
        lblApachePid.setText("PID: ");

    }

    private void accionBtnKillAll() {
        System.out.println("Kill All !!!");
    }

    private void onToggleButtonClick(ToggleButton tb) {
        tb.setText((!tb.isSelected())?"OFF":"ON");

        if(tb==tbtnApache)
            accionApache(tb.isSelected());
        else
            accionMariaDB(tb.isSelected());
    }

    private void accionMariaDB(boolean selected) {
        System.out.println("MariaDB " + selected);
    }

    private void accionApache(boolean selected) {
        System.out.println("Apache " + selected);
    }
}