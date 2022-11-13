package Pizza;

public class FruitsPizza extends Pizza{
	//属性
	private String burdening;

	public String getBurdening() {
		return burdening;
	}

	public void setBurdening(String burdening) {
		this.burdening = burdening;
	}
	
	 //Override重写父类Showpizza方法
	public String ShowPizza() {
		return super.ShowPizza() + "\n加入的水果种类有：" + burdening;
	}

	//构造器
	public FruitsPizza() {
		
	}

	/**
	 * @param burdening
	 */
	public FruitsPizza(String name,int size,int price,String burdening) {
		super(name,size,price);
		this.burdening = burdening;
	}
	
	
	
}
