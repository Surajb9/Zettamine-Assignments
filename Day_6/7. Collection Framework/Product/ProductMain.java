package CollectionFramework.product;

import java.util.Scanner;

public class ProductMain {
    static Scanner scan;
	public static void main(String[] args) {
		while(true) {
	    scan = new Scanner(System.in);
		System.out.println("1.Add Product Details ");
		System.out.println("2.Search Product based on price range");
		System.out.println("3.Close");
		System.out.println("Enter Choice");
		int choice = scan.nextInt();
		
		switch(choice) {
		    case 1:Product.addProduct();
		    	   break;
		    case 2:Product.searchproduct();
		    	   break;
		    case 3: System.exit(0);
		    	   break;
		    default:System.out.println("Please choose a valid option");
		    	   
		
		}
		
		}
		

	}
   
}
