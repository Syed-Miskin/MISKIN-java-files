public class Country{
//instance variable


public String Name;
public String capital;
public long population;

public static void main(String[] args){

Country country1 = new Country();
System.out.println("country address: "+country1);
country1.Name="India";
country1.capital="New Delhi";
country1.population=1210000000l;

System.out.println("country 1 Name:"+country1.Name);
System.out.println("country 1 capital:"+country1.capital);
System.out.println("country 1 popuation :"+country1.population);
System.out.println(" ");

Country country2 = new Country();
System.out.println("country address: "+country2);
country2.Name="Japan";
country2.capital="Tokyo";
country2.population=1310000l;

System.out.println("country 2 Name:"+country2.Name);
System.out.println("country 2 capital:"+country2.capital);
System.out.println("country 2 popuation :"+country2.population);
System.out.println(" ");

Country country3 = new Country();
System.out.println("country address: "+country3);
country3.Name="Pakistan";
country3.capital="Karachi";
country3.population=60000000;

System.out.println("country 3 Name:"+country3.Name);
System.out.println("country 3 capital:"+country3.capital);
System.out.println("country 3 popuation :"+country3.population);
System.out.println(" ");
}
}
System.out.println("Number of moons on the Planet1 :"+planeti.numOfMoons);
System.out.println("Colour of the Planet1 :"+planeti.planetColour);
System.out.println("Surface Temperature of the Planet1 :"+planeti.surfaceTemperature);
System.out.println("Presence of Water on the Planet1 :"+planeti.presenceOfWater);