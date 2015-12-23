package build.gui.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import RootElement.Staff;
import RootElement.SysAdmin;
import build.gui.Main;
import build.gui.controller.User.WorkRole;
import build.gui.util.FXUtil;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginController {

	@FXML
	private AnchorPane root;
	@FXML
	private TextField userIDField;
	@FXML
	private Label errorMessage;
	private FadeTransition errorFade;
	
	private Map<String, WorkRole> users;
	
	
	
	public void initialize(){
		if(User.getCurrentUser().getStaffID() != null){
			userIDField.setText(User.getCurrentUser().getStaffID());
		}
	}
	
	public void checkEnter(KeyEvent ke){
		if(ke.getCode() == KeyCode.ENTER){
			login();
		}
	}
	
	public void login(){
		Stage stage = (Stage)root.getScene().getWindow();
		String staffID = userIDField.getText();
		WorkRole role = getWorkRole(staffID);
		if(role != null && role != WorkRole.NONE){
			//Reset resizeability
			FXUtil.setAllowResize((Stage)root.getScene().getWindow(), true);
			
			//Fetch correct data
			Staff staff = null;
			SysAdmin admin = null;
			switch(role){
				case MANAGER:	staff = Main.getHotel().getManager(staffID);break;
				case CLERK:		staff = Main.getHotel().getClerk(staffID);break;
				case STAFF:		staff = Main.getHotel().getStaff(staffID);break;
				case SYSADMIN:	admin = Main.getHotel().getSystemAdministrator();break;
				case NONE:		/* Cannot happen */ break;
			}
			
			User.setCurrentUser(staffID, staff, admin, role);
			
			//Switch to correct window
			FXUtil.switchLayout(stage, "main");
		}else{
			fadeErrorMessage();
		}
	}
	
	private void fadeErrorMessage(){
		if(errorFade != null){
			errorFade.stop();
		}
		errorMessage.setVisible(true);
		errorMessage.setOpacity(1.0);
		errorFade = new FadeTransition(Duration.seconds(2), errorMessage);
		errorFade.setDelay(Duration.seconds(1));
		errorFade.setFromValue(1.0);
		errorFade.setToValue(0.0);
		errorFade.setCycleCount(1);
		errorFade.setAutoReverse(false);
		errorFade.onFinishedProperty().set(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent ae) {
				errorMessage.setVisible(false);
				errorMessage.setOpacity(1.0);
			}
		});
		errorFade.play();
	}
	
	
	private WorkRole getWorkRole(String userID) {
		if(users == null){
			users = new HashMap<String, WorkRole>();
			Scanner sc = new Scanner(getClass().getClassLoader().getResourceAsStream("login.txt"));
			while(sc.hasNextLine()){
				String user = sc.nextLine();
				String[] data = user.split(",");
				if(data.length >= 3){
					WorkRole wr = WorkRole.getWorkRole(data[2]);
					if(wr != null){
						users.put(data[0], wr);
					}
				}
			}
			sc.close();
		}
		
		WorkRole r = users.get(userID);
		return (r==null?WorkRole.NONE:r);
	}
}
