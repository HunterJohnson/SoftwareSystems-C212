package edu.indiana.cs.c212;

public abstract class Media implements MediaItem{
	protected String title;
	protected int lengthInSeconds;
	protected int copyrightYear;
	
	/* (non-Javadoc)
	 * @see edu.indiana.cs.c212.MediaItem#getTitle()
	 */
    @Override
	public String getTitle() {
		return this.title;
	}
	
	/* (non-Javadoc)
	 * @see edu.indiana.cs.c212.MediaItem#getCopyrightYear()
	 */
    @Override
	public int getCopyrightYear() {
		return this.copyrightYear;
	}

	/* (non-Javadoc)
	 * @see edu.indiana.cs.c212.MediaItem#getLengthInSeconds()
	 */
    @Override
	public int getLengthInSeconds() {
		return this.lengthInSeconds;
	}
	
	/* (non-Javadoc)
	 * @see edu.indiana.cs.c212.MediaItem#getLengthInMinutes()
	 */
    @Override
	public double getLengthInMinutes() {
		return this.getLengthInSeconds()/60.0;
	}
	
	/* (non-Javadoc)
	 * @see edu.indiana.cs.c212.MediaItem#getLengthInHours()
	 */
    @Override
	public double getLengthInHours(){
		return this.getLengthInMinutes()/60;
	}
}
