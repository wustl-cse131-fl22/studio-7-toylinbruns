package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle(double initwidth, double initlength) {
		this.width = initwidth;
		this.length = initlength;
	}
	
	public double area() {
		return (this.width*this.length);
	}
	
	public double perimeter() {
		return (2*(this.width+this.length));
	}
	
	public boolean isSquare() {
		return (this.width == this.length);
	}
	
	public boolean areaComparison(Rectangle worseRectangle) {
		return (this.area()>worseRectangle.area());
	}
	
	public void drawingMuchGood() {
		StdDraw.filledRectangle(0, 0, width/2, length/2);
	}
	
	public static void main(String[] args) {
		Rectangle sexyRectangle = new Rectangle(1,2);
		Rectangle worseRectangle = new Rectangle(1,1);
		System.out.println(sexyRectangle.area());
		System.out.println(sexyRectangle.perimeter());
		System.out.println(sexyRectangle.isSquare());
		System.out.println(sexyRectangle.areaComparison(worseRectangle));
		sexyRectangle.drawingMuchGood();

	}


}
 



