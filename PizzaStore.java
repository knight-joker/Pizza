package Pizza;
import java.util.Scanner;
import java.util.Scanner;

public class PizzaStore {
	public static Pizza getPizza(int choice) {
		Scanner sc = new Scanner(System.in);
		Pizza p = null;
		switch(choice) {
		case 1:{
			System.out.println("请录入培根的克数：");
			int weight = sc.nextInt();
			System.out.println("请录入披萨的大小：");
			int size = sc.nextInt();
			System.out.println("请录入披萨的价格：");
			int price = sc.nextInt();
			//将录入的信息封装为培根披萨对象
			BaconPrizza bp = new BaconPrizza("培根披萨",size,price,weight);
			//System.out.println(bp.ShowPizza());
			p = bp;
		}
			break;
		case 2:{
			System.out.println("请录入水果的种类：");
			String fruits = sc.next();
			System.out.println("请录入披萨的大小：");
			int size = sc.nextInt();
			System.out.println("请录入披萨的价格：");
			int price = sc.nextInt();
			//将录入的信息封装为水果披萨对象
			FruitsPizza fp = new FruitsPizza("水果披萨", size, price, fruits);
			//System.out.println(fp.ShowPizza());
			p = fp;
		}
		 	break;
		}
		return p;
		
	}

}
