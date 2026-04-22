package Day5;


	import java.time.ZonedDateTime;
	import java.time.ZoneId;
	import java.util.Scanner;

	public class TimeZone {

	    
	    public static void showDateTime(String zone) {
	        ZoneId zoneId = ZoneId.of(zone);
	        ZonedDateTime dateTime = ZonedDateTime.now(zoneId);

	        System.out.println("Current date and time in " + zone + ":");
	        System.out.println(dateTime);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter Zone ID (e.g., Asia/Tokyo): ");
	        String zone = sc.nextLine();

	       
	        showDateTime(zone);

	        sc.close();
	    }
	}

