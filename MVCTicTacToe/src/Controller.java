import java.awt.Point;

public class Controller {
	private Model model;
	
	//default constructor
	public Controller() {
	}
	
	public void setup(Model model) {
		this.model=model;
	}
	
	//controller sending info to the model
	public void playermove (Point point) {
		model.movePlayer(point);
	}
}

