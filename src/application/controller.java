package application;
import java.net.URL;
import java.time.Duration;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class controller {

    @FXML
    private Button close;

    @FXML
    private Button loginBtn;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    public void close() {
    	System.exit(0);
    }
    public void OpenAcceuil() {
    	TranslateTransition t=new TranslateTransition(Duration.Seconds(1),loginBtn);
    }
}
