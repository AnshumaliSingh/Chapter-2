
public class ForPrime {

	public static void main(String args[])
	{
		int x = 27;
		boolean isPrime = true;
		for(int i = 2; i < x; i++)
		{
			if((x % i) == 0)
					{
				isPrime = false;
				break;
					}
		}
		if(isPrime) System.out.println("Number X is Prime");
		else System.out.println("Number X is Not Prime"); 	
		
	}
	
}
