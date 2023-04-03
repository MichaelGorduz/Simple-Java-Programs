package triangle;

public class Main {

	public static void main(String[] args) {

		System.out.println("Triangle Task");
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println("Given: Side A = 0.3, Side B = 0.4, Side C = 0.5  ");

		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;

		double semiPerimeter = (sideA + sideB + sideC) / 2;

		double triangleSquare = Math
				.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

		System.out.println("SOLUTION - Square of triangle is: " + triangleSquare);
		System.out.println("----------------------------------------------------");
		System.out.println(" ");

		System.out.println("Apple Task");
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println("Given: Cost of Apple = $2, total amount of apples = 6");

		int appleCost = 2;
		int appleAmount = 6;
		int sum = appleCost * appleAmount;

		System.out.println("SOLUTION - Total money spent: $" + sum);
		System.out.println("----------------------------------------------------");
		System.out.println();

		System.out.println("Fuel Task");
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println("Given: 1 liter of fuel = $1.2, Car spending fuel/km = 8/100,");
		System.out.println("Distance = 120km");

		double fuelCost = 1.2;
		double fuelKm = 8d / 100d;
		double distance = 120;
		double totalFuelAmount = (fuelKm * distance * fuelCost);

		System.out.println("SOLUTION - Total money for fuel spent: $" + totalFuelAmount);

	}

}
