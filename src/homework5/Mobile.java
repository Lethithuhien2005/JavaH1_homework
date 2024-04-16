package homework5;

import java.awt.Color;

public class Mobile {
	private java.lang.String ownerName;
	private java.awt.Color color;
	private String number;
	private java.lang.String model;

	public Mobile(String ownerName, Color color, String number, String model) {
		this.ownerName = ownerName;
		this.color = color;
		this.number = number;
		this.model = model;
	}

	public java.lang.String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(java.lang.String ownerName) {
		this.ownerName = ownerName;
	}

	public java.awt.Color getColor() {
		return color;
	}

	public void setColor(java.awt.Color color) {
		this.color = color;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public java.lang.String getModel() {
		return model;
	}

	public void setModel(java.lang.String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Mobile: ownerName=" + ownerName + ", color=" + color + ", number=" + number + ", model=" + model;
	}
}
