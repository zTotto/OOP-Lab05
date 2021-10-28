package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {
	
	private Set<Product> products = new LinkedHashSet<>();

	public void addProduct(Product p) {
		if (p != null) {
			products.add(p);			
		}
	}

	public Set<String> allNames() {
		Set<String> names = new LinkedHashSet<>();
		for (Product p : products) {
			names.add(p.getName());
		}
		//names.addAll(Set.of(products.toString()));
		return names;
	}

	public Set<Product> allProducts() {
		Set<Product> ProductCopy = new LinkedHashSet<>();
		ProductCopy.addAll(this.products);
		return ProductCopy;
	}

	public boolean containsProduct(Product p) {
		return products.contains(p);
	}

	public double getQuantity(String name) {
		for (Product p : products) {
			if (products.equals(p)) {
				return p.getQuantity();
			}
		}
		System.out.println("This product is not available");
		return -1;
	}

}
