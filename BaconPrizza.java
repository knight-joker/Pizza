package Pizza;

public class BaconPrizza extends Pizza {
	//属性
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	//重写父类ShowPizza
	public String ShowPizza() {
		return super.ShowPizza() + "\n培根的克数是：" + weight + "克";
	}

	//构造器

	public BaconPrizza() {
	}

	public BaconPrizza(String name, int size, int price, int weight) {
		super(name, size, price);
		this.weight = weight;
	}
	

}
