package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;
import jpu2016.gameframe.IEventPerformer;
import jpu2016.gameframe.IGraphicsBuilder;

public class DogfightView implements IViewSystem, Runnable{
	
	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicsBuilder;
	private GameFrame gameFrame;

	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		// TODO Auto-generated constructor stub
		this.eventPerformer = (EventPerformer) orderPerformer;
		this.graphicsBuilder = new GraphicsBuilder(dogfightModel);
		this.gameFrame = new GameFrame("Dog fight", this.eventPerformer, this.graphicsBuilder, observable);
	}
	
	public void displayMessage(String message) {
		System.out.println(message);
	}
	
	public void closeAll() {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.gameFrame.setVisible(true);
		
	}

}
