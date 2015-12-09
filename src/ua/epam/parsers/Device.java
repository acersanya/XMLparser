package ua.epam.parsers;

public class Device {

	private String name;
	private String origin;
	private int price;
	private Type deviceType;
	private boolean isCritical;
	
	
	public Device(String name, String origin, int price, Type deviceType, boolean isCritical) {
		super();
		this.name = name;
		this.origin = origin;
		this.price = price;
		this.deviceType = deviceType;
		this.isCritical = isCritical;
	}
	
	public Device(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Type getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(Type deviceType) {
		this.deviceType = deviceType;
	}

	public boolean isCritical() {
		return isCritical;
	}

	public void setCritical(boolean isCritical) {
		this.isCritical = isCritical;
	}

	@Override
	public String toString() {
		return "Device [name=" + name + ", origin=" + origin + ", price=" + price + ", deviceType=" + deviceType
				+ ", isCritical=" + isCritical + "]";
	}	

}
