package jpu2016.dogfight.view;

import java.util.Observable;

public class DogfightView implements IViewSystem, Runnable{
	private final EventPerformer eventPerformer;
	
	private final GraphicsBuilder graphicsBuilder;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		// TODO Auto-generated constructor stub
		eventPerformer = new  EventPerformer();
		graphicsBuilder = new GraphicsBuilder();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		
	}



}
