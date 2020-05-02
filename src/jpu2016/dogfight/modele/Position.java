package jpu2016.dogfight.modele;

public class Position {
	
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	public Position(double x, double y, double maxX, double maxY) {
		this.setX(x);
		this.setY(y) ;
		this.setMaxX(maxX) ;
		this.setMaxY(maxY);
	}
	
	public Position(Position position) {
		this.setX(position.getX());
		this.setY(position.getY()) ;
		this.setMaxX(position.maxX) ;
		this.setMaxY(position.maxY);	
	
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		if (x > this.maxX) {
			this.x = x - this.maxX;
		} else if (x < 0) {
			this.x = x + this.maxX;
		}
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		if (y > this.maxY) {
			this.y = y - this.maxY;
		} else if (y < 0) {
			this.y = y + this.maxY;
		}
	}
	
	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	
	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}	

}
