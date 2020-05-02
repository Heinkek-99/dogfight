package jpu2016.dogfight.modele;

public class Missile extends Mobile{
	
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction,Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
		this.distanceTraveled = 0;
		
	}
	
	public static int getWidthADirection(Direction direction) {
		if (direction == Direction.UP || direction == Direction.DOWN) {
			return WIDTH;
		} else {
			return HEIGHT;
		}
	}

	public static int getHeightADirection(Direction direction) {
		if (direction == Direction.UP || direction == Direction.DOWN) {
			return HEIGHT;
		} else {
			return WIDTH;
		}
	}
	
	public void move() {
		super.move();
		this.distanceTraveled += this.getSpeed();
		if (this.distanceTraveled > MAX_DISTANCE_TRAVELED) {
			this.getDogfightModel().removeMobile((IMobile) this);
		}
		
	}
	
	public boolean isWeapon() {
		return true;
	}
}
