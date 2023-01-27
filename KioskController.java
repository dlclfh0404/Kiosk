package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class KioskController implements Initializable {
	@FXML Button btnM1p, btnM1m, btnM2p, btnM2m, btnM3p, btnM3m, btnOrder, btnCancel;
	@FXML Label lblamount;
	@FXML TextArea txtOrder;
	
	public int sum = 0;
	private String[] orderm = {"아메리카노", "카푸치노", "카페라떼" };
	private int[] countm = new int[3];
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		for(int i = 0; i<3; i++) countm[i] = 0;
	}
	public void menuAppend() {
		txtOrder.setText("");
		for(int i=0; i<3; i++) {
			if(countm[i] != 0) txtOrder.appendText(orderm[i] + " " + countm[i] + "잔"+"\n");
		}
	}
	
	public void btnM1pAction(ActionEvent event) {
		countm[0]++;
		menuAppend();
	}
	
	public void btnM1mAction(ActionEvent event) {
		if(countm[0]>0) countm[0]--;
		else countm[0]=0;
		menuAppend();
	}
	
	public void btnM2pAction(ActionEvent event) {
		countm[1]++;
		menuAppend();
	}
	
	public void btnM2mAction(ActionEvent event) {
		if(countm[1]>0) countm[1]--;
		else countm[1]=0;
		menuAppend();
	}
	
	public void btnM3pAction(ActionEvent event) {
		countm[2]++;
		menuAppend();
	}
	
	public void btnM3mAction(ActionEvent event) {
		if(countm[2]>0) countm[2]--;
		else countm[2]=0;
		menuAppend();
	}
	
	public void btnOrderAction(ActionEvent event) {
		int m=0;
		int sumt=0;
		for(int i = 0; i <3; i++) {
			if(i==0) m=1000;
			if(i==1) m=2000;
			if(i==2) m=3000;
			sumt = sumt + countm[i] * m;
		}
		
//		lblamount.setText(String.valueOf(df.format(sum)));
//		lblamount.setText(Integer.toString(sum));
//		lblamount.setText(df.format(sum));
		
		lblamount.setText(Integer.toString(sumt));
		
	}
	
	public void btnCancelAction(ActionEvent event) {
		for(int i=0; i<3; i++) countm[i]=0;
		txtOrder.setText("");
		lblamount.setText("0");
	}
}

