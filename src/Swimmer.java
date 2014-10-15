import pool.BasketPool;
import pool.CubiclePool;
/**
 * 
 * @author debue,charneux
 *
 */

public class Swimmer {

private String name;
private BasketPool basket;
private CubiclePool cubicle;
private int unwearTime,swimmingTime,wearTime;

	public Swimmer(String name, BasketPool baskets, CubiclePool cubicles,int i, int j, int k) {
		this.setName(name);
		this.basket = baskets;
		this.cubicle = cubicles;
		this.unwearTime = i;
		this.swimmingTime = j;
		this.wearTime = k;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBasket(BasketPool basket) {
		this.basket = basket;
	}

	public CubiclePool getCubicle() {
		return cubicle;
	}

	public void setCubicle(CubiclePool cubicle) {
		this.cubicle = cubicle;
	}

	public int getUnwearTime() {
		return unwearTime;
	}

	public void setUnwearTime(int unwearTime) {
		this.unwearTime = unwearTime;
	}

	public int getSwimmingTime() {
		return swimmingTime;
	}

	public void setSwimmingTime(int swimmingTime) {
		this.swimmingTime = swimmingTime;
	}

	public int getWearTime() {
		return wearTime;
	}

	public void setWearTime(int wearTime) {
		this.wearTime = wearTime;
	}
	public BasketPool getBasket() {
		return basket;
	}
}
