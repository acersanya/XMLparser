package ua.epam.parsers;

public class Type {
	
	private boolean isOutskirt;
	private int energyConsumption;
	private boolean isCooler;
	private AccessoryGroup accessory;
	private PortType port;
	
	public Type(){
		
	}
	
	public Type(boolean isOutskirt, int energyConsumption, boolean isCooler, AccessoryGroup accessory, PortType port) {
		super();
		this.isOutskirt = isOutskirt;
		this.energyConsumption = energyConsumption;
		this.isCooler = isCooler;
		this.accessory = accessory;
		this.port = port;
	}

	public boolean isOutskirt() {
		return isOutskirt;
	}

	public void setOutskirt(boolean isOutskirt) {
		this.isOutskirt = isOutskirt;
	}

	public int getEnergyConsumption() {
		return energyConsumption;
	}

	public void setEnergyConsumption(int energyConsumption) {
		this.energyConsumption = energyConsumption;
	}

	public boolean isCooler() {
		return isCooler;
	}

	public void setCooler(boolean isCooler) {
		this.isCooler = isCooler;
	}

	public AccessoryGroup getAccessory() {
		return accessory;
	}

	public void setAccessory(AccessoryGroup accessory) {
		this.accessory = accessory;
	}

	public PortType getPort() {
		return port;
	}

	public void setPort(PortType port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Type [isOutskirt=" + isOutskirt + ", energyConsumption=" + energyConsumption + ", isCooler=" + isCooler
				+ ", accessory=" + accessory + ", port=" + port + "]";
	}

}
