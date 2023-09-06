package com.programming.class2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//POJO plain old Java Object

class Product2 {
	int product_id;
	String prod_name;
	String prod_desc;
	int prod_quantity;
	double prod_price;
	LocalDate prodValidity;
	
	Product2(){}
	
	Product2(int product_id, String prod_name, String prod_desc, int prod_quantity, double prod_price, LocalDate prodValidity) {
	
		// using this keyword, we can replace non static instance variable with method parameter
		
		this.product_id = product_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_quantity = prod_quantity;
		this.prod_price = prod_price;
		this.prodValidity = prodValidity;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public int getProd_quantity() {
		return prod_quantity;
	}

	public void setProd_quantity(int prod_quantity) {
		this.prod_quantity = prod_quantity;
	}

	public double getProd_price() {
		return prod_price;
	}

	public void setProd_price(double prod_price) {
		this.prod_price = prod_price;
	}
	
	public LocalDate getProdValidity() {
		return prodValidity;
	}

	public void setProdValidity(LocalDate prodValidity) {
		this.prodValidity = prodValidity;
	}


}

interface ProductDAO2{
	String nameOfProduct(Product2 p);
	int priceOfProduct(Product2 p);
	int quantityOfProduct(Product2 p);
	String descriptionOfProduct(Product2 p);
	LocalDate prodValidityDate(Product2 p);
	List<Product2> getAllProducts();
	void deleteProduct(Product2 p);
	
}

class ProductDAOImpl implements ProductDAO2{
	
	List<Product2> listOfProducts = new ArrayList<>();
	
	public ProductDAOImpl () {
		
		//Product(int product_id,String prod_name, String prod_desc, int prod_quantity, double prod_price, LocalDate prodValidity) 
		
		Product2 p1 = new Product2(123,"A","B",10,10.29,LocalDate.now());
		Product2 p2 = new Product2(124,"C","D", 20,20.89,LocalDate.of(2019,Month.FEBRUARY, 20));
		Product2 p3 = new Product2(125,"E","F", 20,20.89,LocalDate.of(2019,Month.FEBRUARY, 20));
		
		
		listOfProducts.add(p1);
		listOfProducts.add(p2);listOfProducts.add(p3);
	}
	

	@Override
	public String nameOfProduct(Product2 p) {
		
		Iterator<Product2> itr = listOfProducts.iterator();
		while(itr.hasNext()) {
			
			Product2 p2 = itr.next();
			//if(p2.get.Prod_name().equalsIgnoreCase(p.getProd_name())){
			
			return p2.getProd_name();
			//}
		}
		return null;
	}

	@Override
	public int priceOfProduct(Product2 p) {
			return 0;
	}

	@Override
	public int quantityOfProduct(Product2 p) {
		return 0;
	}

	@Override
	public String descriptionOfProduct(Product2 p) {
		return null;
	}
	

	@Override
	public LocalDate prodValidityDate(Product2 p) {
		return null;
	}

	@Override
	public List<Product2> getAllProducts() {
		return listOfProducts;
	}
	
	
	

	@Override
	public void deleteProduct(Product2 p) {
		listOfProducts.remove(p);
		
	}
	
}

public class ProductDAOClass {
	
	public static void main(String[] args) {
		ProductDAOImpl obj = new ProductDAOImpl();
		for(Product2 p : obj.getAllProducts()) {
			System.out.println("Product Id" + p.product_id + "product name is" + p.prod_name);
			System.out.println("Name of the Product is" + p.getProd_name());
			
			obj.deleteProduct(p);
			
			
		}
		
		afterDeleteProducts();
	}
	
	static void afterDeleteProducts() {
		ProductDAOImpl obj = new ProductDAOImpl();
		if (null != obj.getAllProducts()) {
			for(Product2 p : obj.getAllProducts()) {
				System.out.println("Product Id" + p.product_id + "product name is" + p.prod_name);
				System.out.println("Name of the Product is" + p.getProd_name());
			}
		}else {
			System.out.println("List is empty ");
		}

	}

}





//public void 
//Iterator<Product2> itr = getAllproducts().iterator();
//while(itr.hasNext()) {
	//Product2 p2 = itr.next();
	//p2.setProd_name(p.getProd_name());
//}
//}