package jpu2016.dogfight.modele;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel{

	public DogfightModel() {
		
	}
	
	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return getArea();
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMobile(IMobile Mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMobile(IMobile Mobile) {
		// TODO Auto-generated method stub
		this.getMobiles().remove(Mobile);
	}


	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return this.getMobiles();
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
	
}
