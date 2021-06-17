package caribic;

import java.util.ArrayList;

public abstract class Product {

	protected ArrayList<Ingredient> ingredients = new ArrayList<>();
	
	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}
	public double priceForIngredients() {
		double sum = 0;
		for (int i = 0; i < ingredients.size(); i++) {
			sum += ingredients.get(i).getPrice();
		}
		return sum;
	}
	public abstract double priceForAll();
	public abstract void print();
}
