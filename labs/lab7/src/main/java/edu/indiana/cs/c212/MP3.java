package edu.indiana.cs.c212;

public class MP3 extends Media{
	private String artist;
	private String genre;
	
	/**
	 * @param artist, the recording artist for the MP3
	 * @param title, the title of the recording on the MP3
	 * @param lengthInSeconds, the length in seconds of the MP3
	 * @param genre, the genre of the MP3
	 * @param copyrightYear, the year the MP3 was copyrighted
	 */
	public MP3(String artist, String title, int lengthInSeconds, String genre, int copyrightYear){
		//FIXME
		this.artist = artist;
		this.title = title;
		this.lengthInSeconds = lengthInSeconds;
		this.genre = genre;
		this.copyrightYear = copyrightYear;
	
	}

	/**
	 * @return the genre of the MP3
	 */
	public String getGenre(){
		//FIXME
		return this.genre;
	}
	
	/**
	 * setGenre sets the genre of the MP3 to the given genre
	 * 
	 * @param genre, the new genre of the MP3
	 */
	public void setGenre(String genre){
		//FIXME
		this.genre = genre;
	}
	
	/* (non-Javadoc)
	 * @see edu.indiana.cs.c212.MediaItem#makeCopy()
	 */
	@Override
	public MP3 makeCopy() {
		//FIXME
		return new MP3(this.artist,this.title,this.lengthInSeconds,this.genre,this.copyrightYear);
	}
	
	/**
	 * @return the recording artist for the MP3
	 */
	public String getArtist(){
		//FIXME
		return this.artist;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object objmp3){
		if(objmp3 instanceof MP3){
			MP3 mp3 = (MP3) objmp3;
			return (this.artist.equals(mp3.artist) &&
					this.copyrightYear == mp3.copyrightYear &&
					this.genre.equals(mp3.genre) &&
					this.title.equals(mp3.title) &&
					this.lengthInSeconds == mp3.lengthInSeconds);
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return (this.title + " - " + this.artist + " (" + this.copyrightYear +")");
	}
}
