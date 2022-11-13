package Pizza;

import java.util.Scanner;

public class Windows {
	//这是一个main方法，程序的入口；
	public static void main(String args[]){
		//选择购买pizza
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择你想要购买的pizza + "
				+ "（1培根披萨 2水果披萨）");
		int choice = sc.nextInt();//选择
		//通过工厂获取披萨
		Pizza pizza = PizzaStore.getPizza(choice);
		System.out.println(pizza.ShowPizza());
	}
}
