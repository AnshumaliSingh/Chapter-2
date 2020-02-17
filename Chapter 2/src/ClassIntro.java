/* A program that uses the Box class.
Call this file BoxDemo.java
*/
class Box {
		double width;
		double height;
		double depth;
			}
	// This class declares an object of type Box.
class BoxDemo {
	public static void main(String args[]) {
	Box mybox1 = new Box();
	Box mybox2 = new Box();
	double vol1;
	double vol2;
	// assign values to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
// assign values to mybix2's instance variables
		mybox2.width = 1;
		mybox2.height = 2;
		mybox2.depth = 3;
		
	// compute volume of box
	vol1 = mybox1.width * mybox1.height * mybox1.depth;
		vol2 = mybox2.width * mybox2.height * mybox2.depth;
	
	System.out.println("Volume of mybox1 is " + vol1);
	System.out.println("Volume of mybox2 is " + vol2);
	}
}