class Ellipse_area
{
	void area()
	{
		int a=30,b=20;
		double area=3.142*a*b; //a=major axis......b=minor axis
		System.out.println("The area of Ellipse is : "+area);		
	}
	
}

class Math_Ellipse
{
	public static void main(String[] args)
	{
		new Ellipse_area().area();
	}	
}