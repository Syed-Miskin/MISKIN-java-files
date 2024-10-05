public class Carscreator{
	
public static void main(String[] args){	

Cars car1 = new Cars();
car1.Brand = "Mahindra";
car1.colour = "black";
car1.price = 3500000;
car1.milageInKMpHr = 18;

Cars car2 = new Cars();	
car2.Brand = "Ferrari";
car2.colour = "White";
car2.price = 50000000;
car2.milageInKMpHr = 7;	
	
	System.out.println(car1);
	System.out.println(car2);
}
}