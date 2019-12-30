package game2_0;


import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Point2D;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Pane2_0 extends Pane implements Runnable{

	public  static double dx1, dy1;
	public static double dx2, dy2;
//	public final static double radius = 10;
//	public float x = 200;
//	public double y = 590;
	public double dx = 0, dy = 0;
	
	
//	private Circle circle = new Circle(x, y, radius,Color.WHITE);
	private Timeline animation;
	Ball ball  = new Ball();
	public Pane2_0() {
		// TODO Auto-generated constructor stub

		//newX.xx.add((float) 200);
		//getChildren().add(circle);
		
		getChildren().add(ball);
			
			
		// ---------------------------keyframe对象，用于以一个固定速率调用moveball()方法
		animation = new Timeline(new KeyFrame(Duration.millis(2), e -> moveBall()));
		
		animation.setCycleCount(Timeline.INDEFINITE);

		animation.play();
	}

	
	public void play() {
		// TODO Auto-generated method stub
		animation.play();
	}

	public void pause() {
		// TODO Auto-generated method stub
		animation.pause();
	}
	//易错，球落地后平移到发射位置停下
	public void back(){
		if((newX.xx.get(0) - ball.x )< 0)
	    {
		dx = -1;			
		}
		if(newX.xx.get(0) - ball.x >0){
			dx =  1;
		}
		if((newX.xx.get(0) - ball.x) == 0) 
		{ball.x = newX.xx.get(0);
		    dx = 0;}
	}

	//碰撞->球碰到方块 改变方向
	private void istough() {
		// TODO Auto-generated method stub
		

	}
	protected void moveBall() {
		// TODO Auto-generated method stub

		     istough();
			if (ball.x < Ball.radius || ball.x > getWidth() - Ball.radius) {
				dx *= -1;
			}
			if (ball.y < Ball.radius) {
				dy *= -1;
			}
			if (ball.y > getHeight() - Ball.radius) {
				// x = 200;
				newX.xx.add(ball.x);
				ball.y = 590; 
				dy = 0;
				back();
				//再次发射的x
//				ball.x = newX.xx.get(0);
//      			dx = 0;

			}
			ball.x += dx;
			ball.y += dy;
			ball.setCenterX(ball.x);
			ball.setCenterY(ball.y);
			
		

	}
	

	

	// 手动改变速度方向and位置
	public void TestPoint2D() {
		// TODO Auto-generated method stub

	
			Point2D p1 = new Point2D(dx1, dy1);
			Point2D p2 = new Point2D(dx2, dy2);
			double len = p1.distance(p2);
			dx = (dx1 - dx2) / len;
			dy = (dy1 - dy2) / len;
		
	}
  
	

	
	private static Lock lock = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//while(newX.xx.get(ballNum.num-1) != null){
		lock.lock();

		
		TestPoint2D();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		lock.unlock();
		//}
		
	}

	
	
}
