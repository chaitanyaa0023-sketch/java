package src;

public class Person {
	private String firstname;
	private String lastname;
	private char gender;
	
	public Person() {
		
		
	}
public Person(String firstname,String lastname,char gender ) {
	this.setFirstname(firstname);
	this.setLastname(lastname);
	this.setGender(gender);
	
}
	
		// TODO Auto-generated method stub

	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public static void main(String[] args) {
		Person p1=new Person("chaitanya ","Manchala",'M');
		System.out.println("Person Details");
		System.out.println("--------------");
		System.out.println("First Name:"+ p1.getFirstname());
		System.out.println("Last Name:"+ p1.getLastname());
		System.out.println("Gender:"+ p1.getGender());
		
	}
	}


