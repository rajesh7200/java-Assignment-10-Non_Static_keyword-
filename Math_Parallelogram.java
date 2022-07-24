class Parallelogram_area
{
	void area()
	{
		int base=30,height=20;
		double area=base*height;
		System.out.println("The area of Parallelogram is : "+area);		
	}
	
}

class Math_Parallelogram
{
	public static void main(String[] args)
	{
		new Parallelogram_area().area();
	}	
}