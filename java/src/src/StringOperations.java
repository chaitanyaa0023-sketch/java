
	package src;

	public class StringOperations {

	    public static String performOperations(String input, int choice) {
	        switch (choice) {
	            case 1:
	                return input + input;

	            case 2:
	                StringBuilder sb2 = new StringBuilder();
	                for (int i = 0; i < input.length(); i++) {
	                    sb2.append(i % 2 == 0 ? input.charAt(i) : '#');
	                }
	                return sb2.toString();

	            case 3:
	                StringBuilder sb3 = new StringBuilder();
	                for (int j = 0; j < input.length(); j++) {
	                    char ch = input.charAt(j);
	                    if (sb3.indexOf(String.valueOf(ch)) == -1) {
	                        sb3.append(ch);
	                    }
	                }
	                return sb3.toString();

	            case 4:
	                StringBuilder sb4 = new StringBuilder();
	                for (int j = 0; j < input.length(); j++) {
	                    char ch = input.charAt(j);
	                    sb4.append(j % 2 != 0 ? Character.toUpperCase(ch) : ch);
	                }
	                return sb4.toString();

	            default:
	                return "Invalid choice";
	        }
	    }
	}
