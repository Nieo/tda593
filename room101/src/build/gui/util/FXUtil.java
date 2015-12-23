package build.gui.util;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

public class FXUtil {
	
	public static void switchLayout(Stage stage, String name){
		switchLayout(stage, name, null, false);
	}
	
	public static void switchLayout(Stage stage, String name, boolean fullSize){
		switchLayout(stage, name, null, fullSize);
	}
	
	public static void switchLayout(Stage stage, String name, Function func){
		switchLayout(stage, name, func, false);
	}

	public static void switchLayout(Stage stage, String name, Function func, boolean fullSize) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(FXUtil.class.getClassLoader().getResource(name+".fxml"));
            Parent rootLayout = loader.load();
            
            //Perform function on controller
            if(func != null){
            	func.perform(loader.getController());
            }
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            stage.setScene(scene);
            if(!stage.isShowing()){
            	stage.show();
            }
            
            if(fullSize){
            	stage.setMaximized(true);
            }else{
            	stage.setMaximized(false);
            	stage.sizeToScene();
            	stage.centerOnScreen();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static void showModalWindow(Window parentWindow, Parent rootNode, String title, Image icon){
		Stage stage = new Stage();
		stage.setScene(new Scene(rootNode));
		stage.setTitle(title);
		stage.getIcons().add(icon);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(parentWindow);
		stage.setResizable(false);
		stage.show();
	}
	
	public static Node getNode(String name){
		return getNode(name, null);
	}
	
	public static Node getNode(String name, Function function){		
		try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(FXUtil.class.getClassLoader().getResource(name+".fxml"));
            Node loadedNode = (Node)loader.load();
            if(function != null){
            	function.perform(loader.getController());
            }
            
            return loadedNode;
        } catch (IOException e) {
            System.out.println("Could not load component ["+name+"]: "+e.getMessage());
            
            e.printStackTrace();
            return null;
        }
	}
	
	public static void setAllowResize(Stage stage, boolean allow){
		stage.setResizable(allow);
	}
	
	
	public interface Function{
		
		public <T> void perform(T controller);
		
	}
}
