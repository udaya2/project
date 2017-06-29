package com.epam.training.library.domain;

public class Reproduction extends BaseMaterial {
	public String PrintingMethod;
	public int NumberOfColors;
	public String material;
	public String size;

	public String getPrintingMethod() {
		return PrintingMethod;
	}

	public void setPrintingMethod(String printingMethod) {
		PrintingMethod = printingMethod;
	}

	public int getNumberOfColors() {
		return NumberOfColors;
	}

	public void setNumberOfColors(int numberOfColors) {
		NumberOfColors = numberOfColors;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
