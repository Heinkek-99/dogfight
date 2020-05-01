package jpu2016.dogfight.contoller;

public class UserOrder {

	private int player;
	public Order order;
	
	public UserOrder(int player, Order order) {
		this.player = player;
		this.order = order;
	}

	public int getPlayer() {
		return this.player;
	}

	public Order getOrder() {
		return this.order;
	}

	
}

	