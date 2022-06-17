package zarAt;

import java.util.Random;
import java.util.Scanner;

public class main 
{
	
	
	static void zar() 
	{
	    Random r = new Random();
		int a = (int) (1 + Math.random() * 6);
		System.out.println(a);
		
		Random r2 = new Random();
		int a2 = (int) (1 + Math.random() * 6);
		System.out.println(a2);
		
		
		if(a == 1 && a2 == 1)
		{
			System.out.println("Hep Yek Dü Yek");
		}
		else if(a == 2 && a2 == 2)
		{
			System.out.println("Dü Bara");
		}
		else if(a == 2 && a2 == 1 || a == 1 && a2 == 2)
		{
			System.out.println("Dü Yek");
		}
		else if(a == 3 && a2 == 3)
		{
			System.out.println("Dü Se");
		}
		else if(a == 3 && a2 == 2 || a == 2 && a2 == 3)
		{
			System.out.println("Seba-i Dü");
		}
		else if(a == 3 && a2 == 1 || a == 1 && a2 == 3)
		{
			System.out.println("Se Yek");
		}
		else if(a == 4 && a2 == 4)
		{
			System.out.println("Dört Cihar");
		}
		else if(a == 4 && a2 == 3 || a == 3 && a2 == 4)
		{
			System.out.println("Cihar-ü Se");
		}
		else if(a == 4 && a2 == 2 || a == 2 && a2 == 4)
		{
			System.out.println("Cihar-i Dü");
		}
		else if(a == 4 && a2 == 1 || a == 1 && a2 == 4)
		{
			System.out.println("Cihar-ı Yek");
		}
		else if(a == 5 && a2 == 5)
		{
			System.out.println("Dü Beş");
		}
		else if(a == 5 && a2 == 4 || a == 4 && a2 == 5)
		{
			System.out.println("Beş Dört");
		}
		else if(a == 5 && a2 == 3 || a == 3 && a2 == 5)
		{
			System.out.println("Penc-ü Se");
		}
		else if(a == 5 && a2 == 2 || a == 2 && a2 == 5)
		{
			System.out.println("Penc i Dü");
		}
		else if(a == 5 && a2 == 1 || a == 1 && a2 == 5)
		{
			System.out.println("Penc-ü Yek");
		}
		else if(a == 6 && a2 == 6)
		{
			System.out.println("Dü Şeş");
		}
		else if(a == 6 && a2 == 5 || a == 5 && a2 == 6)
		{
			System.out.println("Şeş Beş");
		}
		else if(a == 6 && a2 == 4 || a == 4 && a2 == 6)
		{
			System.out.println("Şeş Cehar");
		}
		else if(a == 6 && a2 == 3 || a == 3 && a2 == 6)
		{
			System.out.println("Şeş-ü Se");
		}
		else if(a == 6 && a2 == 2 || a == 2 && a2 == 6)
		{
			System.out.println("Şeş-i Dü");
		}
		else if(a == 6 && a2 == 1 || a == 1 && a2 == 6)
		{
			System.out.println("Şeş-ü Yek");
		}
	 }
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		
		
	  System.out.println("Zar atmak için >>> 1 \nÇıkış yapmak için >>> 2 \n>>>");
	  int secim = input.nextInt();
	  
	  if(secim == 1)
	  {
		  zar();
	  }
	  else if(secim == 2)
	  {
		  System.exit(0);
	  }
	 

	  
	  System.out.println("Sayıların Farsçasını görmek ister misin?? e=Evet h=Hayır");
	  String sec = input.next();
	  if(sec == "E" || sec == "e")
	  {
		  System.out.println("yek      >>> 1\n"
		  		+ "dü     >>> 2\n"
		  		+ "se     >>> 3\n"
		  		+ "cihar  >>> 4\n"
		  		+ "penç   >>> 5\n"
		  		+ "şeş    >>> 6\n");
	  }
	  
	  
	}
}