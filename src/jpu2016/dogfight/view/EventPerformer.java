package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	
	private IOrderPerformer orderPerformer;

	public EventPerformer(IOrderPerformer orderPerformer) {
		// TODO Auto-generated constructor stub
		this.orderPerformer = orderPerformer;
	}
	
	@Override
	public void eventPerform(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		this.keyCodeToUserOrder(keyCode.getKeyCode());
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		switch (keyCode) {
		/* Player #1 */
			case KeyEvent.VK_Z : return new UserOrder(1, Order.UP);
			case KeyEvent.VK_Q : return new UserOrder(1, Order.LEFT);
			case KeyEvent.VK_S : return new UserOrder(1, Order.DOWN);
			case KeyEvent.VK_D : return new UserOrder(1, Order.RIGHT);
			case KeyEvent.VK_C : return new UserOrder(1, Order.SHOOT);
		/* Player #2 */
			case KeyEvent.VK_UP : return new UserOrder(2, Order.UP);
			case KeyEvent.VK_LEFT : return new UserOrder(2, Order.LEFT);
			case KeyEvent.VK_DOWN : return new UserOrder(2, Order.DOWN);
			case KeyEvent.VK_RIGHT : return new UserOrder(2, Order.RIGHT);
			case KeyEvent.VK_3 : return new UserOrder(2, Order.SHOOT);
		}
		return null;
	}
	
}

