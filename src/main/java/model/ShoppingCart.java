package model;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera
 * CIS175 Fall 2023
 * Sep, 20
 */
public class ShoppingCart {
	private double price;
	private double total;
	private double discount;
	
	public ShoppingCart() {
		super();
	}

	public ShoppingCart(double price) {
		super();
		this.price = price;
		setTax(price);
		discountCalc(price);
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setTax(double price) {
		final double taxRate = .07;
		
		double tax = (price * taxRate);
		setTotal(tax + price);
	}

	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public void discountCalc(double price) {
		final double tenPercent = .10;

		double discount = (price * tenPercent);
		
		setDiscount(price - discount);
	}

	@Override
	public String toString() {
		return "ShoppingCart [price=" + price + ", total=" + total + ", discount=" + discount + "]";
	}
	

}
