class Sector_area
{
	void area()
	{
		int r=20,angle=30;
		double area=0.5*r*r*(angle/360);
		System.out.println("The area of Sector is : "+area);		
	}
	
}

class Math_Sector
{
	public static void main(String[] args)
	{
		new Sector_area().area();
	}	
}