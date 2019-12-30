package game2_0;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class game_2_0 extends Application {
	
	//球类
	ball_game_2_0 ball_game = new ball_game_2_0();
	//方块类
	BlockPane blockPane = new BlockPane();
//	Block block = new Block(1,1);
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
				
		   //聚合组件
		Pane spane = new StackPane();
		spane.getChildren().add(ball_game.panes);
		spane.getChildren().add(blockPane.blockpane);
		
		// if(ball_game.go_istrue()){
			
				//触发鼠标事件
		 spane.setOnMousePressed(e -> {
			 if(ball_game.go_istrue()){
				Pane2_0.dx1 = e.getX();
				Pane2_0.dy1 = e.getY();
				newX.xx.clear();
				
			 }
				
			 });
			 spane.setOnMouseReleased(e -> {
				 if(ball_game.go_istrue()){
				 
				Pane2_0.dx2 = e.getX();
				Pane2_0.dy2 = e.getY();				
				ball_game.go();
				 }	
			 });
		
		
		Scene scene = new Scene(spane, 400, 600);

		scene.setFill(Color.BLACK);
		arg0.setTitle("弹球");
		arg0.setScene(scene);
		arg0.show();
	}
	

	public static void main(String[] args) {
		Application.launch(args);
		//System.out.println(newX.xx.size());
	}
}
