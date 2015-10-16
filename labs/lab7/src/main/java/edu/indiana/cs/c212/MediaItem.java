package edu.indiana.cs.c212;

public interface MediaItem {
	/**
	 * @return the number of seconds, as an int, it would take to play the Media
	 */
	public int getLengthInSeconds();
	
	/**
	 * @return the number of minutes, as a double, it would take to play the Media
	 */
	public double getLengthInMinutes();
	
	/**
	 * @return the number of hours, as a double, it would take to play the Media
	 */
	public double getLengthInHours();

	/**
	 * @return the Title of the Media
	 */
	public String getTitle();
	
	/**
	 * @return the year the Media was copyrighted
	 */
	public int getCopyrightYear();
	
	/**
	 * makeCopy returns a copy of the Media (note, this is not the
	 * same thing as returning a copy of a reference to the media. If
	 * you modify the copy it should not change any information in the
	 * original.)
	 * 
	 * @return a copy of the Media
	 */
	public Media makeCopy();
}
