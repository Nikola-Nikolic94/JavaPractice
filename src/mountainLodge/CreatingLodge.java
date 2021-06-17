package mountainLodge;

public class CreatingLodge {

	public static void main(String[] args) {
		
		MountainLodge ml = new MountainLodge("Lodge1", 1992);
		ml.memberJoin(new ReactiveClimber(1, "Milan Jovanovic", 10, "county1", 2000));
		ml.memberJoin(new ReactiveClimber(2, "Jovan Jovanovic", 15, "county2", 2500));
		ml.memberJoin(new ReactiveClimber(3, "Milan Milanovic", 20, "county3", 3500));
		ml.memberJoin(new Alpinist(4, "Pera Peric", 2));
		ml.memberJoin(new Alpinist(5, "Marko Markovic", 4));
		ml.memberJoin(new Alpinist(6, "Petar Petrovic", 0));
		ml.successfulRiseOfAll(new Mountain("Mountain", "Serbia", 2450));
		System.out.println(ml.lodgeIncome());
		ml.printAllMembers();
		ml.memberKick(2);
		ml.printAllMembers();
		System.out.println(ml.lodgeIncome());
		
	}

}
