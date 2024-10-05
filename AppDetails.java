public class AppDetails{
	
	public static void main(String[] args){
		
		App app1 = new App();
		app1.appName = "Telegram";
		app1.ratingOutOf5 = 4.5f;
		app1.purpose = "Messaging & free access to movies";
		app1.numOfDownloads = 590;
		
		App app2 = new App();
		app2.appName = "Instagram";
		app2.ratingOutOf5 = 4.7f;
		app2.purpose = "Messaging & free access to movies";
		app2.numOfDownloads = 3900;
		
		App app3 = new App();
		app3.appName = "whatsapp";
		app3.ratingOutOf5 = 4.1f;
		app3.purpose = "Messaging & Communication";
		app3.numOfDownloads = 5000;
		
		App[] app = {app1,app2,app3};
		
		for(int j=0; j<app.length; j++){
			System.out.println("Name of application             : "+app[j].appName+".");
			System.out.println("Rating of the application[/5]   : "+app[j].ratingOutOf5+".");
			System.out.println("Purpose of application          : "+app[j].purpose+".");
			System.out.println("Number of Users for application : "+app[j].numOfDownloads+" million.");
			System.out.println("-----------------------**********------------------------");
			System.out.println("");
		}
	}
}
			

		