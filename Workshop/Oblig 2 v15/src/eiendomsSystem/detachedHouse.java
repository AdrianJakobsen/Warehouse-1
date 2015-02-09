package eiendomsSystem;

public class detachedHouse extends Property{
	private int type;
	public final int standAlone = 1;
	public final int row = 2;
	public final int doubleHouse = 3;

	public detachedHouse(String address, String name,double valuation, int gnr, int bnr, int type) {
		setValuation(valuation);
		setGnr(gnr);
		setBnr(bnr);
		this.type=type;
		setAddress(address);
	}
	private String getTypeAsString(){
		switch (type){
		case 1: 
			return "standAlone";
		case 2: 
			return "row";
		case 3: 
			return "doubleHouse";
		default: 
			return "Type Not Chosen";
		}
	}
	@Override
	public void printAllOffers(){
		System.out.println("Offers given for detachedHouse " + getAddress() + ", valuation = " + getValutaion() + ", gnr = " + getGnr() + ", bnr = " + getBnr() + ", type = " + getTypeAsString());
		System.out.println("Offer made\t\t\tDeadline\t\t\tName\t\t\tPhoneNumber");
		for(int i = 1; i<getOffers().size()+1; i++){
			Offer offer = getOffers().get(getOffers().size()-i);
			System.out.println(offer);
		}
	}
}

