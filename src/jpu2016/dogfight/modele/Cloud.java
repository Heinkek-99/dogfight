package jpu2016.dogfight.modele;

public class Cloud extends Mobile{
	
	public Cloud(Direction direction, Dimension dimension) {
		super(direction, null, dimension, HEIGHT, IMAGE1);
		// TODO Auto-generated constructor stub
	}
	private static int SPEED = 1;
	private static int WIDTH = 300;
	private static int HEIGHT = 150;
	private static String IMAGE1 = "cloud";
	
}
