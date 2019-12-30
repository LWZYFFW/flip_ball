package game2_0;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball extends Circle{

    public final static double radius = 10;
	
	public  double x = 200;

	public  double y = 590;
   
    public Ball() {
		// TODO Auto-generated constructor stub
    	super(200,590,radius,Color.WHITE);
		//setFill(Color.WHITE);
	}
	public Ball(double i,double o) {
		// TODO Auto-generated constructor stub
		
		super(i,o,radius);
		setFill(Color.WHITE);
	}
}
