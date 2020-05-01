package jpu2016.dogfight.modele;

public class Missile extends Mobile{
	
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction, Position position, Dimension dimension) {
		super(direction, position, dimension, HEIGHT, IMAGE);
		this.distanceTraveled = distanceTraveled;
	}
	
	public static int getWidthADirection(Direction direction) {
		return WIDTH;
	}

	public static int getHeightADirection(Direction direction) {
		return HEIGHT;
	}
	
	public void move() {
		
	}
	
	public boolean isWeapon() {
		return false;
	}
}
