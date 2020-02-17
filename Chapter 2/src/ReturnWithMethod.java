class BoxII {
	double length;
	double depth;
	double height;
	double volume() {
		return length * depth * height;
	}
}
class Method2 {
	public static void main(String args[]) {
	BoxII mybox1 = new BoxII();
	BoxII mybox2 = new BoxII();
	double vol;

	//assign values to mybox1's instance variables
	mybox1.length = 2;
	mybox1.height = 4;
	mybox1.depth = 15;
	
//assign values to mybox2's instance variables
	mybox2.length = 6;
	mybox2.height = 5;
	mybox2.depth = 20;
	
//	vol = mybox1.volume();
	System.out.println("Box1 Volume is " + mybox1.volume());
	
//	vol = mybox2.volume();
	System.out.println("Box2 Volume is " + mybox2.volume());
	}
}

	
	

