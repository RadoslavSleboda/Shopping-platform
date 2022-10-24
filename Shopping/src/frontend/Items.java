package frontend;

import java.util.LinkedList;
import java.util.ArrayList;

import cart.items.Cart;
import cart.items.Item;

public interface Items {
	
	public static ArrayList<Item> itemsInOffer = new ArrayList<>();
	Cart cart = new Cart(new LinkedList<Item>(), new LinkedList<Integer>());
	
}
