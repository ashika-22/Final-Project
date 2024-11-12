import java.io.*;
import java.util.Scanner;
class new1
{
	public static void main(String args[])
	{
		Travel [] t=new Travel[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<t.length;i++)
		{
			int regNo=sc.nextInt();sc.nextLine();
			String agencyName=sc.nextLine();
			String packageType=sc.nextLine();
			int price=sc.nextInt();sc.nextLine();
			int rating=sc.nextInt();sc.nextLine();
			String location=sc.nextLine();
			t[i]=new Travel(regNo,agencyName,packageType,price,rating,location);
		}
		String reqLoc=sc.nextLine();
		int b=findagencywithHighestPackagePrice(t,reqLoc);
		if(b!=0)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(b);
		}
		
	}
	public static int findagencywithHighestPackagePrice(Travel[] t,String reqLoc)
	{
		int a=0;
		for(int i=0;i<t.length;i++)
		{
			if(t[i].getLoc().equalsIgnoreCase(reqLoc))
			{
				if(t[i].getPrice()>a)
				{
					a=t[i].getPrice();
				}
			}
		}
		return a;
	}
}
					
				
}
	class Travel
	{
		private int regNo;
		private String agencyName;
		private String packageType;
		private int price;
		private int rating;
		private String location;
		public int getReg()
		{
			return regNo;
		}
		public void setReg(int regNo)
		{
			this.regNo=regNo;
		}
		public int getPrice()
		{
			return price;
		}
		public void setPrice(int price)
		{
			this.price=price;
		}
		public String getLoc()
		{
			return location;
		}
		public void setLoc(String location)
		{
			this.location=location;
		}
		public Travel(int regNo,String agencyName,String packageType,int price,int rating,String location)
		{
			this.regNo=regNo;
			this.agencyName=agencyName;
			this.packageType=packageType;
			this.price=price;
			this.rating=rating;
			this.location=location;
		}
	}
		
		
