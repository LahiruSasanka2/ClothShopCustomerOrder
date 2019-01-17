package lk.ijse.sr.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DashbordController {
    @FXML
    private AnchorPane root;

    @FXML
    void course(javafx.event.ActionEvent event) {
        try {
            AnchorPane anchor = FXMLLoader.load(this.getClass()
                    .getResource("/lk/ijse/sr/view/ManageCourse.fxml"));
            root.getChildren().setAll(anchor);
        } catch (IOException ex) {
            Logger.getLogger(DashbordController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void dashbord(javafx.event.ActionEvent event) {
//        try {
//            AnchorPane anchor = FXMLLoader.load(this.getClass().getResource("/lk/ijse/edu/ps/view/PatientDrugOrder.fxml"));
//            panHome.getChildren().setAll(anchor);
//        } catch (IOException ex) {
//            Logger.getLogger(DashbordController.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @FXML
    void logout(javafx.event.ActionEvent event) {
//        try {
//            AnchorPane anchor = FXMLLoader.load(this.getClass().getResource("/lk/ijse/edu/ps/view/PatientDrugOrder.fxml"));
//            panHome.getChildren().setAll(anchor);
//        } catch (IOException ex) {
//            Logger.getLogger(UserMainController.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @FXML
    void payment(javafx.event.ActionEvent event) {
//        try {
//            AnchorPane anchor = FXMLLoader.load(this.getClass()
//                    .getResource("/lk/ijse/sr/view/PatientDrugOrder.fxml"));
//            root.getChildren().setAll(anchor);
//        } catch (IOException ex) {
//            Logger.getLogger(DashbordController.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @FXML
    void registration(javafx.event.ActionEvent event) {
        try {
            AnchorPane anchor = FXMLLoader.load(this.getClass()
                    .getResource("/lk/ijse/sr/view/ClothOrderDetailsDTO.fxml"));
            root.getChildren().setAll(anchor);
        } catch (IOException ex) {
            Logger.getLogger(DashbordController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void settings(javafx.event.ActionEvent event) {
//        try {
//            AnchorPane anchor = FXMLLoader.load(this.getClass().getResource("/lk/ijse/edu/ps/view/PatientDrugOrder.fxml"));
//            panHome.getChildren().setAll(anchor);
//        } catch (IOException ex) {
//            Logger.getLogger(UserMainController.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @FXML
    void student(javafx.event.ActionEvent event) {
        try {
            AnchorPane anchor = FXMLLoader.load(this.getClass()
                    .getResource("/lk/ijse/sr/view/ClothDTO.fxml"));
            root.getChildren().setAll(anchor);
        } catch (IOException ex) {
            Logger.getLogger(DashbordController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
