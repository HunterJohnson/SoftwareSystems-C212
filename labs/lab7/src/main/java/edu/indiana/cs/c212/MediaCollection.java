package edu.indiana.cs.c212;

import java.util.ArrayList;
import java.util.List;

public class MediaCollection {

    private List<MediaItem> collection;
    private String          name;

    MediaCollection(String name) {
        this.name = name;
        this.collection = new ArrayList<MediaItem>();
    }

    /**
     * copyCollection returns a copy of the media collection. It is
     * important to remember that this should involve a copy of every form
     * of Media in the collection.
     *
     * @return a copy of the media collection
     */
    public MediaCollection copyCollection() {
        //FIXME
        MediaCollection newMediaCollection = new MediaCollection(this.getName());
        for(MediaItem item : collection){
        	MediaItem newItem = item.makeCopy();
        	newMediaCollection.add((Media)newItem);
        }
        return newMediaCollection;
    }

    /**
     * @return the collection
     */
    public List<MediaItem> getCollection() {
        return this.collection;
    }

    /**
     * removes all media from the collection
     */
    public void removeAllMedia() {
        collection.clear();
    }

    /**
     * @param m, adds m to the collection
     */
    public void add(Media m) {
        this.collection.add(m);
    }

    /**
     * @return the name of the collection
     */
    public String getName() {
        return this.name;
    }

    /**
     * setName sets the collection's name to the given name
     *
     * @param name, the new name for the collection
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param m, remove all copies of m from the collection
     */
    public void remove(Media m) {
        for (int i = 0; i < collection.size(); i++) {
            if (m.getClass().equals(collection.get(i).getClass()) && m.equals(collection.get(i))) {
                collection.remove(i);
                i--;
            }
        }
    }

    /**
     * @return the number of items in the collection
     */
    public int getSize() {
        return collection.size();
    }

    /**
     * @return the total play time of all media in the collection in hours
     */
    public double getTotalPlaytimeInHours() {
        double playtime = 0;
        for (MediaItem m : collection) {
            playtime += m.getLengthInHours();
        }
        return playtime;
    }

	/* Note: any time you call System.out.println on an object, the println
	method will call that object's toString method to get the string it prints.
	When you see a string of hex come back at you when you call
	System.out.println on an object, it's likely because that object's class has not
	overridden Object's toString method */

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String output = this.name + "\n";
        int count = 1;
        for (MediaItem media : this.collection) {
            output += count + ": " + media.toString() + "\n";
            count++;
        }
        return output;
    }
}
