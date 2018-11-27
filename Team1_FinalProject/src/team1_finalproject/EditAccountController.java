/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team1_finalproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditAccountController implements Initializable {

    //Variables
    @FXML
    private Label lblEditAccount;
    @FXML
    private Button btnPasswordGenerator;
    @FXML
    private Insets x1;
    @FXML
    private Button btnSaveEdit;
    @FXML
    private Button btnCancelEdit;
    @FXML
    private TextField tfEditAccountName;
    @FXML
    private Insets x3;
    @FXML
    private TextField tfEditAccountID;
    @FXML
    private Insets x2;
    @FXML
    private PasswordField tfEditAccountPassword;
    @FXML
    private TextField tfEditAccountURL;
    @FXML
    private ChoiceBox<?> choicebEditAccountType;
    @FXML
    private TextArea taEditAccountNotes;
    @FXML
    private Insets x4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    
    //Cancel Button: closes popup from main window
    public void Cancel(ActionEvent event) throws Exception {
        Stage addAccount = (Stage) ((Node) event.getSource()).getScene().getWindow();
        addAccount.close();
    }
}