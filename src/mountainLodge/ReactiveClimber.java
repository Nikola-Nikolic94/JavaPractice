package mountainLodge;

public class ReactiveClimber extends MountainClimber{
	
	private int gearWeight;
	private String countyName;
	private double maxRise;
	
	public ReactiveClimber() {
		
	}

	public ReactiveClimber(int iD, String fullName, int gearWeight, String countyName, double maxRise) {
		super(iD, fullName);
		this.gearWeight = gearWeight;
		this.countyName = countyName;
		this.maxRise = maxRise;
	}
	public int getGearWeight() {
		return gearWeight;
	}
	public String getCountyName() {
		return countyName;
	}
	public double getMaxRise() {
		return maxRise;
	}
	@Override
	public double subscription() {
		return 1000;
	}
	@Override
	public boolean successfulRise(Mountain mountain) {
		if(mountain.getHeights() <= this.maxRise - (this.gearWeight*50)) {
			return true;
		}
		return false;
	}
	@Override
	public void print() {
		
		System.out.println("Reactive climber, id: (" + this.ID + ")");
		System.out.println("Name: (" + this.fullName + ")");
		System.out.println("County: (" + this.countyName + ")");
		
	}
}
