package jpu2016.dogfight.modele;

public class Plane extends Mobile{
	
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private static final String IMAGE = "plane.png";
	
	private int player;
	public Plane(int player, Direction direction, Position position, String image) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
		this.player = player;
	}
	
	public boolean isPlayer(int player){
		return player == this.player;
	}
	
	public boolean hit(){
		this.getDogfightModel().removeMobile((IMobile) this);
		return true;
	}
	
}