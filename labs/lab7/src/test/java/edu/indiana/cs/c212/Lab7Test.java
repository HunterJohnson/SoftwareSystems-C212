package edu.indiana.cs.c212;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class Lab7Test {
		
	@Test(timeout = 1000)
	public void testMP3GetTitle1(){
		MP3 mp3 = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		assertEquals("Here Comes the Sun", mp3.getTitle());
	}
	
	@Test(timeout = 1000)
	public void testMP3GetLength1(){
		MP3 mp3 = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		assertEquals(185, mp3.getLengthInSeconds());
	}
	
	@Test(timeout = 1000)
	public void testMP3GetArtist1(){
		MP3 mp3 = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		assertEquals("The Beatles", mp3.getArtist());
	}
	
	@Test(timeout = 1000)
	public void testMP3GetCopyrightYear1(){
		MP3 mp3 = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		assertEquals(1969, mp3.getCopyrightYear());
	}
	
	@Test(timeout = 1000)
	public void testMP3getGenre(){
		MP3 mp3 = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		assertEquals("British Rock", mp3.getGenre());
	}
	
	@Test(timeout = 1000)
	public void testMP3setGenre(){
		MP3 mp3 = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		mp3.setGenre("Ed Sullivan Rock");
		assertEquals("Ed Sullivan Rock", mp3.getGenre());
	}
	
	@Test(timeout = 1000)
	public void testMP3MakeCopy(){
		MP3 mp3 = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		MP3 mp3copy = mp3.makeCopy();
		assertEquals(mp3, mp3copy);
	}
	
	@Test(timeout = 1000)
	public void testMP3MakeCopy2(){
		MP3 mp3 = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		MP3 mp3copy = mp3.makeCopy();
		mp3copy.setGenre("Pop Rock");
		assertFalse(mp3copy.equals(mp3));
	}
	
	@Test(timeout = 1000)
	public void testCDGetTitle1(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		assertEquals("2 Greatest Hits", beatles.getTitle());
	}
	
	@Test(timeout = 1000)
	public void testCDGetLengthInSeconds1(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		assertEquals(615, beatles.getLengthInSeconds());
	}
	
	@Test(timeout = 1000)
	public void testCDGetArtist1(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		assertEquals("The Beatles", beatles.getArtist());
	}
	
	@Test(timeout = 1000)
	public void testCDGetPublisher1(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		assertEquals("Capitol Records", beatles.getPublisher());
	}
	
	@Test(timeout = 1000)
	public void testCDGetCopyrightYear1(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		assertEquals(1982, beatles.getCopyrightYear());
	}
	
	@Test(timeout = 1000)
	public void testCDGetNumberOfTracks1(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		assertEquals(2, (int)beatles.getNumberOfTracks());
	}
	
	@Test(timeout = 1000)
	public void testCDGetGenre1(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		assertEquals("British Rock", beatles.getGenre());
	}
	
	@Test(timeout = 1000)
	public void testCDSetGenre1(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		beatles.setGenre("Classy Rock");
		assertEquals("Classy Rock", beatles.getGenre());
	}
	
	@Test(timeout = 1000)
	public void testCDGetTracks1(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		for(int i = 0; i < 2; i++){
			assertTrue(BeatlesGreatestHitsTracks.get(i).equals(beatles.getTracks().get(i)));
		}
	}
	
	@Test(timeout = 1000)
	public void testCDMakeCopy1(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		CD beatlesCopy = beatles.makeCopy();
		assertEquals(beatles, beatlesCopy);
	}
	
	@Test(timeout = 1000)
	public void testCDMakeCopy2(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		CD beatlesCopy = beatles.makeCopy();
		beatlesCopy.setGenre("The Most Classic of Rock");
		assertFalse(beatles.equals(beatlesCopy));
	}
	
	@Test(timeout = 1000)
	public void testCopyMediaCollection1(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		MP3 tubThumping = new MP3("Chumbawumba", "Tubthumping", 214, "Pop Rock", 1997);
		DVD theHobbit = new DVD("The Hobbit: An Unexpected Journey", 2012, 10140, "New Line Cinema", "Fantasy", "Peter Jackson");
		MediaCollection collection = new MediaCollection("My Collection");
		collection.add(beatles);
		collection.add(tubThumping);
		collection.add(theHobbit);
		MediaCollection collectionCopy = collection.copyCollection();
		for(int i = 0; i < collection.getSize(); i++){
			assertTrue(collection.getCollection().get(i).equals(collectionCopy.getCollection().get(i)));
		}
	}
	
	@Test(timeout = 1000)
	public void testCopyMediaCollection2(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		MP3 tubThumping = new MP3("Chumbawumba", "Tubthumping", 214, "Pop Rock", 1997);
		DVD theHobbit = new DVD("The Hobbit: An Unexpected Journey", 2012, 10140, "New Line Cinema", "Fantasy", "Peter Jackson");
		MediaCollection collection = new MediaCollection("My Collection");
		collection.add(beatles);
		collection.add(tubThumping);
		collection.add(theHobbit);
		MediaCollection collectionCopy = collection.copyCollection();
		((CD) collectionCopy.getCollection().get(0)).setGenre("British Invasion");
		assertFalse(collection.getCollection().get(0).equals(collectionCopy.getCollection().get(0)));
	}
	
	@Test(timeout = 1000)
	public void testCopyMediaCollection3(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		MP3 tubThumping = new MP3("Chumbawumba", "Tubthumping", 214, "Pop Rock", 1997);
		DVD theHobbit = new DVD("The Hobbit: An Unexpected Journey", 2012, 10140, "New Line Cinema", "Fantasy", "Peter Jackson");
		MediaCollection collection = new MediaCollection("My Collection");
		collection.add(beatles);
		collection.add(tubThumping);
		collection.add(theHobbit);
		MediaCollection collectionCopy = collection.copyCollection();
		((MP3) collectionCopy.getCollection().get(1)).setGenre("90's Pop");
		assertFalse(collection.getCollection().get(1).equals(collectionCopy.getCollection().get(1)));
	}
	
	@Test(timeout = 1000)
	public void testCopyMediaCollection4(){
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		MP3 tubThumping = new MP3("Chumbawumba", "Tubthumping", 214, "Pop Rock", 1997);
		DVD theHobbit = new DVD("The Hobbit: An Unexpected Journey", 2012, 10140, "New Line Cinema", "Fantasy", "Peter Jackson");
		MediaCollection collection = new MediaCollection("My Collection");
		collection.add(beatles);
		collection.add(tubThumping);
		collection.add(theHobbit);
		MediaCollection collectionCopy = collection.copyCollection();
		((DVD) collectionCopy.getCollection().get(2)).setGenre("Action/Fantasy");
		assertFalse(collection.getCollection().get(2).equals(collectionCopy.getCollection().get(2)));
	}
}