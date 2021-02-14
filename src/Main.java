public class Main
{
        public static void main(String[] args){
		//Creates a square using the Point, Line, and Square classes
		//Print the area and circumreference of the square
		//Print using the "System.out.println()" command
		 Point p1 = new Point (1,1);
		 Point p2 = new Point (1, 101);
		 Point p3 = new Point (201,101);
		 Point p4 = new Point (201, 1);

		 Line l1 = new Line (p1,p2);
		 Line l2 = new Line (p2,p3);
		 Line l3 = new Line (p3,p4);
		 Line l4 = new Line (p4,p1);

		 //Diagonal line to create 2 right angle triangles within the rectangle/square.
		 Line l5 = new Line (p1, p3);

		 Rectangle rect = new Rectangle(l1,l2,l3,l4);

		 Triangle triangle = new Triangle(l1, l2, l5);

		 System.out.println(rect.circumference());
		 System.out.println(rect.area());
		 System.out.println(triangle.circumference());
		 System.out.println(triangle.area());
        }
}


