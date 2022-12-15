package hust.soict.dsai.aims.cart;

import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;

public	class MediaComparatorByTitleCost implements Comparator<Media>{
		public int compare(Media m1, Media m2) {
			
			if (m1.getTitle().compareTo(m2.getTitle())==0) 
			{
				int x = (m1.getCost()>m2.getCost())? 1:-1;
				return x;
			}		
			return (m1.getTitle().compareTo(m2.getTitle()));
		}
}
