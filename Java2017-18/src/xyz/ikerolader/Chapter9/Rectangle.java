package xyz.ikerolader.Chapter9;

public class Rectangle {
	double width, height=1;
	public Rectangle() {
		
	}
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	public double getArea() {
		return this.width*this.height;
	}
	public double getPerimeter() {
		return this.width*2+this.height*2;
	}
}
