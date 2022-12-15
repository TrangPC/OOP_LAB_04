package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import hust.soict.dsai.aims.media.*;
public class Cart {
	
public static final int MAX_NUMBERS_ORDERED=20;

public ArrayList<Media> itemsOrdered = new ArrayList<Media>();

public void addMedia(Media media)
{	if(!itemsOrdered.contains(media)) itemsOrdered.add(media);
	else System.out.println("Exist before"); 
	}

public void removeMedia(Media media)
{	if (itemsOrdered.contains(media)) itemsOrdered.remove(media);
	else System.out.println("Not exist");
	}
// totalCost media
public double  totalCost1(){
	double sum = 0.00d;
	for (Media x : itemsOrdered)
	{
		sum +=x.getCost();
	}
	return sum;
}

public String toString(Media media) {
	return "ID: "+media.getId()+ "\tTitle: "+media.getTitle()+"\tCategory: "+media.getCategory()+"\tCost: "+media.getCost();
}
// In media
public void sortByTitleCost() {
	System.out.println("******** Sort by title then cost ********\n");
	Collections.sort(itemsOrdered, new MediaComparatorByTitleCost());
	for(Media media: itemsOrdered)
		System.out.println(toString(media));
}

public void sortByCostTitle() {
	System.out.println("**********Sort by cost then title*********\n");
	Collections.sort(itemsOrdered, new MediaComparatorByCostTitle());
	for(Media media: itemsOrdered)
		System.out.println(toString(media));	
}

public void addDigitalVideoDisc(DigitalVideoDisc dvd1) {
	// TODO Auto-generated method stub
	
}

public void displayList() {
	// TODO Auto-generated method stub
	
}
}








// public ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();

// create ins qtyOrder to count discs from cart list

//public int qtyOrdered;

// set value for qtyOrdered
//	public void setQtyOrdered(int qtyOrdered) {
//	this.qtyOrdered = qtyOrdered;
//}

// get value of qtyOrdered
//public int getQtyOrdered() {
//	return qtyOrdered;
//}

//amount < 20 then add disc into list

//public void addDigitalVideoDisc(DigitalVideoDisc disc)
//{
//	if (qtyOrdered <= MAX_NUMBERS_ORDERED)
//	{
//		itemsOrdered.add(disc);
//		
//		qtyOrdered++;
//		System.out.println("Add "+ disc.getTitle() +" successfully");
//	}
//	else 
//		System.out.println("Cart is full. Can't add "+ disc.getTitle() + " into");
//	}
// 

// addDigitalVideoDisc(DigitalVideoDisc [] dvdList)

//public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList)
//{
//		for(DigitalVideoDisc x : dvdList)
//		{
//			if (qtyOrdered <= MAX_NUMBERS_ORDERED)
//			{
//			
//		{itemsOrdered.add(x);
//		
//		qtyOrdered++;
//		System.out.println("Add "+ x.getTitle() +" successfully");
//	
//	}
//	}
//	else 
//		System.out.println("Cart is full. Can't add more");
//	}
//}
// addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)

//public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
//{
//	if (qtyOrdered <= MAX_NUMBERS_ORDERED)
//	{
//		itemsOrdered.add(dvd1);
//		
//		qtyOrdered++;
//		System.out.println("Add "+ dvd1.getTitle() +" successfully");
//	}
//	else 
//		System.out.println("Cart is full. Can't add "+ dvd1.getTitle() + " into");
//	
//	if (qtyOrdered <= MAX_NUMBERS_ORDERED)
//	{
//		itemsOrdered.add(dvd2);
//		
//		qtyOrdered++;
//		System.out.println("Add "+ dvd2.getTitle() +" successfully");
//	}
//	else 
//		System.out.println("Cart is full. Can't add "+ dvd2.getTitle() + " into");}


// remove disc from cart 
//public void removeDigitalVideoDisc(DigitalVideoDisc disc)
//{
//	if(!(itemsOrdered.contains(disc))) 
//		System.out.println(disc.getTitle()+" doesn't exit");
//	else {
//		itemsOrdered.remove(disc);
//		qtyOrdered--;
//		System.out.println("Remove "+ disc.getTitle() + "successfully");
//	}
//	}

//get info type String 
//public String toString(DigitalVideoDisc disc)
//{
//	return disc.title +"\t"+disc.category+"\t"+disc.director+"\t"+disc.length+"\t"+disc.cost;
//	}
//
//// sort by title
//public void sortByTitle() {
//	System.out.println("***********sort by title ***********");
//	Collections.sort(itemsOrdered,new TitleComparator());
//	for (DigitalVideoDisc disc: itemsOrdered)
//	{System.out.println(toString(disc));}
//}
//
//// sort by category
//public void sortByCategory() {
//	System.out.println("***********sort by category ***********");
//	Collections.sort(itemsOrdered,new CategoryComparator());
//	for (DigitalVideoDisc disc: itemsOrdered)
//	{System.out.println(toString(disc));}
//}
//
//// sort by cost
//public void sortByCost()
//{
//	System.out.println("***********sort by cost ***********");
//	Collections.sort(itemsOrdered,new CostComparator());
//	for (DigitalVideoDisc disc: itemsOrdered)
//	{System.out.println(toString(disc));}
//	}
//// total cost of Cart
//public double totalCost()
//{
//	double sum=0;
//	for(DigitalVideoDisc i:itemsOrdered)
//		sum += i.getCost();
//	return sum;
//	}

//public void displayCart() {
//	System.out.println("********** Cart ***********");
//	for(DigitalVideoDisc i : itemsOrdered )
//		System.out.println("Title: "+i.getTitle() +"\tCategory: "+i.getCategory()+ "\tDirector: "+ i.getDirector()+ "\tLength: "+i.getLength()+"\tCost: "+ i.getCost() );
//	
//}
//public void displayList()
//{	
//	int y=1;
//	for( DigitalVideoDisc x: itemsOrdered)
//		{		
//		System.out.println(y+".DVD - ["+x.title+"] + ["+ x.category+ "] + ["+ x.director+"] + ["+x.length+"]: ["+x.cost+"]$");
//		y++;
//		}
//	System.out.println("Total cost: ["+totalCost()+"]");
//}
//
//}

//class TitleComparator implements Comparator<DigitalVideoDisc> {
//	public int compare(DigitalVideoDisc s1, DigitalVideoDisc s2) {
//		int x = s1.getTitle().compareTo(s2.getTitle());
//		return x;	
//	}
//}
//
//
//class CategoryComparator implements Comparator<DigitalVideoDisc> {
//	public int compare(DigitalVideoDisc s1, DigitalVideoDisc s2) {
//		return s1.category.compareTo(s2.category);
//	}
//}
//
//class CostComparator implements Comparator<DigitalVideoDisc> {
//	public int compare(DigitalVideoDisc s1, DigitalVideoDisc s2) {
//		if (s1.cost == s2.cost)
//			return 0;
//		else if (s1.cost > s2.cost)
//			return 1;
//		else
//			return -1;
//	}

