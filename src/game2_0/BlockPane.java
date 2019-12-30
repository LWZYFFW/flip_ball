package game2_0;

import java.util.ArrayList;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class BlockPane {

	ArrayList<Block> blocks = new ArrayList<>();
	Pane blockpane = new Pane();

	public BlockPane() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < 6; i++) {

			blocks.add(new Block(400 / 7 * i, 55));
			// blocks.get(i).block_x = 400/7*i;
			// blocks.get(i).block_y = 55;
			blockpane.getChildren().add(blocks.get(i).pane);
		}
	}

	public void block_move() {
		// TODO Auto-generated method stub

	}
}
