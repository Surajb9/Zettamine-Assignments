package CollectionFramework.product;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
       private String prodCode;
       private String prodName;
       private int availability;
       private double price;
	public Product(String prodCode, String prodName, int availability, double price) {
		super();
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.availability = availability;
		this.price = price;
	}
	static Scanner scan;
	static List<Product> products;
	public static void addProduct() {
		scan = new Scanner(System.in);
		products = new ArrayList<>();
		System.out.println("How many records you want to store?");
		int records = scan.nextInt();
		for(int i=0;i < records;i++) {
			System.out.println("Enter Laptop Details");
			System.out.println("Product Code");
			String proCode = scan.next();
			System.out.println("Product name");
			scan.nextLine();
			String prodName = scan.nextLine();
			//scan.nextLine();
			System.out.println("Pieces available");
			int piecesNo = scan.nextInt();
			System.out.println("Product Price");
			double price = scan.nextDouble();
			products.add(new Product(proCode,prodName,piecesNo,price));
		}
		System.out.println("All product details accpeted");

		
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Suraj Kumar\\Desktop\\ZettaMine\\produtDetails.txt"))) {
			for(Product p : products) {
				writer.write("Product Code :"+p.getProdCode()+"\n");
				writer.write("Product Name :"+p.getProdName()+"\n");
				writer.write("Product Availability :"+p.getAvailability()+"\n");
				writer.write("Price :"+p.getPrice()+"\n");
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("products are added into the file for future retrival");
		
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static void searchproduct() {
		if(products.size() == 0){
			System.out.println("No Records Found");
		}
		for(Product p : products) {
			System.out.println("Product code: "+p.getProdCode());
			System.out.println("Product Name: "+p.getProdName());
			System.out.println("Available pieces:"+p.getAvailability());
			System.out.println("Product Cost: "+p.getPrice());
		}
		System.out.println("Enter Upper price value");
		double upperPrice = scan.nextDouble();
		System.out.println("Enter Lower price value");
		double lowerPrice = scan.nextDouble();
		for(Product p : products) {
			
			if(p.getPrice()>lowerPrice || p.getPrice()<upperPrice) {
		       System.out.println("Product based on search");
		       System.out.println(p.getProdCode()+" "+p.getProdName()+" "+p.getAvailability()+" "+p.getPrice());
			}
			else {
		
				System.out.println("No Product Found");
			}
		}
	}
	
}
