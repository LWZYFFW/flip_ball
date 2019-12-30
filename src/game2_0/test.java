package game2_0;

import java.util.ArrayList;

public class test{
	static ArrayList<Double> in = new ArrayList<>();
	
	public static void main(String[] args) {
//			for (int i = 0; i < in.size(); i++) {
//			System.out.println(in.get(i));
//		}
			System.out.println(in.isEmpty());
			
			
			in.add(0.1);
			System.out.println(in.isEmpty());
			
			in.clear();
			System.out.println(in.isEmpty());
			
			
//		int []inin = new int [12];
//		System.out.println();
//	
//		
//		//foreach
//		for (int i : inin) {
//			System.out.println(i);
//		}
	}
	
	public static boolean istrue(){
		for (int i = 0; i < 12; i++) {
			if(in.get(i)!= 0 && in.get(i) != 0)
				
			{	return false;
			}
		}
		
		return true;
	}
}


















//
///**
// * ²âÊÔsetonmouseÓëgetonmouse
// * 
// */
//import javafx.application.Application;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//public class test extends Application{
//	@Override
//	public void start(Stage arg0) throws Exception {
//		// TODO Auto-generated method stub
//		Pane pane = new Pane();
//		
//		Scene scene = new Scene(pane,500,500);
//		scene.setFill(Color.BLACK);
//		scene.setOnMousePressed(e -> {
//			
//			System.out.println(e.getX());
//			//184.66666666666666
//			System.out.println(scene.getOnMousePressed());
//			//game2_0.test$$Lambda$67/576334020@3a63ce3
//			
//		});
//		arg0.setTitle("00000000");
//		arg0.setScene(scene);
//		arg0.show();
//	}
//	public static void main(String[] args)  {
//		Application.launch(args);
//	}
//}
