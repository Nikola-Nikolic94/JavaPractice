package shoppingCart;

public abstract class Packaging {

	protected String barcode;
	protected String name;
	protected double netWeight;
	protected double grossWeight;
	
	public Packaging() {
		
	}
	public Packaging(String barcode, String name, double netWeight, double grossWeight) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.netWeight = netWeight;
		this.grossWeight = grossWeight;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(int netWeight) {
		this.netWeight = netWeight;
	}
	public double getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(int grossWeight) {
		this.grossWeight = grossWeight;
	}
	public double packageWeight() {
		return this.grossWeight - this.netWeight;
	}
	public abstract double price();
	public abstract void print();
}
