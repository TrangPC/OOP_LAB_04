package hust.soict.dsai.aims.media;

public class Disc extends Media {

	public Disc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category,  cost);
		this.length = length;
        this.director = director;
		// TODO Auto-generated constructor stub
	}
	private int length;
	private String director;
	public String getDirector() {
	
		return director;
	}
	public int getLength() {
		return length;
	}
	
}
