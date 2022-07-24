class Trapezoid_area
{
	void area()
	{
		int side_a=30,side_b=20,height=30;
		double area=0.5*(side_a+side_b)*height; 
		System.out.println("The area of Trapezoid is : "+area);		
	}
	
}

class Math_Trapezoid
{
	public static void main(String[] args)
	{
		new Trapezoid_area().area();
	}	
}