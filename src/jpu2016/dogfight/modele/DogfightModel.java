package jpu2016.dogfight.modele;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel{

	private Sky sky ;
	private ArrayList <IMobile> mobiles ;
	
	public DogfightModel() {
		this.mobiles = new ArrayList<IMobile>();
	}
	
	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return (IArea) this.sky;
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub
		this.sky = new Sky(dimension);
	}

	@Override
	public void addMobile(IMobile Mobile) {
		// TODO Auto-generated method stub
		this.getMobiles().add(Mobile);
	}

	@Override
	public void removeMobile(IMobile Mobile) {
		// TODO Auto-generated method stub
		this.getMobiles().remove(Mobile);
	}


	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return this.mobiles;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		for (final IMobile mobile : this.getMobiles()) {
			if (mobile.isPlayer(player)) { return mobile; }
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub
		
		
	}

	public void buildArea(java.awt.Dimension dimension) {
		// TODO Auto-generated method stub
		
	}
	
}
