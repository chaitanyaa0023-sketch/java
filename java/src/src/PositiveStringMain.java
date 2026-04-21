package src;
import java.util.*;

public class PositiveStringMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Create object of PositiveString, not PositiveStringMain
        PositiveString ps = new PositiveString();

        if (ps.isPositive(str))
            System.out.println("True, It is a positive String");
        else
            System.out.println("False, It is not a positive String");
    }
}
