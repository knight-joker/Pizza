package Pizza;

public class Pizza{
	
	//属性
	
	private String name;
	private int size;
	private int price;
	
	//方法
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSiza() {
		return size;
	}
	public void setSiza(int siza) {
		this.size = siza;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//展示披萨信息
	public String ShowPizza() {
		return "披萨的名字是：" + name + "\n披萨的大小是：" + size + "寸" + "\n披萨的价格是：" +price + "元";
		
	}
	
	//构造器
	
	public Pizza() {
		
	}
	/**
	 * @param name
	 * @param size
	 * @param price
	 */
	public Pizza(String name, int size, int price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	
	
}
