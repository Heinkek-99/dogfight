package jpu2016.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {
	
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer);
	
	public int getGlobalWidh();
	
	public int getGlobalHeight();
	
}
