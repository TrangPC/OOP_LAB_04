package hust.soict.dsai.aims.media;

import java.util.ArrayList;
// Disc
	
	
public class CompactDisc extends Media implements Playable {
	
	
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(int id2, String title2, String category2, float cost2,String artist,ArrayList<Track> track, ArrayList<Track> tracks) {
		super(id2, title2, category2, cost2 );
		this.artist=artist;
		this.tracks=tracks;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}
//	 
//	public String getArtist() {
//		return artist;
//	}
//	public ArrayList<Track> getTracks() {
//		return tracks;
//	}
	
	public void addTrack(Track track){
		if(!tracks.contains(track)) tracks.add(track);
	}
	public void removeTrack(Track track)
	{
		if(tracks.contains(track)) tracks.remove(track);
	}
	public int getLength()
	{
		if(!tracks.isEmpty()) return tracks.size();
		return 0;
	}
	public void play()
	{
		System.out.println("Artist : "+ this.artist);
		System.out.print("Track's play : \n");
		for(Track x: tracks)
		{
			x.play();
			// ??????????????????????????????????????????????????????????????????
		}
	}
}
