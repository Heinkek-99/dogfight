package jpu2016.dogfight.modele;

import java.awt.Image;

public class Sky implements IArea{
	

	private Image image ;
	private Dimension dimension;
		
	public Sky (Dimension dimension) {
		
		this.dimension = dimension;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return dimension;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return image;
	}
}
