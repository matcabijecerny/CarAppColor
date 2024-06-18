package com.stredniskola.smistik;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Polygon auto;
    @FXML
    private ColorPicker barva;
    @FXML
    private Circle predni;
    @FXML
    private Circle zadni;
    @FXML
    private Slider slider;

    boolean wracked = false;

    public void zmenBarvu(ActionEvent event) {
        auto.setFill(barva.getValue());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}