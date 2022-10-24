package cart.items;
import java.util.LinkedList;

public class Cart {

	private LinkedList<Item> cart = new LinkedList<>();
	private LinkedList<Integer> numOfItems = new LinkedList<>();

	public Cart(LinkedList<Item> cart, LinkedList<Integer> numOfItems) {
		this.cart = cart;
		this.numOfItems = numOfItems;
	}
	
	
	
	public LinkedList<Item> getCart() {
		return cart;
	}

	public LinkedList<Integer> getNumOfItems() {
		return numOfItems;
	}


	public void add(Item item) {
		if(cart.contains(item)) {
			for(int i = 0; i < cart.size(); i++) {
				if(cart.get(i).equals(item)) {
					numOfItems.set(i, numOfItems.get(i)+1);
				}
			}
		} else {
		cart.add(item);
		numOfItems.addLast(1);
	}
	}
	
	public void remove(Item item) {
		if(cart.contains(item)) {
			for(int i = 0; i < cart.size(); i++) {
				if(cart.get(i).equals(item)) {
					numOfItems.set(i, numOfItems.get(i)-1);
				}
			}
		} else {
			System.out.println("Item not found!");
		}
	}
	
	public void clear() {
		cart.clear();
		numOfItems.clear();
	}
	
}
