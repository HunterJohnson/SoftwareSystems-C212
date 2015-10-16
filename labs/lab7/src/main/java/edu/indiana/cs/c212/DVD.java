package edu.indiana.cs.c212;

public class DVD extends Media{
	private String studio;
	private String genre;
	private String director;
	
	/**
	 * @param title, the title of the DVD
	 * @param copyrightYear, the year the DVD was copyrighted
	 * @param lengthInSeconds, the length in seconds of the DVD
	 * @param studio, the studio behind the DVD
	 * @param genre, the genre of the DVD
	 * @param director, the director of the recording on the DVD
	 */
	public DVD(String title, int copyrightYear, int lengthInSeconds, String studio, String genre, String director){
		this.title = title;
		this.copyrightYear = copyrightYear;
		this.lengthInSeconds = lengthInSeconds;
		this.studio = studio;
		this.genre = genre;
		this.director = director;
	}
	
	/**
	 * @return the recording studio for the DVD
	 */
	public String getStudio(){
		return this.studio;
	}
	
	/**
	 * @return the director of the DVD
	 */
	public String getDirector(){
		return this.director;
	}
	
	/**
	 * @return the genre of the DVD
	 */
	public String getGenre(){
		return this.genre;
	}
	
	/**
	 * Sets the genre of the DVD to the given genre
	 * 
	 * @param genre, the new genre of the DVD
	 */
	public void setGenre(String genre){
		this.genre = genre;
	}

	/* (non-Javadoc)
	 * @see edu.indiana.cs.c212.MediaItem#makeCopy()
	 */
	@Override
	public DVD makeCopy() {
		return new DVD(this.title, this.copyrightYear, this.lengthInSeconds, this.studio, this.genre, this.director);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object objdvd){
		if(objdvd instanceof DVD){
			DVD dvd = (DVD) objdvd;
			return(this.title.equals(dvd.title) &&
					this.copyrightYear == dvd.copyrightYear &&
					this.lengthInSeconds == dvd.lengthInSeconds &&
					this.studio.equals(dvd.studio) &&
					this.genre.equals(dvd.genre) &&
					this.director.equals(dvd.director));
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return (this.title + " (" + this.copyrightYear + ")");
	}

}
