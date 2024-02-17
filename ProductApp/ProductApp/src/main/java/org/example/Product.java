package org.example;

public class Product {
	
	private String name;
	private String description;
	private int price;
	
	public Product(String name,String description, int price)
	{
		this.name=name;
		this.price=price;
		this.description=description;
	}
	
	public String toString()
	{
		return "name: "+name+"price: "+price+"description: "+description;
	}

}
