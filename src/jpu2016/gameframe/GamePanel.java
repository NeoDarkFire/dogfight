package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {

//	private Observable observable;
	private IGraphicsBuilder graphicsBuilder;
	
	public GamePanel(IGraphicsBuilder graphicsBuilder) {
		// TODO
		super();
		this.graphicsBuilder = graphicsBuilder;
//		this.observable = new Observable();
//		this.observable.addObserver(this);
	}
	
	public void paintComponent(Graphics graphic) {
		
	}
	
	@Override
	public void update(Observable observable, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
}
