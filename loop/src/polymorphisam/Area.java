package polymorphisam;

public class Area {

	void area(int a, float b) {
		System.out.println("Area of rectangle " + (1 * b));
	}

	void area(double r) {
		System.out.println("Area of is circle" + (3.14 * r * r));
	}

	void area(float b, float h) {
		System.out.println("Area of triangle: " + (b * h) / 2);
	}

	void area(int s) {
		System.out.println("Area of square: " + (s * s));
	}

	public static void main(String[] args) {
		Area a1 = new Area();
		a1.area(33);
		a1.area(50);
		a1.area(55.0f, 5.5f);
		a1.area(66, 77);

	}
}
