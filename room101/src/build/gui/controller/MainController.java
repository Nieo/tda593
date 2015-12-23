package build.gui.controller;

import build.gui.controller.User.WorkRole;
import build.gui.util.FXUtil;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private AnchorPane root;
	@FXML
	private Label roleLabel;
	@FXML
	private Label staffIDLabel;
	@FXML
	private Label bookingMenuItem;
	@FXML
	private Label managementMenuItem;
	@FXML
	private Label supportTicketMenuItem;
	@FXML
	private Label feedbackMenuItem;
	@FXML
	private Label cleaningMenuItem;
	@FXML
	private AnchorPane contentPane;
	
	public void initialize(){
		User u = User.getCurrentUser();
		roleLabel.setText(u.getWorkRole().toString());
		staffIDLabel.setText(u.getStaffID()==null?" - ":u.getStaffID());
		
		//Only show the tabs that the user are permitted to see
		bookingMenuItem.setManaged(u.hasPermission(WorkRole.CLERK));
		managementMenuItem.setManaged(u.hasPermission(WorkRole.SYSADMIN));
		supportTicketMenuItem.setManaged(u.hasPermission(WorkRole.STAFF));
		feedbackMenuItem.setManaged(u.hasPermission(WorkRole.MANAGER));
		cleaningMenuItem.setManaged(u.hasPermission(WorkRole.STAFF));
		
		//Select first possible menu item
		for(Node menuItem : bookingMenuItem.getParent().getChildrenUnmodifiable()){
			if(menuItem.isManaged()){
				MouseEvent me = new MouseEvent(MouseEvent.MOUSE_CLICKED, 0, 0, menuItem.getLayoutX(), menuItem.getLayoutY(),
												MouseButton.PRIMARY, 1, false, false, false, false, true,
												false, false, false, false, false, null);
				menuItem.fireEvent(me);
				break;
			}
		}
	}

	public void gotoBookings(){
		setContent("booking");
	}

	public void gotoManagement(){
		setContent("management");
	}

	public void gotoSupportTickets(){
		setContent("supportTicket");
	}

	public void gotoFeedback(){
		setContent("feedback");
	}

	public void gotoCleaning(){
		setContent("cleaning");
	}
	
	private void setContent(String name){
		Node node = FXUtil.getNode(name);
		contentPane.getChildren().clear();
		contentPane.getChildren().add(node);
	}
	
	public void logout(){
		FXUtil.setAllowResize((Stage)root.getScene().getWindow(), false);
		FXUtil.switchLayout((Stage)root.getScene().getWindow(), "login");
	}
}
