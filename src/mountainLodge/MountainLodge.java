package mountainLodge;

import java.util.ArrayList;

public class MountainLodge {

	private String name;
	private int yearOfFoundation;
	private ArrayList<MountainClimber> climbers = new ArrayList<>();
	
	public MountainLodge() {
		
	}
	public MountainLodge(String name, int yearOfFoundation) {
		this.name = name;
		this.yearOfFoundation = yearOfFoundation;
	}
	public String getName() {
		return name;
	}
	public int getYearOfFoundation() {
		return yearOfFoundation;
	}
	public ArrayList<MountainClimber> getClimbers() {
		return climbers;
	}
	public void memberJoin(MountainClimber mc) {
		this.climbers.add(mc);
	}
	public int successfulRiseOfAll(Mountain mountain) {
		int count = 0;
		for(int i = 0; i < this.climbers.size(); i++) {
			if(this.climbers.get(i).successfulRise(mountain)) {
				count++;
			}
		}	
		return count;
	}
	public void memberKick(int id) {
		for(int i = 0; i < this.climbers.size(); i++) {
			if(this.climbers.get(i).getID() == id) {
				this.climbers.remove(i);
			}
		}
	}
	public void printAllMembers() {
		for (int i = 0; i < this.climbers.size(); i++) {
			this.climbers.get(i).print();
		}
	}
	public double lodgeIncome() {
		double income = 0;
		for(int i = 0; i < this.climbers.size(); i++) {
			income += this.climbers.get(i).subscription();
		}	
		return income;
	}
	
}
