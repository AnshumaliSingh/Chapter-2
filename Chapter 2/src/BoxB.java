
public class BoxB 
{

	double width;
	double height;
	double depth;
	int i = 1;
		
		
	public static void main(String args[])
	{
		BoxB box1 = new BoxB();
		BoxB box2 = new BoxB();
		
		box1.width = 4;
		box1.depth = 5;
		box1.height = 6;
		box1.i = 1;
		
		box2.width = 10;
		box2.depth = 12;
		box2.height = 20;
		box2.i = 2;
		
		//vol1 = box1.width*box1.height*box1.depth;
		//System.out.println("Volume1 is " + vol1);
		//vol2 = box2.width*box2.height*box2.depth;
		//System.out.println("Volume2 is " + vol2);
		box1.volume();
		box2.volume();
		
	}
	void volume()
	{
		System.out.println("Volume " + i + " is " + width*depth*height);
		//System.out.println(width*depth*height);
	}
}
