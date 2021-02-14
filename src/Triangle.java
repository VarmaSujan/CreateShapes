public class Triangle {

    private Line l1;
    private Line l2;
    private Line l5;

    public Triangle(Line l1, Line l2, Line l5){
        this.l1 = l1;
        this.l2 = l2;
        this.l5 = l5;
    }

    //Implements a method to calculate the circumference of a triangle
    public double circumference(){
        return l1.length() + l2.length() + l5.length();
    }

    //Implements a method to calculate the area of a triangle(Heron's/Hero's Formula utilised)
    public double area(){
        double s = circumference()/2;
        return Math.sqrt(s*(s-l1.length())*(s-l2.length())*(s-l5.length()));
    }

}
