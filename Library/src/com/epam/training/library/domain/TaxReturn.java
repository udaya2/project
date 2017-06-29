package com.epam.training.library.domain;

public class TaxReturn extends BaseMaterial {
	public String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNameOfTaxpayer() {
		return nameOfTaxpayer;
	}

	public void setNameOfTaxpayer(String nameOfTaxpayer) {
		this.nameOfTaxpayer = nameOfTaxpayer;
	}

	public String getTypeOfTaxRreturn() {
		return typeOfTaxRreturn;
	}

	public void setTypeOfTaxRreturn(String typeOfTaxRreturn) {
		this.typeOfTaxRreturn = typeOfTaxRreturn;
	}

	public int getYearOfDeclaration() {
		return yearOfDeclaration;
	}

	public void setYearOfDeclaration(int yearOfDeclaration) {
		this.yearOfDeclaration = yearOfDeclaration;
	}

	public String nameOfTaxpayer;
	public String typeOfTaxRreturn;
	public int yearOfDeclaration;

}
