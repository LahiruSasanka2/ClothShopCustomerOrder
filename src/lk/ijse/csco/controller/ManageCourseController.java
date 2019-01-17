package lk.ijse.sr.controller;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.awt.event.ActionEvent;

public class ManageCourseController {

    @FXML
    private JFXTextField txtCID;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtDuration;

    @FXML
    private TableView<?> tblCourse;

    @FXML
    private JFXTextField txtCoursePrice;

    @FXML
    private JFXTextField txtDiscountAmount;

    @FXML
    private JFXTextArea txatCourseSubject;

    @FXML
    public void remove(javafx.event.ActionEvent event) {

    }

    @FXML
    public void save(javafx.event.ActionEvent event) {

    }

    @FXML
    public void update(javafx.event.ActionEvent event) {

    }

    public void find(javafx.event.ActionEvent actionEvent) {
    }
}
