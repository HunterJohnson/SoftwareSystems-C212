package edu.indiana.cs.c212;

import java.util.ArrayList;

public class MediaTest {

	public static void main(String[] args) {
		
		//Make a CD to add
		MP3 heyJude = new MP3("The Beatles", "Hey Jude", 430, "British Rock", 1968);
		MP3 hereComesTheSun = new MP3("The Beatles", "Here Comes the Sun", 185, "British Rock", 1969);
		ArrayList<MP3> BeatlesGreatestHitsTracks = new ArrayList<MP3>();
		BeatlesGreatestHitsTracks.add(hereComesTheSun);
		BeatlesGreatestHitsTracks.add(heyJude);
		CD beatles = new CD("2 Greatest Hits", "The Beatles", 1982, BeatlesGreatestHitsTracks, "Capitol Records", "British Rock");
		
		//Make an MP3 to add
		MP3 tubThumping = new MP3("Chumbawumba", "Tubthumping", 214, "Pop Rock", 1997);
		
		//Make a DVD to add
		DVD theHobbit = new DVD("The Hobbit: An Unexpected Journey", 2012, 10140, "New Line Cinema", "Fantasy", "Peter Jackson");
		
		//Make a media collection and add the above media to the collection
		MediaCollection myCollection = new MediaCollection("My Media");
		myCollection.add(theHobbit);
		myCollection.add(beatles);
		myCollection.add(tubThumping);
		
		//Print the collection
		System.out.println(myCollection);
	}

}
