package Day6;


	import java.util.Arrays;
	import java.util.Scanner;

	public class ProductArray{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number of products
	        System.out.print("Enter number of products: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // consume newline

	        String[] products = new String[n];

	        // Input product names
	        System.out.println("Enter product names:");
	        for (int i = 0; i < n; i++) {
	            products[i] = sc.nextLine();
	        }

	        // Sort array
	        Arrays.sort(products);

	        // Display sorted products
	        System.out.println("\nSorted Product Names:");
	        for (String product : products) {
	            System.out.println(product);
	        }

	        sc.close();
	    }
	}

