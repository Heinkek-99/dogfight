package jpu2016.gameframe;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Observable;

import javax.swing.JFrame;

import jpu2016.dogfight.modele.IDogfightModel;
import jpu2016.dogfight.view.GraphicsBuilder;

public class GameFrame extends JFrame implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4494172804371767780L;
	static public int zoom = 10;
	private IDogfightModel dogfightModel;
	private final IEventPerformer eventPerformer;
	
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable ) throws IOException {
		this.eventPerformer = performer;
		// TODO Auto-generated constructor stub
		/*
		 * Titre du jeu
		 */
		this.setTitle(title);
		this.setSize(700,700);
		this.setContentPane(new GamePanel(graphicBuilder));

		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		
		/*
		 * 
		 */
		final GamePanel gamepanel = new GamePanel(new GraphicsBuilder(dogfightModel)); 
		this.setContentPane(gamepanel);
		//this.setSize((((Component) dogfightModel).getWidth() * zoom) + this.getInsets().left + this.getInsets().right, (((Component) dogfightModel).getHeight() * zoom) + this.getInsets().top + this.getInsets().bottom);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	
	@Override
	public void keyPressed(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent keyEvent) 
	{ try {
		this.eventPerformer.eventPerform(keyEvent);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.exit(-1);
	}
	
}
	

}
