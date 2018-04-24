package jpu2016.dogfight.model;


public class Cloud extends Mobile {
	private static final int SPEED = 1 ;
	private static final int WIDTH = 30 ;
	private static final int HEIGHT = 10 ;
	private static final String IMAGE = "cloud" ;
	
	public Cloud (Direction direction, Position position) {
		super ( direction , position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE ) ;
	}
	
}
