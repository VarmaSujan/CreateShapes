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

//		 implement isIntersecting Method
//			https://www.baeldung.com/java-check-if-two-rectangles-overlap
//			https://docs.oracle.com/javase/7/docs/api/java/awt/geom/Line2D.html (intersects method)
//			Alternative 1: use logical math based approach similar to https://stackoverflow.com/a/3838357
// 			Alternative 2: use library Line2D with intersectsLine method found here:
// 			https://docs.oracle.com/javase/7/docs/api/java/awt/geom/Line2D.html#intersectsLine(double,%20double,%20double,%20double)
//			public boolean isIntersecting(Line l){ //...
//				return ccw(p1,l.p1,l.p2) != ccw(p2,l.p1,l.p2) && ccw(p1,p2,l.p1) != ccw(p1,p2,l.p2);
//			}
//			private static boolean ccw(Point a, Point b, Point c){
//				return (c.getY()-a.getY())*(b.getX()-a.getX()) > (b.getY()-a.getY())*(c.getX()-a.getX());
//			}
//
//			Stack OverflowStack Overflow
//			How can I check if two segments intersect?
//					How can I check if 2 segments intersect? I've the following data: Segment1 [ {x1,y1}, {x2,y2} ] Segment2 [ {x1,y1}, {x2,y2} ]
//			I need to write a small algorithm in Python to detect if the 2 line...

