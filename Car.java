package in.oasys.basic.Car;

public class Car {
	public static void main(String args[]) {

		CarDetails c = new CarDetails();

		c.carName = "bmw";
		c.fuelType = "pertol";
		c.price = 400000L;
		c.varient = "Gt";
		c.tranmission = "Automatic";

		CarDetails c1 = new CarDetails();

		c1.carName = "Audi";
		c1.fuelType = "Deisel";
		c1.price = 350000L;
		c1.varient = "A8";
		c1.tranmission = "Manual";

		System.out.println(c.carName);
		System.out.println(c.fuelType);
		System.out.println(c.price);
		System.out.println(c.varient);
		System.out.println(c.tranmission);

		System.out.println("the total car price is" + "  " + c.price + c1.price);

		if (c.price > c1.price) {
			System.out.println("bmw is costly");
		} else
			System.out.println("audi is costly");
             System.out.println("print");    
	}
	

}
