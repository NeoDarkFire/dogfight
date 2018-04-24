package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

public class DogfightView implements IViewSystem, Runnable{
	
	private EventPerformer eventPerformer;
	
	private GraphicsBuilder graphicsBuilder;
	
	private GameFrame gameFrame;

	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public void displayMessage(String message) {
		
	}
	
	public void closeAll() {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}
