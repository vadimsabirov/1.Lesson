import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<Beverages> beveragesList = new ArrayList<>();
		beveragesList.add(new HotBeverages("Tea", 100, 50, 300));
		beveragesList.add(new HotBeverages("Coffee", 120, 60, 300));
		beveragesList.add(new HotBeverages("Capuccino", 150, 50, 400));
		beveragesList.add(new HotBeverages("Espresso", 80, 70, 70));
		beveragesList.add(new HotBeverages("Latte", 130, 60, 400));
		HotBeveragesVendor vendingMachine = new HotBeveragesVendor();
		vendingMachine.initBeverages(beveragesList);
		System.out.println(vendingMachine.getBeverages("Tea", 300, 50));
		System.out.println(vendingMachine.getBeverages("Coffee", 300, 60));
		System.out.println(vendingMachine.getBeverages("Capuccino", 400, 50));
		System.out.println(vendingMachine.getBeverages("Espresso", 70, 70));
		System.out.println(vendingMachine.getBeverages("Latte", 400, 60));
	}

}