package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class screenController implements Initializable {
	@FXML Button btnChange;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	
	}
	public void btnChangeAction(ActionEvent event) {
		Stage stage = (Stage) btnChange.getScene().getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Kiosk.fxml"));
			Scene sc = new Scene(root);
			stage.setScene(sc);
			stage.show();
			stage.setTitle("Kiosk 주문");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
