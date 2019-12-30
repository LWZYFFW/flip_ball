package game2_0;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Block {

	Image image = new Image("file:///D:/JAVADev/ÏîÄ¿2.0/blockimgs/block-1.png");
	ImageView imageView = new ImageView(image);
	Pane pane = new Pane();
	
	
	public static double block_x ;
	public static double block_y ;
	
	public  Block(double x,double y) {
		// TODO Auto-generated constructor stub
		
		this.imageView.setX(x);
		this.imageView.setY(y);
		pane.getChildren().add(imageView);
		this.block_x = x;
		this.block_y = y;
	}
	
}
