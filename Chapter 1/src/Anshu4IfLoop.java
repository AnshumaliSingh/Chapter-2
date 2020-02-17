
public class Anshu4IfLoop {
	public static void main(String args[]) {
		int x,y;
		x = 10;
		y = 20;
		x = x+y;
		if(x>y) {
			System.out.println("X = " + x);
			System.out.println("Y = " + y);
			System.out.println("X is Greater than Y");
			
		}
		x = (x-y)*2;
		if(x == y) {
			System.out.println("X = " + x);
			System.out.println("Y = " + y);
			System.out.println("Xis now equal to Y");
		}
		x = x-1;		
		if(x<y) {
			System.out.println("X = " + x);
			System.out.println("Y = " + y);
			System.out.println("X is now smaller than Y");
		}
		System.out.println("X = " + x + " is now smaller than Y = " +y);
	}
}
