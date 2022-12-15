package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media{
	
//	private int id; 
//	private String title;
//	private String category;
//	private float cost;
	private ArrayList<String> authors = new ArrayList<String>();
	public Book(int id, String title, String category, float cost, ArrayList<String> authors)
	{ super(id, title, category, cost);
	 this.authors = authors;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}



	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	

}
	public void addAuthor(String authorName)
	{
		if (!authors.contains(authorName)) authors.add(authorName);
		
	}
	public void removeAuthor(String authorName)
	{
		if (authors.contains(authorName)) authors.remove(authorName);
	}

//
//		public int getId() {
//			return id;
//		}
//
//
//
//		public void setId(int id) {
//			this.id = id;
//		}
//
//
//
//		public String getTitle() {
//			return title;
//		}
//
//
//
//		public void setTitle(String title) {
//			this.title = title;
//		}
//
//
//
//		public String getCategory() {
//			return category;
//		}
//
//
//
//		public void setCategory(String category) {
//			this.category = category;
//		}
//
//
//
//		public float getCost() {
//			return cost;
//		}
//
//
//
//		public void setCost(float cost) {
//			this.cost = cost;
//		}

}
