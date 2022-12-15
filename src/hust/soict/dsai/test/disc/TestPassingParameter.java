package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderallaDVD = new DigitalVideoDisc("Cinderella");
	swap(jungleDVD, cinderallaDVD);
	System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
	System.out.println("cinderella dvd title: "+ cinderallaDVD.getTitle());
	
	changeTitle(jungleDVD, cinderallaDVD.getTitle());
	System.out.println("jungle dvd title: "+ jungleDVD.getTitle());}
public static void swap(Object o1, Object o2)
{
	Object tmp= o1;
	o1=o2;
	o2=tmp;
	}
public static void changeTitle(DigitalVideoDisc dvd, String title) {
	String oldTitle = dvd.getTitle();
	dvd.setTitle(title);
	dvd=new DigitalVideoDisc(oldTitle);	
}
}
