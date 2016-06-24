class test2
{
	int age;
	
	void check_eligibility(int age)
	{
		this.age = age;
		if (this.age >= 18)
		{
			System.out.println("The person is eligible to vote ");
		}
		
		else
		{
			System.out.println("The person is not eligible to vote ");
		}
	}
	public static void main(String a[])
	{
		test2 T = new test2();
		T.check_eligibility(17.5);
	}
}