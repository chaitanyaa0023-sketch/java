package src;
import java.util.*;

public class StringOperationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        
        System.out.println(StringOperations.performOperations(st, 1));
        System.out.println(StringOperations.performOperations(st, 2));
        System.out.println(StringOperations.performOperations(st, 3));
        System.out.println(StringOperations.performOperations(st, 4));
    }
}
