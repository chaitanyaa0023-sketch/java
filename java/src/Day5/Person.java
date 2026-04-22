package Day5;


	import java.time.LocalDate;
	import java.time.Period;
	import java.util.Scanner;

	public class Person {

	    // Method to calculate age
	    public static int calculateAge(LocalDate dob) {
	        LocalDate currentDate = LocalDate.now();
	        return Period.between(dob, currentDate).getYears();
	    }

	    // Method to get full name
	    public static String getFullName(String firstName, String lastName) {
	        return firstName + " " + lastName;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input details
	        System.out.print("Enter First Name: ");
	        String firstName = sc.nextLine();

	        System.out.print("Enter Last Name: ");
	        String lastName = sc.nextLine();

	        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
	        LocalDate dob = LocalDate.parse(sc.nextLine());

	        // Method calls
	        String fullName = getFullName(firstName, lastName);
	        int age = calculateAge(dob);

	        // Display details
	        System.out.println("\n--- Person Details ---");
	        System.out.println("Full Name: " + fullName);
	        System.out.println("Date of Birth: " + dob);
	        System.out.println("Age: " + age + " years");

	        sc.close();
	    }
	}

