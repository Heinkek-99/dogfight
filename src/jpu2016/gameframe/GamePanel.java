package jpu2016.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8825619464147997566L;

	private IGraphicsBuilder graphicBuilder;
	private ImageObserver observer;
	private Observable observable ;
	
	public GamePanel(IGraphicsBuilder graphicBuilder) {
		// TODO Auto-generated constructor stub
		this.graphicBuilder =graphicBuilder;
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		this.repaint();
		
	}
	
	public void paintComponent(Graphics graphic) {
		this.graphicBuilder.applyModelToGraphics(graphic, observer);
	}

	public Observable getObservable() {
		return observable;
	}

public void update (Observable observable){
		
	}
}
