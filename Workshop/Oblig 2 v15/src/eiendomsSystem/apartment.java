package eiendomsSystem;

public class apartment extends Property{
	private double sharedDebt;
	private double rent;
	private int numberOfFloors;

	public apartment(String address, String name, int valuation, int gnr, int bnr) {
		setValuation(valuation);
		setGnr(gnr);
		setBnr(bnr);
		setAddress(address);
	}

	@Override
	public void printAllOffers(){
		System.out.println("Offers given for apartment " + getAddress() + ", valuation = " + getValutaion() + ", gnr = " + getGnr() + ", bnr = " + getBnr());
		System.out.println("Offer made\t\t\tDeadline\t\t\tName\t\t\tPhoneNumber");
		for(int i = 1; i<getOffers().size()+1; i++){
			Offer offer = getOffers().get(getOffers().size()-i);
			System.out.println(offer);
		}
	}
}
