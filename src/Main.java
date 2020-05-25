import java.awt.Dimension;
import java.io.IOException;

import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.modele.DogfightModel;
import jpu2016.dogfight.view.DogfightView;

public abstract class Main {

	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//final DogfightModel dogfightModel = new DogfightModel();
		//final DogfightController dogfightController = new DogfightController(dogfightModel);
		//final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel,
		//dogfightModel);
		//dogfightController.setViewSystem(dogfightView);
		//dogfightController.play();
	//}

	public static void main(String[] args) throws IOException {
		final DogfightModel dogfightModel = new DogfightModel();
		
		dogfightModel.buildArea(new Dimension(1520, 1080));

		final DogfightController dogfightController = new DogfightController(dogfightModel);
		
		
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		//dogfightModel.buildArea(new Dimension (1520, 1080));
		dogfightController.play();
	}
}
