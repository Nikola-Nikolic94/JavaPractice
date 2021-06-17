package mountainLodge;

public class Mountain {

	private String name;
	private String location;
	private double heights;
	
	public Mountain() {
		
	}
	public Mountain(String name, String location, double heights) {
		this.name = name;
		this.location = location;
		this.heights = heights;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getHeights() {
		return heights;
	}
	public void setHeights(double heights) {
		this.heights = heights;
	}
	
}
