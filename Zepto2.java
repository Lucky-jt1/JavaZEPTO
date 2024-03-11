import java.util.Scanner;
interface chocolatestore
{
	static Scanner sc = new Scanner(System.in);
	double dairyprice = 20;
	double fiveprice = 10;
	double dairymilk(int quantity);
	double fivestar(int quantity);
}
interface drinkstore
{
	double thumbprice = 50;
	double spriteprice = 40;
	double thumbsup(int quantity);
	double sprite(int quantity);
}
interface bakerystore
{
	double cakeprice = 200;
	double cake(int quantity);
}
class zepto implements chocolatestore,drinkstore,bakerystore
{
	public double dairymilk(int quantity)
	{
		return quantity*dairyprice;
	}
	public double fivestar(int quantity)
	{
		return quantity*fiveprice;
	}
	public double thumbsup(int quantity)
	{
		return quantity*thumbprice;
	}
	public double sprite(int quantity)
	{
		return quantity*spriteprice;
	}
	public double cake(int quantity)
	{
		return quantity*cakeprice;
	}
	static double bill = 0;
	void selection()
	{
		System.out.println("\n 1-chocolatestore \n 2-drinkstore \n 3-cakestore");
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println("1.dairymilk \n 2.fivestar");
			int n1 = sc.nextInt();
			if(n1==1)
			{
				System.out.println("Select quantity");
				bill = bill+dairymilk(sc.nextInt());
			}
			else if(n1==2)
			{
				System.out.println("Select quantity");
				bill = bill+fivestar(sc.nextInt());
			}
			else
			{
				System.out.println("Invalid Selection");
			}
		}
		else if(n==2)
		{
			System.out.println("1.thumbsup \n 2.sprite");
			int n1 = sc.nextInt();
			if(n1==1)
			{
				System.out.println("Select quantity");
				bill = bill+thumbsup(sc.nextInt());
			}
			else if(n1==2)
			{
				System.out.println("Select quantity");
				bill = bill+sprite(sc.nextInt());
			}
			else
			{
				System.out.println("Invalid Selection");
			}
		}
		else if(n==3)
		{
			System.out.println("cake");
			int n1 = sc.nextInt();
			if(n1==1)
			{
				System.out.println("Select quantity");
				bill = bill+cake(sc.nextInt());
			}
			else
			{
				System.out.println("Invalid Selection");
			}
		}
		else
		{
			System.out.println("No Suitable category found \n please select valid one");
			selection();
		}
		System.out.println("1-order more \n 2-for billing \n any key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1')
		{
			selection();
		}
		else if(ch=='2')
		{
			billing(bill);
		}
	}
	void billing(double bill)
	{
		System.out.println("your bill "+bill);
		double gst = bill*0.18;
		System.out.println("gst on bill "+gst);
		System.out.println("your bill "+bill);
		System.out.println("total amount"+(bill+30+gst));
	}
}
class amazon implements chocolatestore,drinkstore,bakerystore
{
	public double dairymilk(int quantity)
	{
		return quantity*dairyprice;
	}
	public double fivestar(int quantity)
	{
		return quantity*fiveprice;
	}
	public double thumbsup(int quantity)
	{
		return quantity*thumbprice;
	}
	public double sprite(int quantity)
	{
		return quantity*spriteprice;
	}
	public double cake(int quantity)
	{
		return quantity*cakeprice;
	}
	static double bill = 0;
	void selection()
	{
		System.out.println("\n 1-chocolatestore \n 2-drinkstore \n 3-cakestore");
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println("1.dairymilk \n 2.fivestar");
			int n1 = sc.nextInt();
			if(n1==1)
			{
				System.out.println("Select quantity");
				bill = bill+dairymilk(sc.nextInt());
			}
			else if(n1==2)
			{
				System.out.println("Select quantity");
				bill = bill+fivestar(sc.nextInt());
			}
			else
			{
				System.out.println("Invalid Selection");
			}
		}
		else if(n==2)
		{
			System.out.println("1.thumbsup \n 2.sprite");
			int n1 = sc.nextInt();
			if(n1==1)
			{
				System.out.println("Select quantity");
				bill = bill+thumbsup(sc.nextInt());
			}
			else if(n1==2)
			{
				System.out.println("Select quantity");
				bill = bill+sprite(sc.nextInt());
			}
			else
			{
				System.out.println("Invalid Selection");
			}
		}
		else if(n==3)
		{
			System.out.println("cake");
			int n1 = sc.nextInt();
			if(n1==1)
			{
				System.out.println("Select quantity");
				bill = bill+cake(sc.nextInt());
			}
			else
			{
				System.out.println("Invalid Selection");
			}
		}
		else
		{
			System.out.println("No Suitable category found \n please select valid one");
			selection();
		}
		System.out.println("1-order more \n 2-for billing \n any key to exit");
		char ch = sc.next().charAt(0);
		if(ch=='1')
		{
			selection();
		}
		else if(ch=='2')
		{
			billing(bill);
		}
	}
	void billing(double bill)
	{
		System.out.println("your bill "+bill);
		double gst = bill*0.18;
		System.out.println("gst on bill "+gst);
		System.out.println("your bill "+bill);
		System.out.println("total amount"+(bill+30+gst));
	}
}
class user
{
	public static void main(String args[])	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1-zepto \n 2-amazon");
		int n = sc.nextInt();
		if(n==1)
		{
			new zepto().selection();
		}
		else if(n==2)
		{
			new amazon().selection();
		}
		else
		{
			System.out.println("Invalid Category");
			main(args);
		}
	}
}