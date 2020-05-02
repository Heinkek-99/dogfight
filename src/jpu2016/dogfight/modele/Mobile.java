package jpu2016.dogfight.modele;

import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

public class Mobile implements IMobile{

	private int speed;
	private Position position;
	private Dimension dimension;
	private ArrayList<Image> images;
	private DogfightModel dogfightModel;
	private Direction direction;
	
	public Mobile (Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.setDirection(direction) ;
		this.position = position ;
		this.dimension = dimension ;
		this.speed = speed ;
		this.images = new ArrayList<Image>() ;
		//TODO ajouter une image
	}
	
	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return direction;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		this.direction = direction;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		Point point = new Point();
        point.setLocation(this.position.getX(), this.position.getY());
        return point;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return this.dimension;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return this.dimension.getWidth() ;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return this.dimension.getHeight() ;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public IDogfightModel getDogfightModel () {
		return this.dogfightModel;
	}
	
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		this.dogfightModel = dogfightModel;
		
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

}
