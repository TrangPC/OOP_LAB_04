package hust.soict.dsai.aims.media;

// extends Disc
public  class DigitalVideoDisc extends Media implements Playable {

		// TODO Auto-generated constructor stub
	

//public String title;
//public String category;
public String director;
public int length;
//public float cost;
//protected int id;


//public String getTitle() {
//	return title;
//}
//public String getCategory() {
//	return category;
//}
//public String getDirector() {
//	return director;
//}
//public int getLength() {
//	return length;
//}
//public float getCost() {
//	return cost;
//}
//
//
//public DigitalVideoDisc(String title) {
//	super();
//	this.title = title;
//}
//
//
//
//public void setTitle(String title) {
//	this.title = title;
//}
//public void setCategory(String category) {
//	this.category = category;
//}
//public void setDirector(String director) {
//	this.director = director;
//}
//public void setLength(int length) {
//	this.length = length;
//}
//public void setCost(float cost) {
//	this.cost = cost;
//}
//public String getCategory() {
//// TODO Auto-generated method stub
//return null;
//}
//public DigitalVideoDisc(String title, String category, float cost) {
//	super();
//	this.title = title;
//	this.category = category;
//	this.cost = cost;
//}
//public DigitalVideoDisc(String title, String category, String director, float cost) {
//	super();
//	this.title = title;
//	this.category = category;
//	this.director = director;
//	this.cost = cost;
//}
//public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
//	super();
//	this.title = title;
//	this.category = category;
//	this.director = director;
//	this.length = length;
//	this.cost = cost;
//}


public void getDetail(DigitalVideoDisc disc)
{
	System.out.println("Title: "+ disc.getTitle()+ "\tCategory: "+ disc.getCategory()+ "\tDirector: "+ disc.getDirector()+ "\tLength: "+ disc.getLength());
	}


private String getDirector() {
	// TODO Auto-generated method stub
	return null;
}


public int getLength() {
	// TODO Auto-generated method stub
	return length;
}


public DigitalVideoDisc(int id2, String title2, String category2, float cost2,int length,String director) {
	super(id2, title2, category2, cost2);
	this.length=length;
	this.director=director;
	}
public void play()
{
	System.out.println("Playing DVD: " + this.getTitle());
	System.out.println("DVD length: " + this.getLength());
}


}


