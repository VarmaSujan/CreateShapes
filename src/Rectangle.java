public class Rectangle{
	//Adds the fields necessary to create a rectangle here.
	//Makes use of the Line class

	private Line l1;
	private Line l2;
	private Line l3;
	private Line l4;


	//Creates a constructor which receives and stores 4 lines when created
	public Rectangle(Line l1, Line l2, Line l3, Line l4){
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
	}
	// Implement a check for the rectangle
	//		if (!isRectangle (l1,l2,l3,l4))
	//			throw new Exception(" Not a rect");

	//Implements a method which returns the circumference of the rectangle
	public double circumference(){
		return l1.length() + l2.length() + l3.length() + l4.length();
	}	

	//Implements a method which returns the area of the rectangle
	public double area(){
		return l1.length()*l2.length();
	}


}



