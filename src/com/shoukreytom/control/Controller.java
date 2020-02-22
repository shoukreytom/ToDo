package com.shoukreytom.control;

import com.shoukreytom.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Controller {

    @FXML
    public void topics() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/fxml/topics.fxml"));
        Main.mainWindow.setScene(new Scene(root));
        Main.mainWindow.setTitle("Topics");
    }
    @FXML
    public void projects() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/fxml/projects.fxml"));
        Main.mainWindow.setTitle("Projects");
        Main.mainWindow.setScene(new Scene(root));
    }
    @FXML
    public void reports() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/fxml/reports.fxml"));
        Main.mainWindow.setTitle("Projects");
        Main.mainWindow.setScene(new Scene(root));
    }
    @FXML
    public void exit() {
        System.exit(0);
    }


}
