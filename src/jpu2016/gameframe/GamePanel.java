package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8825619464147997566L;

	public GamePanel(IGraphicsBuilder graphicsBuilder) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(Observable observable, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponent(Graphics graphic) {
		
	}

	
}
