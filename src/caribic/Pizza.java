package caribic;

public class Pizza extends Product{

	private int priceOfBase;
	
	public Pizza() {
		
	}
	public Pizza(int price) {
		this.priceOfBase = price;
	}
	public int getPriceOfBase() {
		return priceOfBase;
	}
	public void setPriceOfBase(int priceOfBase) {
		this.priceOfBase = priceOfBase;
	}
	@Override
	public double priceForAll() {
		return priceForIngredients() + this.priceOfBase;
	}
	@Override
	public void print() {
		System.out.println("Price of ingredients:");
		for(int i = 0; i < this.ingredients.size(); i++) {
			ingredients.get(i).print();
		}
		System.out.println("The price of pizza is " + this.priceForAll());	
	}
	
}
