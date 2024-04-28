import java.util.List;
import java.util.ArrayList;

public interface VendingMachine {
	
	
	public void initBeverages(List<Beverages> beveragesList);
	
	public Beverages getBeverages(String name);

}

