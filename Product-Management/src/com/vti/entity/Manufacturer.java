package com.vti.entity;

public class Manufacturer {
	private int ManufactureId;
	private String ManufacturerName;

	public int getManufactureId() {
		return ManufactureId;
	}

	public void setManufactureId(int manufactureId) {
		ManufactureId = manufactureId;
	}

	public String getManufacturerName() {
		return ManufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		ManufacturerName = manufacturerName;
	}

	@Override
	public String toString() {
		return "Manufacturer [ManufactureId=" + ManufactureId + ", ManufacturerName=" + ManufacturerName + "]";
	}

}