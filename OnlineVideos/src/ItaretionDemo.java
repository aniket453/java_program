
public class ItaretionDemo {

	public static void main(String args[])
	{
		
		/*for(int i = 10; i>0 ; i--)
		{
			for(char j = 65 ; j <= 75 - i ; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i = 1; i<= 6 ; i++)
		{
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		for(int i = 1; i <= 4 ; i++)
		{
			for(int j = 1 ; j <= 4; j++)
			{
				if(i==2 || i==3)
				{
					if(j==1 || j == 4)
					{
						System.out.print("$ ");
					}
					if(j==2 || j==3)
						System.out.print("  ");
					
				}
				else
				{
					if(j!=2 || j != 3)
					System.out.print("$ ");
				}
				
				
			}
			System.out.println();
		}
	}
}
