package jpu2016.dogfight.model;

import java.awt.Dimension;
import java.util.ArrayList;

public interface IDogFightmodel {
	public IArea getArea ();
	public void buildArea(Dimension dimension ) ;
	public void addmobile ( IMobile mobile ) ;
	public void removeMobile ( IMobile mobile ) ;
	public ArrayList<IMobile> getMobile() ;
	public IMobile getMobileByPlayer (int player);
	public void setMobilesHavesMoved() ;
}
