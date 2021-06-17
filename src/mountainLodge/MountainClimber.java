package mountainLodge;

public abstract class MountainClimber {

	protected int ID;
	protected String fullName;
	
	public MountainClimber() {
		
	}
	public MountainClimber(int iD, String fullName) {
		ID = iD;
		this.fullName = fullName;
	}
	public int getID() {
		return ID;
	}
	public String getFullName() {
		return fullName;
	}
	public abstract void print();
	public abstract double subscription();
	public abstract boolean successfulRise(Mountain mountain);
}
