package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Display cart :");
		anOrder.displayCart();
		
		System.out.println("Sort by title: ");
		anOrder.sortByTitle();
		
		System.out.println("Sort by category: ");
		anOrder.sortByCategory();
		
		System.out.println("Sort by price: ");
		anOrder.sortByCost();
		
		System.out.print("Total cost is ");
		System.out.print(anOrder.totalCost());
		
		System.out.println("Remove disc from cart, example dvd1 ");
		anOrder.removeDigitalVideoDisc(dvd1);
		
	}
	
}
