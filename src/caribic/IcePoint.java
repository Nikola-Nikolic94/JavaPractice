package caribic;

public class IcePoint extends Product{

	private String type;
	private boolean isBig;
	
	public IcePoint() {
		
	}
	public IcePoint(String type, boolean isBig) {
		super();
		this.type = type;
		this.isBig = isBig;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isBig() {
		return isBig;
	}
	public void setBig(boolean isBig) {
		this.isBig = isBig;
	}
	@Override
	public double priceForAll() {
		double sum = 0;
		if(isBig == false) {
			sum = this.priceForIngredients() + 100;
		} else {
			sum = this.priceForIngredients() + 130;
		}
		return sum;
	}
	@Override
	public void print() {
		System.out.println("Price of ingredients:");
		for(int i = 0; i < this.ingredients.size(); i++) {
			ingredients.get(i).print();
		}
		if(isBig == true) {
			System.out.println("The price of the big " + this.type + " IcePoint is " + this.priceForAll());
		} else {
			System.out.println("The price of the big " + this.type + " IcePoint is " + this.priceForAll());
		}
		
		
	}
	
	
}
