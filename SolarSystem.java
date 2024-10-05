public class SolarSystem{

public String planetName;
public short numOfMoons;
public String planetColour;
public float surfaceTemperature;
public boolean presenceOfWater;

public static void main(String[] args){

SolarSystem planet1=new SolarSystem();
planet1.planetName="Mars";
planet1.numOfMoons=4;
planet1.planetColour="Red";
planet1.surfaceTemperature=22.3f;
planet1.presenceOfWater=false;

SolarSystem planet2=new SolarSystem();
planet2.planetName="Earth";
planet2.numOfMoons=1;
planet2.planetColour="Blue";
planet2.surfaceTemperature=27.2f;

SolarSystem planet3=new SolarSystem();
planet3.planetName="Jupiter";
planet3.numOfMoons=54;
planet3.planetColour="Pink";
planet3.surfaceTemperature=40.3f;
planet3.presenceOfWater=false;
  SolarSystem[] planets = {planet1, planet2, planet3};

        // Loop through the array to print planet information
        for (int i = 0; i < planets.length; i++) {
            System.out.println("Name of Planet " + (i + 1) + ": " + planets[i].planetName);
            System.out.println("Number of Moons: " + planets[i].numOfMoons);
            System.out.println("Planet Colour: " + planets[i].planetColour);
            System.out.println("Surface Temperature: " + planets[i].surfaceTemperature);
            System.out.println("Presence of Water: " + planets[i].presenceOfWater);
            System.out.println();
}
}
}