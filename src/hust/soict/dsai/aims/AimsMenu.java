package hust.soict.dsai.aims;

import java.util.Scanner;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class AimsMenu {
	public Store medias = new Store();
	public Scanner input = new Scanner(System.in);
	public static void showMenu()
	{
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0 - 1 - 2 - 3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
}
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
}

	public void main(String args[])
	{
		showMenu();
		int number, number1, number2, number3,number4,number5, ID;
		String name1,name2,name3,name4,name5, TITLE;
		Media media2 = new Media();
		Media media3 = new Media();
		boolean check1 = false,check2 = false;
		do {
			System.out.println("Lua chon: ");
			number = input.nextInt();
			switch(number)
			{
			// chon view store
			case 1: medias.printlist();
			// hien thi store menu
			storeMenu();
			// chon See details
			do {
				number1= input.nextInt();
				switch(number1)
				{
				case 1: name1 = input.nextLine();
				if (medias.findByTitle(name1) != null) System.out.println(medias.findByTitle(name1).toString());
				else System.out.println("Don't exist");
				
				mediaDetailsMenu();
				// ket thuc switch store menu
				
				case 2: // add a media to cart
					name2= input.nextLine();
					if (medias.findByTitle(name2) == null) {
						Media media1 = new Media();
						media1.setTitle(name2);
						medias.addMedia(media1);
						System.out.println("Add successfully");
						System.out.println(medias.itemsInStore.size());
						}
					else System.out.println(name2 + "Existed");
					break;
					
				case 3: // Play a media
					name3= input.nextLine();
//					if (medias.findByTitle(name3) != null) medias.findByTitle(name3).play;
					
			}
			}while(number1 != 0);
			break;
			
			
			case 2: // Update store 
			System.out.println("Update store: \t 1. Add media \t 2. Remove media");
			number2=input.nextInt();
			while(true)
			{
				switch(number2)
				{
				
				case 1: name4=input.nextLine();
				if (medias.findByTitle(name4) == null)					
				{media2.setTitle(name4);
				medias.addMedia(media2);
				System.out.println("Add successfully");
				}
				else System.out.println(name4 + "Existed");
				break;
				
				case 2: name5=input.nextLine();
				media3= medias.findByTitle(name5);
				if (media3 != null)					
				{medias.removeMedia(media3);
				System.out.println("Remove successfully");}
				else System.out.println(name5+ "Don't exist");
				break;
				}
			}
				case 3: // See current cart
				
				// display infor medias
				cartMenu();
				do {
					number3= input.nextInt();
					switch(number3) {
					case 1: // Filter medias in cart
						System.out.println("Filter medias in cart");
						System.out.println("1. By ID \t 2. By Title \t 0. Exit");
						do{
							number4= input.nextInt();
							switch(number4)
							{
							case 1: // By ID
								ID= input.nextInt();
								for(Media media4: medias.itemsInStore)
								{
									if(media4.getId()==ID) media4.toString();
									check1 = true;
								}		
								if(!check1) System.out.println("Don't exist");
								break;
							case 2: // By Title
								TITLE = input.nextLine();
								for(Media media5 : medias.itemsInStore)
									{if(media5.getTitle().equals(TITLE)) media5.toString();
								check2 = true;}
								if(!check2) System.out.println("Don't exist");
								break;
							}													
						}while(number4!=0);
					break;
					case 2: // Sort medias in cart
						System.out.println("Sort medias in cart");
						System.out.println("1. By Title \t 2. By Cost");
						do {
							number5 = input.nextInt();
						switch (number5)
						{
						case 1: // By Title
							Collections.sort(medias.itemsInStore, new Comparator <Media>() {

								@Override
								public int compare(Media o1, Media o2) {
									return o1.getTitle().compareTo(o2.getTitle());						
								}
							});
							break;
						case 2: // By Cost 
							Collections.sort(medias.itemsInStore, new Comparator<Media>() {

								@Override
								public int compare(Media o1, Media o2) {
									if (o1.getCost()>o2.getCost()) return 1;
									else if (o1.getCost()<o2.getCost()) return -1;
									return 0;
								}
								
							});
							
							break;
						}
							
						}
						while(number5 !=0 );
						
						break;
					case 3: break;
					case 4: break;
					case 5: // Place Order 
						// example place order media3 
						medias.itemsInStore.remove(media3);
						System.out.println("Place order successfully");
						break;
					}
				}while(number3!=0);
				// end vong lap case 3
				
				break;
// ket thuc switch menu			
			}
		}		while(number!=0);
		
	
}
}