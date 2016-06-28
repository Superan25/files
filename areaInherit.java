class area
{
	double x = 10, y = 8;
	
	void area_of_rectangle()
	{
		System.out.println("The Area of Rectangle is =  " + x * y);
	}
	
	void area_of_triangle()
	{
		System.out.println("The Area of Triangle is =  " + (0.5 * (x * y)));
	}
}

class areaInherit extends area
{
	void area_of_rectangle()
	{
		System.out.println("The Area of Rectangle is =  " + x * y );
	}
	
	void area_of_triangle()
	{
		System.out.println("The Area of Triangle is  =  " + (0.5 * (x * y)));
	}
	
	public static void main(String a[])
	{
		areaInherit A = new areaInherit();
		A.area_of_rectangle();
		A.area_of_triangle();
	}
}