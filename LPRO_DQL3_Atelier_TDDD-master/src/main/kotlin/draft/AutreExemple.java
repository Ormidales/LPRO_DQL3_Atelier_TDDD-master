package main.kotlin.draft;

public class AutreExemple implements IExemple {
	private int Price = 0;

    public void setPrice(int price) {
    	this.Price = price;
    }

    public void augmenter(int i) {
    	Price += i;
    }

    public int getPrice() {
        return 0;
    }
}
