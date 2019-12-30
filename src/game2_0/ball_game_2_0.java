package game2_0;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class ball_game_2_0 {

	
	int num = ballNum.num;
	//线程池
	ExecutorService executorService = Executors.newFixedThreadPool(num);
	//球类数组
	ArrayList<Pane2_0> sp = new ArrayList<Pane2_0>(num);
	
	
	Pane panes = new StackPane();
	
	public ball_game_2_0() {
		// TODO Auto-generated constructor stub

		for (int i = 0; i < num; i++) {
			sp.add(new Pane2_0());
			panes.getChildren().add(sp.get(i));
		}
		 
	}
	//判断每个球的  速度  是否为零 ===所有球是否停止
	public boolean go_istrue(){
		for (int i = 0; i < num; i++) {
			if(sp.get(i).dx != 0 && sp.get(i).dy != 0)
				
			{	return false;
			}
		}
		
		return true;
	}
	
	//将每个球类对象放到线程池中
	 public void go(){
		
		 for (int i = 0; i < num; i++) {
			// sp.get(i).x = newX.xx.get(0);
		 executorService.execute(sp.get(i));
		
		
		 }
		
	//	 executorService.shutdown();
	}
	
}
