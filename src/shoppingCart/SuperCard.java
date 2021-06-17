package shoppingCart;

public class SuperCard {

	private String cardNumber;
	private String ownerFullName;
	private double discount;
	
	public SuperCard() {
		
	}
	public SuperCard(String cardNumber, String ownerFullName, double discount) {
		super();
		this.cardNumber = cardNumber;
		this.ownerFullName = ownerFullName;
		this.discount = discount;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getOwnerFullName() {
		return ownerFullName;
	}
	public void setOwnerFullName(String ownerFullName) {
		this.ownerFullName = ownerFullName;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public void printCard() {
		System.out.println("(" + this.cardNumber + "), (" + this.ownerFullName + ")");
	}
}
