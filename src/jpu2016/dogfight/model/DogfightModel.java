package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;


public class DogfightModel extends Observable implements IDogfightModel {
	private Sky sky ;
	private ArrayList <IMobile> mobiles ;
	
	public DogfightModel() {
		this.mobiles = new ArrayList<IMobile>();
	}
	
	@Override
	public IArea getArea() {
		return (IArea) this.sky;
	}

	@Override
	public void buildArea(Dimension dimension) {
		this.sky = new Sky (dimension);
	}

	@Override
	public void addMobile(IMobile mobile) {
		this.getMobiles().add(mobile);
	}

	@Override
	public void removeMobile(IMobile mobile) {
		this.getMobiles().remove(mobile);
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return this.mobiles;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		for (final IMobile mobile : this.getMobiles()) {
			if (mobile.isPlayer(player)) { return mobile; }
		}
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub

	}

}
