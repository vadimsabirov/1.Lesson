
public class HotBeverages  extends Beverages{
	
	private int temperature;
	
	private int volume;
	
	public HotBeverages(String name, int cost, int temperature, int volume) {
		super(name, cost);
		this.volume = volume;
		this.temperature = temperature;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public void setTemperature(int temperaturee) {
		this.temperature = temperature;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return "HotBeverages {"+"name = "+ super.getName()+
					" cost = "+ super.getCost() +
					" temperature = "+ temperature +
					" volume = " + volume 
					+ "}";
		}

}