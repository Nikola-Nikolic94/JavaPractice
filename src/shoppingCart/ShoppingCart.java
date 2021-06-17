package shoppingCart;

public class ShoppingCart {

	public static void main(String[] args) {
		
		Cart k1 = new Cart();
		k1.addAnArticle(new CartonBox("21313-213", "Mleko", 200, 250, true, 100));
		k1.addAnArticle(new CartonBox("556776-213", "Sok", 400, 500, true, 200));
		k1.addAnArticle(new GlassPackaging("11111-11", "Zajecarsko", 0.33, 1, 15, false, 50));
		k1.addAnArticle(new GlassPackaging("22222-11", "Tuborg", 0.5, 1.5, 25, true, 60));
		k1.addAnArticle(new GlassPackaging("33333-11", "Nisko", 0.33, 1, 12, true, 52));
		for(int i = 0; i < k1.getArticles().size(); i++) {
			k1.getArticles().get(i).print();
		}
		System.out.println("Total cart price is: " + k1.priceOfTheCart(new SuperCard("123-1231-1231", "Milan Jovanovic", 200)) + "rsd");
	}

}
