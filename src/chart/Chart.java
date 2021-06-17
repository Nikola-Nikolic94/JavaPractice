package chart;

public class Chart {

	private String name;
	private int [] data;
	
	public Chart() {
		
	}
	public Chart(String name, int [] data) {
		this.name = name;
		this.data = data;
	}		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getData() {
		return data;
	}
	public void setData(int[] data) {
		this.data = data;
	}
	public double maxNumber() {
		double maxNumber = 0;
		
		for (int i = 0; i < this.data.length; i++) {
			if(this.data[i] > maxNumber) {
				maxNumber = this.data[i];
			}
		}		
		return maxNumber;
	}
	public void print() {
		System.out.println("Chart: " + this.name);
		for(double i = maxNumber(); i > 0; i-= maxNumber()/10) {
			System.out.println();			
			if(i == maxNumber()/10) {
				System.out.print(i + " ");
			} else {
				System.out.print(i);
			}
			for (int n = 0; n < this.data.length; n++) {
				if (this.data[n] >= i) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
		}
	}
	
	
}
