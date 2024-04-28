import java.util.List;
import java.util.ArrayList;


public class HotBeveragesVendor  implements VendingMachine{
	private List<Beverages> beveragesList = new ArrayList<>();
	@Override
	public void initBeverages(List<Beverages> beveragesList) {
		this.beveragesList = beveragesList;
		
	}
	
	@Override
	public Beverages getBeverages(String name) {
		for (Beverages item : beveragesList)
			if(item.getName().equals(name))
				return item;
		
		return null;
		
	}
	
	public Beverages getBeverages(String name, int volume, int temperature) {
		for (Beverages item : beveragesList)
			if(item.getName().equals(name) && ((HotBeverages) item).getVolume() == volume && ((HotBeverages) item).getTemperature() == temperature)
				return item;
		return null;
	}

}