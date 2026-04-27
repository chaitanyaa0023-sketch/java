package packagecom.cg.eis.pl;


	import java.util.Scanner;
	import packagecom.cg.eis.bean.Employee;
	import packagecom.cg.eis.service.EmployeeService;
	import com.cg.eis.service.EmployeeServiceImplementation;
	public class EmployeeMain {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Employee Salary: ");
	        double salary = sc.nextDouble();
	        sc.nextLine();

	        System.out.print("Enter Employee Designation: ");
	        String designation = sc.nextLine();

	        Employee emp = new Employee(id, name, salary, designation);

	        EmployeeServiceImplementation service = new EmployeeServiceImplementation();
	        service.findInsuranceScheme(emp);
	        service.displayEmployee(emp);

	        sc.close();
	    }
	}



