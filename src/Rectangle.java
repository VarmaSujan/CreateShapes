public class Rectangle{
	//Add the fields necessary to create a rectangle here.
	//Make use of the Line class

	private Line l1;
	private Line l2;
	private Line l3;
	private Line l4;


	//Create a constructor which recieves and stores 4 lines when created
	public Rectangle(Line l1, line l2, line l3, line l4){
		this.l1 =l1;
		this.l2 =l2;
		this.l3 =l3;
		this.l4 =l4;

		if (!isRectangle (l1,l2,l3,l4))
			throw new Exception(" Not a rect");
	}

	//Implement a method which returns the circumreference of the rectangle
	public double circumreference(){

		return l1.length()+l2.length+l3.length+l4.length;
	}	

	//Implement a method which returns the area of the rectangle
	public double area(){

		return l1.length()*l2.length;
	}
}

/*Public class Triangle

private line1
l2
l3

public triangle (Line l1, Line l2,.....

this.l1 =l1;
....
....

pub doubl circum (){
return l1.length() +l2.length()........


public double area(){
herons formula
 double s = circumference/2;
 return math.sqrt (s*(s-l1.length() ....2 ......3.);


 */

