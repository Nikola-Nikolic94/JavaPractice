package mountainLodge;

public class Alpinist extends MountainClimber{

	private int points;
	
	public Alpinist() {
		
	}
	public Alpinist(int iD, String fullName, int points) {
		super(iD, fullName);
		this.points = points;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	@Override
	public double subscription() {
		return 1500 - (50 * this.points);
	}
	@Override
	public boolean successfulRise(Mountain mountain) {
		if(mountain.getHeights() <= 4000) {
			return true;
		}
		return false;
	}
	@Override
	public void print() {
		
		System.out.println("Alpinist, id: (" + this.ID + ")");
		System.out.println("Name: (" + this.fullName + ")");
		System.out.println("Number of points: (" + this.points + ")");
		
	}
}
