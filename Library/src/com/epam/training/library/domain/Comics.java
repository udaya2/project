package com.epam.training.library.domain;

public class Comics extends BaseMaterial {

	public String plot;
	public String universe;

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getUniverse() {
		return universe;
	}

	public void setUniverse(String universe) {
		this.universe = universe;
	}

	public String getSuperhero() {
		return superhero;
	}

	public void setSuperhero(String superhero) {
		this.superhero = superhero;
	}

	public String superhero;

}
