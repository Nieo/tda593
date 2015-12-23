package build.gui;

import RootElement.Hotel;
import RootElement.impl.HotelFactory;
import build.gui.util.FXUtil;
import build.gui.util.ImageLoader;
import build.gui.util.Settings;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application{
	
	private static Hotel hotel = (Hotel) HotelFactory.createHotelSystem();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("HMS - "+Settings.getProperty("hotel.name"));
        primaryStage.getIcons().add(ImageLoader.loadImage("logo.png"));
        primaryStage.setOnCloseRequest((WindowEvent event) -> {
        	System.out.println("Closing application.");
        });
        
        FXUtil.switchLayout(primaryStage, "login");
        FXUtil.setAllowResize(primaryStage, false);
    }
    
    public static Hotel getHotel(){
    	return hotel;
    }
    
    public static void main(String[] args) {
    	launch();
    }
}
