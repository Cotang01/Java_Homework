package oop.oop_6_hw.work1;

// Прямоугольник
public class Rectangle implements Shape {

    private double height;
    private double width;
    
    public Rectangle(double height, double width) {
		super();
		if (height > 0) {
			this.height = height;
		} else {
			this.height = 1;
			System.out.println("Error! Rectangle's height can't be < 0;\n"
					+ "Setting parameter to 1");
		}
		if (width > 0) {
			this.width = width;
		} else {
			this.width = 1;
			System.out.println("Error! Rectangle's width can't be < 0;\n"
					+ "Setting parameter to 1");
		}
	}

	@Override
	public double calcArea() {
		return (this.height * this.width);
	}

}
