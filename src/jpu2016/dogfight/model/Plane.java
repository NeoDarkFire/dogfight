package jpu2016.dogfight.model;

public class Plane extends Mobile {

	static private final int SPEED = 2;
	static private final int WIDTH = 100;
	static private final int HEIGHT = 30;
	
	private int player;
	
	public Plane(int player, Direction direction, Position position, String image) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		this.player = player;
	}
	
	public boolean isPlayer(int player) {
		return player == this.player;
	}
	
	public boolean hit() {
		this.getDogfightModel().removeMobile((IMobile) this);
		return true;
	}

}
