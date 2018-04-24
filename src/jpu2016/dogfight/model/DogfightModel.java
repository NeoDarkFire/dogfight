package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;


public class DogfightModel extends Observable implements IDogfightModel {
	private Sky sky ;
	private ArrayList <IMobile> mobiles ;
	
	
	public DogfightModel() {
		this.mobiles = new ArrayList <IMobile> () ;
		this.sky = new Sky (new Dimension (100,100)) ;
	}
	
	@Override
	public IArea getArea() {
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
