package jpu2016.dogfight.model;

import java.awt.Image;
import java.util.ArrayList;

public class Mobile {
	private int speed ;

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
		this.images = new ArrayList<Image> () ;
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
		
//TODO REMPLIR ICI VITE
		
	}
	public void placeInArea(IArea Area) {
		
	}
	public boolean isPlayer(int player) {
		
	}
	
	private void moveUp() { 
		
	}
	private void moveRight() {
		
	}
	private void moveDown() {
		
	}
	private void moveLeft() {
		
	}
	
	public Color getColor() {
		
	}
	
	public IDogfightModel getDogfightModel () {
		
	}
	
	
	public void setDogfightmodel( IDogfightModel dogfightModel ) {
		
	}

	public boolean hit() {
		
	}
	public boolean isWeapon() {
		
	}
	public Image getImage() {
		
	}
 }
