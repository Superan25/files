class addingNumbers
{
		int x = 30;
		float y = 36.879f; 
		int y1 = (int)y;
		int z;
		
		void addition()
		{
			z = x + y1;
			System.out.println("The Addition of Two Numbers is  =  " + z);
		}
		
		public static void main(String a[])
		{
			addingNumbers A = new addingNumbers();
			A.addition();
		}
}