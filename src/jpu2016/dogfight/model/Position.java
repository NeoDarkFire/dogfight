package jpu2016.dogfight.model;

public class Position {
	
private double x;
private double y;
private double maxX;
private double maxY;

public Position(double x, double y, double maxX, double maxY) {
	this.setX(x);
	this.setY(y) ;
	this.setMaxX(maxX) ;
	this.setMaxY(maxY);	
}
public Position(Position position) {
this.setX(position.getX());
this.setY(position.getY()) ;
this.setMaxX(position.maxX) ;
this.setMaxY(position.maxY);	

}
public Position position ;

public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}


protected void setMaxX(double maxX) {
	this.maxX = maxX;
}

public void setMaxY(double maxY) {
	this.maxY = maxY;
}


}
