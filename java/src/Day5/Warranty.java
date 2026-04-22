package Day5;


	import java.time.LocalDate;
	import java.util.Scanner;

	public class Warranty {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter purchase date (YYYY-MM-DD): ");
	        LocalDate purchaseDate = LocalDate.parse(sc.nextLine());

	        
	        System.out.print("Enter warranty years: ");
	        int years = sc.nextInt();

	        System.out.print("Enter warranty months: ");
	        int months = sc.nextInt();

	       
	        LocalDate expiryDate = purchaseDate
	                                .plusYears(years)
	                                .plusMonths(months);

	        
	        System.out.println("Warranty Expiry Date: " + expiryDate);

	        sc.close();
	    }
	}

