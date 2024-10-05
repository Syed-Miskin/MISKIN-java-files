public class Stringmethods{
	
	public static void main(String[] args){
	
	//Strings using literals
	String name = "Miskin";
	String subject = "java";
	String usn = "3NA21EC036";
	String college = "Navodaya";
    String city = "Raichur";
	
	//using new keyword
	String person = new String("name");
	String sub = new String(subject);
	String rollnum = new String(usn);
	String institute = new String(college);
	String place = new String(city);
	
	System.out.println(usn.toLowerCase());
	System.out.println(college.toUpperCase());
	System.out.println(name.equals(person));
	System.out.println(city.equals(place));
	System.out.println("");
	
		
	}
}