package com.epam.training.library.domain;

import java.util.Date;

public class Manuscript extends BaseMaterial {
	public Date dateOfCreation;
	public String placeOfCreation;

	public String baseType;

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getBaseType() {
		return baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

}
