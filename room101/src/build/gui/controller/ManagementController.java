package build.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class ManagementController {

	@FXML
	private TableView<String> roomsTable;
	
	public void initialize(){
		roomsTable.setPlaceholder(new Label("Oops, no rooms found!"));
	}
	
}
