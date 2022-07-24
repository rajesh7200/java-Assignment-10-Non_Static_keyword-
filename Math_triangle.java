class Sector_area
{
	void area()
	{
		int base=10,height=20;
		double area=0.5*base*height;
		System.out.println("The area of circle is : "+area);		
	}
	
}

class Math_Sector
{
	public static void main(String[] args)
	{
		new Sector_area().area();
	}	
}