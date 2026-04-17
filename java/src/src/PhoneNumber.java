package src;

public class PhoneNumber {

			private String fname;
			private String lname;
			private char gender;
			private int age;
			private double weight;
			private long phnno;
			
			
			
			public String getFname() {
				return fname;
			}
			public void setFname(String fname) {
				this.fname = fname;
			}
			public String getLname() {
				return lname;
			}
			public void setLname(String lname) {
				this.lname = lname;
			}
			public char getGender() {
				return gender;
			}
			public void setGender(char gender) {
				this.gender = gender;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public double getWeight() {
				return weight;
			}
			public void setWeight(double weight) {
				this.weight = weight;
			}
			
			public long getPhnno() {
				return phnno;
			}
			public void setPhnno(long phnno) {
				this.phnno = phnno;
			}
			
			public PhoneNumber() {}
			
			public PhoneNumber(String fname, String lname, char gender, int age, double weight,long phnno) 
			{
				this.fname = fname;
				this.lname = lname;
				this.gender = gender;
				this.age = age;
				this.weight = weight;
				this.phnno=phnno;
			}

			void display()
			{
				System.out.println("Person Details:");
				System.out.println("---------------");
				System.out.println("First Name:"+fname);
				System.out.println("Last Name:"+lname);
				System.out.println("Gender:"+gender);
				System.out.println("Age:"+age);
				System.out.println("Weight:"+weight);
				System.out.println("Phone Number:"+phnno);
			
		
}
}
