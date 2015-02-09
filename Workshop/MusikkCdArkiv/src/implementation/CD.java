package implementation;

import java.util.ArrayList;

public class CD {
	private String artist;
	private int year;
	private double prise;
	private ArrayList<String> songList;


	public CD(String artist, int year, double prise, String...songs) {
		this.artist = artist;
		this.year=year;
		this.prise= prise;
		songList = new ArrayList<String>();
		for(String str: songs){
			songList.add(str);
		}
	}
	public CD() {
		this.artist="";
		this.year=0;
		this.prise=0;
		songList = new ArrayList<String>();
	}

	public String getArtist() {
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setPrise(double prise) {
		this.prise = prise;
	}

	public double getPrise() {
		return prise;
	}

	public void addSong(String song) {
		songList.add(song);
	}

	public ArrayList<String> getSongList(){
		return songList;	
	}

	public String toString() {
		String output ="";
		int i = songList.size();
		for (String str:songList){
			output =i-- + ": " + str + output;
		}
		return output;
	}	
}