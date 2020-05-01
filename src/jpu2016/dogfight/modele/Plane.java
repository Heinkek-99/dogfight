package jpu2016.dogfight.modele;

public class Plane extends Mobile{
	
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;
	public Plane(int player, Direction direction, Position position, String image) {
		super(direction, position, null, player, image);
		this.player = player;
	}
	
	public boolean isPlayer(int player){
		return false;
	}
	
	public boolean hit(){
		return false;
	}
	
}
