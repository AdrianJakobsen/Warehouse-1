package test;

import implementation.CD;
import implementation.CDArkiv;

public class TestMain {

	public static void main(String[] args) {
		CDArkiv archive = new CDArkiv();
		archive.addCD("paul mcartney", 1969, 39.99,"Yellow Submarine","Party ","master of puppets ");
		archive.addCD("megaman", 2000, 49.99,"happy ","sad ","angry ","lasy ");
		archive.addCD("gadget", 1990, 5.39,"pai ","partyman");
		//archive.showArchive();
		System.out.println(archive.toString());
	}
}