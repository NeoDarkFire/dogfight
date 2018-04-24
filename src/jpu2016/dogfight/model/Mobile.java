package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;

public class Mobile {
	private int speed;
	private Direction direction ;
	private ArrayList<Image> images ;
	private Dimension dimension;
	private Position position ;
	private IDogfightModel dogfightModel ;

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.setDirection(direction) ;
		this.position = position ;
		this.dimension = dimension ;
		this.speed = speed ;
		this.images = new ArrayList<Image>() ;
		//TODO ajouter une image de vincent
	}

	public Direction getDirection() {
		return direction;
	}


	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Position getPosition() {
		return position;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public int getSpeed() {
		return speed;
	}

	public int getWidth () {
		return this.dimension.getWidth() ;
	}
	
	public int getHeight () {
		return this.dimension.getHeight() ;
	}
	
	public void move () {
		switch (this.getDirection()) {
			case UP : this.moveUp(); break;
			case DOWN : this.moveDown(); break;
			case LEFT : this.moveLeft(); break;
			case RIGHT : this.moveRight(); break;
		}
		
	}
	
	public void placeInArea(IArea Area) {
		
	}
	
	public boolean isPlayer(int player) {
		return false;
	}
	
	private void moveUp() { 
		Position pos = this.getPosition();
		pos.setY(pos.getY() - this.getSpeed());
	}
	
	private void moveRight() {
		Position pos = this.getPosition();
		pos.setX(pos.getX() + this.getSpeed());
	}
	
	private void moveDown() {
		Position pos = this.getPosition();
		pos.setY(pos.getY() + this.getSpeed());
	}
	
	private void moveLeft() {
		Position pos = this.getPosition();
		pos.setX(pos.getX() - this.getSpeed());
	}
	
	public Color getColor() {
		return new Color(255,255,255);
	}
	
	public IDogfightModel getDogfightModel () {
		return this.dogfightModel;
	}
	
	
	public void setDogfightmodel( IDogfightModel dogfightModel ) {
		this.dogfightModel = dogfightModel;
	}

	public boolean hit() {
		return false;
	}
	
	public boolean isWeapon() {
		return false;
	}
	
	public Image getImage() {
		return null;
	}
 }
