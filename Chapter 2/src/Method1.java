class BoxI {
	double length;
	double depth;
	double height;
	void volume() {
		
		System.out.println("Volume is ");
		System.out.println(length * depth * height);
	}
}
class Method1 {
	public static void main(String args[]) {
	BoxI mybox1 = new BoxI();
	BoxI mybox2 = new BoxI();

	//assign values to mybox1's instance variables
	mybox1.length = 1;
	mybox1.height = 2;
	mybox1.depth = 12;
	
//assign values to mybox2's instance variables
	mybox2.length = 3;
	mybox2.height = 10;
	mybox2.depth = 20;
	
	mybox1.volume();
	mybox2.volume();
	}
}
