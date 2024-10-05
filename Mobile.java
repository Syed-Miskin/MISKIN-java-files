public class Mobile{
	
	
//instance variables
public String mobileName;
public String brand;
public String colour;

	public static void main(String[] args){
	Mobile mobile=new Mobile();
	System.out.println("Mobile="+ mobile);
	//access the instances variables
	mobile.mobileName="MI";
	System.out.println("Mobile Name = "+mobile.mobileName);
	
		Mobile lenovo=new Mobile();
	System.out.println("Mobile="+ lenovo);
	lenovo.mobileName="lenevo92k";
	System.out.println("Mobile Name = "+lenovo.mobileName);
	
    Mobile vivo=new Mobile();
	System.out.println("Mobile="+ vivo);
	vivo.mobileName="vivot2pro";
	System.out.println("Mobile Name = "+vivo.mobileName);
	}
}