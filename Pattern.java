class Pattern
{
	int i, j;
	
	void disp()
	{
		for(i = 1; i <= 5; i++)
		{
			System.out.print("\n");
			for(j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			
		}
			for(i = 4; i >= 1; i--)
			{
				System.out.print("\n");
				for(j = 1; j<= i; j++)
				{
					System.out.print(j);
				}
			}System.out.print("\n");
	} 
	
	public static void main(String b[])
	{
		Pattern P = new Pattern();
		P.disp();
	}
}