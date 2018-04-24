package jpu2016.dogfight.model;

public class Missile extends Mobile {

	static private final int SPEED = 4;
	static private final int WIDTH = 30;
	static private final int HEIGHT = 10;
	static private final int MAX_DISTANCE_TRAVELED = 1400;
	static private final String IMAGE = "missile";
	
	private int distanceTraveled;
	
	public Missile(Direction direction, Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
		this.distanceTraveled = 0;
	}
	
	public static int getWidthWithADirection(Direction direction) {
		if (direction == Direction.UP || direction == Direction.DOWN) {
			return WIDTH;
		} else {
			return HEIGHT;
		}
	}
	
	public static int getHeightWithADirection(Direction direction) {
		if (direction == Direction.UP || direction == Direction.DOWN) {
			return HEIGHT;
		} else {
			return WIDTH;
		}
	}
	
	@Override
	public void move() {
		super.move();
		this.distanceTraveled += this.getSpeed();
		if (this.distanceTraveled > MAX_DISTANCE_TRAVELED) {
			this.getDogfightModel().removeMobile((IMobile) this);
		}
	}
	
	@Override
	public boolean isWeapon() {
		return true;
	} 
}
