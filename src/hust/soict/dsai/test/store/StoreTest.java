package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		Store exam = new Store();
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation","Roger Allers",87,19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
			
		exam.addDVD(dvd1);	
		exam.printlist();
		exam.addDVD(dvd2);
		exam.printlist();
		exam.removeDVD(dvd1);
		exam.printlist();
		exam.removeDVD(dvd2);
		exam.printlist();
	}

}

