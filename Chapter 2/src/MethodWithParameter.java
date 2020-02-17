class BoxIII {
	double length;
	double depth;
	double height;
// Declaring Method	
double volume() {
		return length * depth * height;
	}
void setDim(double l, double d, double h) {
	length = l;
	depth = d;
	height = h;
}
}
class Method3 {
	public static void main(String args[]) {
	BoxIII mybox1 = new BoxIII();
	BoxIII mybox2 = new BoxIII();
	double vol;

mybox1.setDim(3,3,3);
mybox2.setDim(4,4,4);

vol = mybox1.volume();
System.out.println("Box1 Volume is " + vol);

vol = mybox2.volume();
System.out.println("Box2 Volume is " + vol);
	}
}

	
//assign values to mybox1's instance variables
//	mybox1.length = 3;
//	mybox1.height = 3;
//	mybox1.depth = 5;
	
//assign values to mybox2's instance variables
//	mybox2.length = 6;
//	mybox2.height = 5;
//	mybox2.depth = 2;	

