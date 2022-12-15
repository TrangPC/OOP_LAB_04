package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public abstract class Track implements Playable {
//	private String artist;
//	private ArrayList<Track> tracks = new ArrayList<Track>();
//	public String getArtist() {
//		return artist;
//	}	
//	public void addTrack(Track track)
//	{
//		if (!tracks.contains(track)) tracks.add(track);
//	}
//	public void removeTrack(Track track)
//	{
//		if (tracks.contains(track)) tracks.remove(track);
//	}
//	public int getLength()
//	{
//		if(!tracks.isEmpty()) return tracks.size();
//		return 0;
//	}
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	public Track(String title, int length) {
		 this.title = title;
        this.length = length;
		// TODO Auto-generated constructor stub
	}boo
	public void play()
	{
		System.out.println("Title : " + this.title);
		System.out.println("Length : " + this.length);
	}
	public boolean equalsTrack(Track track1, Track track2)
	{
		if(track1.getLength()==track2.getLength()&& track1.getTitle().equals(track2.getTitle())) return true;
		return false;
	}
}
