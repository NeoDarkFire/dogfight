package jpu2016.dogfight.model;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Observable;


public class DogfightModel extends Observable implements IDogfightModel {
	private Sky sky ;
	
	
	public DogfightModel() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addMobile(IMobile mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeMobile(IMobile mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<IMobile> getMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub

	}

}
