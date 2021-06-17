package shoppingCart;

import java.util.ArrayList;

public class Cart {

	private ArrayList<Packaging> articles = new ArrayList<>();
	
	public Cart() {
		
	}
	public ArrayList<Packaging> getArticles() {
		return articles;
	}
	public void addAnArticle(Packaging article) {
		articles.add(article);
	}
	public void deleteAnArticle(String barcode) {
		if(articles.get(0).getBarcode().equals(barcode)) {
			articles.remove(0);
		}
	}
	private double priceWithDiscount(double discount) {
		double sum = 0;
		for(int i = 0; i < articles.size(); i++) {
			sum += articles.get(i).price();
		}	
		return sum - discount;
	}
	public double priceOfTheCart(SuperCard sc) {
		return priceWithDiscount(sc.getDiscount());
	}
}
