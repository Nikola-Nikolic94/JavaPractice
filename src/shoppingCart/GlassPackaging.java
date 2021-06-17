package shoppingCart;

public class GlassPackaging extends Packaging{

	private double priceForPackaging;
	private boolean isPayingForPackaging;
	private double basePrice;
	
	public GlassPackaging() {
		
	}
	public GlassPackaging(String barcode, String name, double netWeight, double grossWeight, double priceForPackaging, boolean isPayingForPackaging, double basePrice) {
		super(barcode, name, netWeight, grossWeight);
		this.priceForPackaging = priceForPackaging;
		this.isPayingForPackaging = isPayingForPackaging;
		this.basePrice = basePrice;
	}
	public double getPriceForPackaging() {
		return priceForPackaging;
	}
	public void setPriceForPackaging(double priceForPackaging) {
		this.priceForPackaging = priceForPackaging;
	}
	public boolean isPayingForPackaging() {
		return isPayingForPackaging;
	}
	public void setPayingForPackaging(boolean isPayingForPackaging) {
		this.isPayingForPackaging = isPayingForPackaging;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	@Override
	public double price() {
		if(isPayingForPackaging) {
			return this.basePrice * 1.2 + this.priceForPackaging;
		} else {
			return this.basePrice * 1.2;
		}
	}
	@Override
	public void print() {
		System.out.println("(" + this.barcode + ") (" + this.name + 
				") (" + this.packageWeight() + ") (" + this.price() + ")");
		if(isPayingForPackaging) {
			System.out.println("Packaging bail is: " + this.priceForPackaging);
		} else {
			System.out.println("Doesn't have packaging bail");
		}
	}
	
}
