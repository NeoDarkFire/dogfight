package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener {
	
	private IEventPerformer eventPerformer;

	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		// TODO
		super(title);
		this.eventPerformer = performer;
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	@Override
	public void keyPressed(KeyEvent keyEvent) {
		this.eventPerformer.eventPerform(keyEvent);
	}

	@Override
	public void keyReleased(KeyEvent keyEvent) {
		
	}

	@Override
	public void keyTyped(KeyEvent keyEvent) {
		
	}
	
}
