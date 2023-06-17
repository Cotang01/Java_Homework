package oop.oop_6_hw.work1;

// Квадрат
public class Square implements Shape {
	
	private double side;

	public Square(double side) {
		if (side > 0) {
			this.side = side;
		} else {
			this.side = 1;
			System.out.println("Error! Square's side can't be < 0;\n"
					+ "Setting parameter to 1");
		}
	}
	
	@Override
	public double calcArea() {
		return (this.side * this.side);
	}
	
}
