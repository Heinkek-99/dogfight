package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.modele.IDogfightModel;

public class DogfightView implements IViewSystem, Runnable{
	private final EventPerformer eventPerformer;
	
	private  GraphicsBuilder graphicsBuilder;
	public String message;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		this.eventPerformer = new EventPerformer();
		// TODO Auto-generated constructor stub
		//eventPerformer = new  EventPerformer();
		//graphicsBuilder = new GraphicsBuilder();
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

	public GraphicsBuilder getGraphicsBuilder() {
		return graphicsBuilder;
	}
	public String  displaysMessage(String message) {
		return this.message = message;
		
	}

}
