package chart;

public class BuildChart {

	public static void main(String[] args) {
		int[] data =  { 520 , 860, 200, 120, 320, 44, 120, 280 };		
		Chart chart = new Chart("New Chart", data);
		
		chart.print();

	}

}
