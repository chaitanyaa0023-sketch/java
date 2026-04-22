package Day5;




import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter date (YYYY-MM-DD): ");
        String input = sc.nextLine();

        
        LocalDate inputDate = LocalDate.parse(input);

        
        LocalDate currentDate = LocalDate.now();

        
        Period diff = Period.between(inputDate, currentDate);

       
        System.out.println("Duration:");
        System.out.println(diff.getYears() + " years, " +
                           diff.getMonths() + " months, " +
                           diff.getDays() + " days");

        sc.close();
    }
}