
public class ForLoopSum {
	public static void main(String args[])
	{
		/*int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for(int i=0; i<10; i++)
		{
			sum += num[i];
		}
		System.out.println("Sum of Array of numbers is = " + sum);
		
			int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			int sum = 0;
			// use for-each style for to display and sum the values
			for(int x : nums) {
				
			System.out.println("X is: " + x);
			
			sum += x;
			System.out.println("Sum is : " + sum);
			}
			System.out.println("Summation: " + sum);*/
	
				int sum = 0;
				int nums[] = { 10, 7, 6, 3, 9, 4, 1, 9, 5, 2 };
				// use for to display and sum the values
				for(int x : nums) {
				System.out.println("Value is: " + x);
				sum += x;
				if(x == 5) break; // stop the loop when 5 is obtained
				}
				System.out.println("Summation of first 5 elements: " + sum);
	
	
	
	}
}
				
