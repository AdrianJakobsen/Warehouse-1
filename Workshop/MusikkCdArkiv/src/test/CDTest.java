package test;

import static org.junit.Assert.*;
import implementation.CD;

import org.junit.Test;

public class CDTest {

	@Test
	public void checkDefaultConstructor() {
		CD cd = new CD();
		assertNotNull(cd);	
	}
	@Test
	public void checkParameterFilledConstructor(){
		CD cd = new CD("paul mcartney", 1969, 39.99);
		assertEquals("paul mcartney", cd.getArtist());
		assertEquals(1969, cd.getYear());
		assertEquals(39.99, cd.getPrise(),0);
	}
	@Test
	public void checkSetGetArtist(){
		CD cd = new CD();
		cd.setArtist("paul mcartney");
		assertEquals("paul mcartney" ,cd.getArtist());
	}
	@Test
	public void checkSetGetYear(){
		CD cd = new CD();
		cd.setYear(1969);
		assertEquals(1969, cd.getYear());	
	}
	@Test
	public void checkSetGetPrise(){
		CD cd = new CD();
		cd.setPrise(39.99);
		assertEquals(39.99, cd.getPrise(),0);
	}

	@Test
	public void checkAddSongToArrayListAndToString(){
		CD cd = new CD();
		cd.addSong("Yellow Submarine");
		assertEquals("1: Yellow Submarine", cd.toString());
	}
	@Test
	public void checkAdd3SongsTOArrayList(){
		CD cd = new CD();
		cd.addSong("Yellow Submarine");
		cd.addSong("Party");
		cd.addSong("master of puppets");
		assertEquals(3, cd.getSongList().size());
	}
	@Test
	public void checkParameterFilledConstructorAdd3Songs(){
		CD cd = new CD("paul mcartney", 1969, 39.99,"Yellow Submarine ","Party ","master of puppets ");
		assertEquals(3, cd.getSongList().size());
	}
}