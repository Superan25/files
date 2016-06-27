class operators
{
	int x = 5, y = 10;
	
	operators()
	{
		System.out.println("\n\n The result of x + y * 2  =  " + (x + y * 2));
		System.out.println("\n The result of x - y + 2  =  " + (x - y + 2));
		System.out.println("\n The result of (x+y) * 2  =  " + ((x + y) * 2));
		System.out.println("\n The result of y % x  =  " + (y % x));
	}
	
	public static void main(String a[])
	{
		new operators();
	}
}