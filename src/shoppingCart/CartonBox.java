package shoppingCart;

public class CartonBox extends Packaging{

	private boolean isRecyclable;
	private double basePrice;
	
	public CartonBox() {
		
	}
	public CartonBox(String barcode, String name, double netWeight, double grossWeight, boolean isRecyclable, double basePrice) {
		super(barcode, name, netWeight, grossWeight);
		this.isRecyclable = isRecyclable;
		this.basePrice = basePrice;
	}
	public boolean isRecyclable() {
		return isRecyclable;
	}
	public void setRecyclable(boolean isRecyclable) {
		this.isRecyclable = isRecyclable;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	@Override
	public double price() {
		if(isRecyclable) {
			return this.packageWeight() * 1.5 + this.basePrice;
		} else {
			return this.basePrice;
		}
	}
	@Override
	public void print() {
		System.out.println("(" + this.barcode + ") (" + this.name + 
				") (" + this.packageWeight() + ") (" + this.price() + ")");
		if(isRecyclable) {
			System.out.println("Can be recycled");
		} else {
			System.out.println("Can't be recycled");
		}
	}
	
}
