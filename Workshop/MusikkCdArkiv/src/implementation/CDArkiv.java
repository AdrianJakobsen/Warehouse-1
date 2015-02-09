package implementation;

import java.util.ArrayList;

public class CDArkiv {
	private ArrayList<CD> archive;

	public CDArkiv() {	
		archive= new ArrayList<CD>();
	}
	public CDArkiv(String artist, int year, double prise, String...songs) {
		archive= new ArrayList<CD>();
		CD cd = new CD(artist, year, prise, songs);
		archive.add(cd);
	}

	public void addCD(String artist, int year, double prise,String...songs) {
		CD cd = new CD(artist, year, prise, songs);
		archive.add(cd);
	}
	public ArrayList<CD> getArchive(){
		return archive;
	}

	public void showArchive() {
		for(int i = 0; i<archive.size();i++){
			CD cd = archive.get(i);
			System.out.println(cd.getArtist() + " " +cd.getYear() + " " + cd.getPrise() + " " + cd.toString());
		}	
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<archive.size();i++){
			CD cd = archive.get(i);
			sb.append(cd.getArtist() + " " +cd.getYear() + " " + cd.getPrise() + " " + cd.toString() + "\n");
		}	
		return sb.toString();
	}
	public void removeCD(int index) {
		archive.remove(index-1);
		
	}
}