package caribic;

import java.util.ArrayList;

public class Order {

	public static void main(String[] args) {
		ArrayList<Product> order = new ArrayList<>();
		Product iP1 = new IcePoint("vanilla ", true);
		Product iP2 = new IcePoint("chocolate", true);
		Product iP3 = new IcePoint("vanilla ", false);
		Product pizza1 = new Pizza(100);
		Product pizza2 = new Pizza(150);
		Ingredient s1 = new Ingredient("ing1", 20);
		Ingredient s2 = new Ingredient("ing2", 30);
		Ingredient s3 = new Ingredient("ing3", 40);
		Ingredient s4 = new Ingredient("ing4", 50);
		Ingredient s5 = new Ingredient("ing5", 60);
		iP1.addIngredient(s1);
		iP1.addIngredient(s2);
		iP2.addIngredient(s2);
		iP3.addIngredient(s1);
		pizza1.addIngredient(s3);
		pizza1.addIngredient(s4);
		pizza1.addIngredient(s5);
		pizza2.addIngredient(s3);
		pizza2.addIngredient(s5);
		order.add(iP1);
		order.add(iP2);
		order.add(iP3);
		order.add(pizza1);
		order.add(pizza2);
		for(int i = 0; i < order.size(); i++) {
			order.get(i).print();
		}
	}

}
