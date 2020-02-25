package com.shoukreytom.control;

import com.shoukreytom.Main;
import com.shoukreytom.model.LoadData;
import com.shoukreytom.model.ProjectsModel;
import com.shoukreytom.model.TopicsModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.List;

public class Controller {

    @FXML
    public void topics() throws Exception{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/fxml/topics.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Topics");
        stage.show();
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
