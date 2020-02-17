public class BoxC {
	double width;
	double height;
	double depth;
	
	double volume()
	{
		return width*height*depth;
	}

		
	public static void main(String args[])
	{
		BoxC box1 = new BoxC();
		BoxC box2 = new BoxC();
		double vol;
		box1.width = 4;
		box1.depth = 5;
		box1.height = 6;
				
		box2.width = 10;
		box2.depth = 12;
		box2.height = 20;
		
		vol = box1.volume();
		System.out.println("Volume is " + vol);
		
		vol = box2.volume();
		System.out.println("Volume is " + vol);
}
}
