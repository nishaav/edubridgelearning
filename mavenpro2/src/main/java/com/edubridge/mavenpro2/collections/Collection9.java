package com.edubridge.mavenpro2.collections;


import java.util.*;

public class Collection9 {
/*
 * 
 * Comparator
 * ->sort the collection on the basis of multiple attributes
 * ->original user-defined class will not be modified
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> al=new ArrayList<>();
		al.add(new Product(32,"Laptop",78000));
		al.add(new Product(23,"Laptop Bag",6000));
		al.add(new Product(12,"One Plus 8T Pro",68000));
		al.add(new Product(90,"Oppo A7",14000));
		al.add(new Product(34,"MacBook Air",100000));
		
		
		System.out.println(al);
		
		Collections.sort(al, new ProName());
		
		System.out.println(al);
		
		Collections.sort(al, new ProId());
		
		System.out.println(al);
		Collections.sort(al, new ProPrice());
		
		System.out.println(al);
		
		
	}

}
class Product
{
	int productId;
	String productName;
	int productPrice;
	public Product(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public String toString()
	{
		return productId+" "+productName+" "+productPrice;
	}
	
	
}

class ProName implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		
		return o1.productName.compareTo(o2.productName);
	}
	
}
class ProPrice implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		//sort on descending order
		if(o1.productPrice<o2.productPrice)
			{
				return 1;//positive integer means swapping
			}
			else if(o1.productPrice==o2.productPrice)
			{
				return 0;
			}
			else
			{
				return -1;
			}
	}
	
}

class ProId implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		
		if(o1.productId>o2.productId)
			{
				return 1;//positive integer means swapping
			}
			else if(o1.productId==o2.productId)
			{
				return 0;
			}
			else
			{
				return -1;
			}
	}
	
}


