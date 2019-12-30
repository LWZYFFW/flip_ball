package game2_0;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class test1 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		
		Image image = new Image("file:///D:/JAVADev/ÏîÄ¿2.0/blockimgs/block-1.png");
		ImageView imageView = new ImageView(image);
		imageView.setX(0);
		imageView.setY(0);
		pane.getChildren().add(imageView);
		
		Scene scene = new Scene(pane,400,600);
		scene.setFill(Color.BLACK);
		arg0.setScene(scene);
		arg0.setTitle("image");
		arg0.show();
	}

    public static void main(String[] args) {
	
    	Application.launch(args);
}

}
