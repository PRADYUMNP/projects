package Inheritance;

public class Samsung extends Mobile {
	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	void cameraResolutaion() {
		System.out.println("all smasung camera should more than 12mp");
	}
	void display()
	{
		System.out.println(storage);
	}

}
