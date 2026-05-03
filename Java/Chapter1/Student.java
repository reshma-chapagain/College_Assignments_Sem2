public class Student {
 String
  	String id;
  	String firstName;
  	String middleName;
  	String lastName;
  	String rollNumber;
  	String fatherName;
  	String motherName;
  	Date dateOfBirth;
  	
  	
  	public int calculateAge() {
  	return (int)new Date()-dateOfBirth;
  	
  	}
  	
  
  public static void main(String args []) {
  Student ram = new Student(); 
  ram.calculateAge ();
  }
  }
