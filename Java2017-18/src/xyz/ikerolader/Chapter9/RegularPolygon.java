package xyz.ikerolader.Chapter9;

public class RegularPolygon {
	private int n=3;
	private double side=1;
	private double x=0;
	private double y=0;
	public RegularPolygon() {
		
	}
	public RegularPolygon(int side, double length) {
		this.setN(side);
		this.setSide(length);
	}
	public RegularPolygon(int side, double length, double x, double y) {
		this.setN(side);
		this.setSide(length);
		this.setX(x);
		this.setY(y);
	}
	public double getPerimeter() {
		return this.n*this.side;
	}
	public double getArea() {
		return (this.n*Math.pow(side, 2))/(4*Math.tan(Math.PI/this.n));
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}
