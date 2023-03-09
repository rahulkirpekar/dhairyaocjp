package ooops.abstopic;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter belowc choice : ");
		System.out.println("1) For TwVehicle User");
		System.out.println("2) For LmvVehicle User");
		System.out.println("3) For HmvVehicle User");
		int choice = sc.nextInt();
		
		Vehicle vechile = null;
		switch(choice) 
		{
			case 1:  vechile = new TwUser();
					 vechile.getSpec(); 
					break;
			
			case 2:  vechile = new LmvUser();
					 vechile.getSpec();
					break;
					
			case 3:  vechile = new HmvUser();
					 vechile.getSpec();
					break;
		}
	}
}
