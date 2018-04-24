package jpu2016.dogfight.model;

import jpu2016.dogfight.Mobile;

public class Missile extends Mobile {

	static private final int SPEED = 4;
	static private final int WIDTH = 30;
	static private final int HEIGHT = 10;
	static private final int MAX_DISTANCE_TRAVELED = 1400;
	static private final String IMAGE = "missile";
	
	private int distanceTraveled = 0;
	
	public Missile(Direction direction, Dimension dimension) {
		// TODO
	}
	
	public static int getWidthWithADirection(Direction direction) {
		if (direction == Direction.UP || direction == Direction.DOWN) {
			return this.getDimension().getWidth();
		} else {
			return this.getDimension().getHeight();
		}
	}
	
	public static int getHeightWithADirection(Direction direction) {
		if (direction == Direction.UP || direction == Direction.DOWN) {
			return this.getDimension().getHeight();
		} else {
			return this.getDimension().getWidth();
		}
	}
	
	@Override
	public void move() {
		super.move();
		this.distanceTraveled += this.getSpeed();
		if (this.distanceTraveled > MAX_DISTANCE_TRAVELED) {
			this.getDogfightModel().removeMobile(this);
		}
	}
	
	@Override
	public boolean isWeapon() {
		return true;
	} 
}
