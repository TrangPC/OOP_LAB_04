package hust.soict.dsai.aims.store;

//import java.util.*;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
//import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	public  ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media dvd)
	{
		itemsInStore.add(dvd);
	}
	
	public void removeMedia(Media dvd)
	{
		itemsInStore.remove(dvd);
	}
	public Media findByTitle(String name)
	{
		for(Media media: itemsInStore)
		{
			if (media.getTitle().equals(name)) return media;
		}
		return null;
	}

	public void printlist()
	{
		for (Media x: itemsInStore)
			System.out.println(x.toString());
	}

	public void addDVD(DigitalVideoDisc dvd1) {
		// TODO Auto-generated method stub
		
	}

	public void removeDVD(DigitalVideoDisc dvd1) {
		// TODO Auto-generated method stub
		
	}
}


