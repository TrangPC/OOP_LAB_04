package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Comparator;

import hust.soict.dsai.aims.cart.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.cart.MediaComparatorByTitleCost;
public class Media  {

	private int id; 
	private String title;
	private String category;
	private float cost;
	
	
	public Media(int id2, String title2, String category2, float cost2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public float getCost() {
		return cost;
	}


public boolean equalsMedia(Media media1, Media media2)
{	if(media1.getTitle().equals(media2.getTitle())) return true;
	return false;
	}

public static final Comparator<Media> COMPARATOR_BY_TITLE_COST = new MediaComparatorByTitleCost();
public static final Comparator<Media> COMPARATOR_BY_COST_TITLE = new MediaComparatorByCostTitle();


}
