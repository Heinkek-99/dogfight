package jpu2016.gameframe;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.sun.prism.paint.Color;
import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position;

import jpu2016.dogfight.modele.Direction;
import jpu2016.dogfight.modele.Mobile;

public class GamePanel extends JPanel implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8825619464147997566L;

	private IGraphicsBuilder graphicBuilder;
	private ImageObserver observer;
	private ImageObserver observable ;
	
	private Dimension dimension;
	private Direction direction;
	private Position position;
	private String image ;
	
	private Image sky;
	private Image missile;
	private Image Dog;
	
	public GamePanel(IGraphicsBuilder graphicBuilder) throws IOException{
		// TODO Auto-generated constructor stub
		this.graphicBuilder =graphicBuilder;
		Mobile mobile = new Mobile(this.direction, this.position, this.dimension, 3, "image/sky.png");
		mobile.buildAllImages(image);
		example();
	}
	
	@Override
	public void update(Observable observable, Object arg1) {
		// TODO Auto-generated method stub
		this.repaint();
		
	}
	
	public void example() {
		try {
			BufferedImage sky = ImageIO.read(new File("images/sky.png"));
			BufferedImage Dog = ImageIO.read(new File("images/Dog_RIGHT.png"));
			BufferedImage missile = ImageIO.read(new File("images/missile.png"));
			
		}catch (Exception e) {
			// TODO: handle exception
			
		}
		//setPreferredSize(new Dimension(200, 200));
		setBackground(Color.WHITE);
	}
	
	private void setBackground(Color white) {
		// TODO Auto-generated method stub
		
	}

	public void paintComponent(Graphics graphic) {
		//this.graphicBuilder.applyModelToGraphics(graphic, observer);
		super.paintComponent(graphic);
		graphic.drawImage(sky, 0, 0, getWidth(), getHeight(), this);
		graphic.drawImage(missile, 400, 110, this);
		graphic.drawImage(Dog, 100, 110, this);

	}
	
	/**
	 * @return the observable
	 */

	public ImageObserver getObservable() {
		return observable;
	}
	
	/**
	 * @param observable the observable to set
	 */
	public void setObservable(ImageObserver observable) {
		this.observable = observable;
	}

	public void update (Observable observable){
		
	}

	public void setGraphicBuilder(IGraphicsBuilder graphicBuilder) {
		this.graphicBuilder = graphicBuilder;
	}

}
