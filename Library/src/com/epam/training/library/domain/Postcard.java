package com.epam.training.library.domain;

public class Postcard extends BaseMaterial {

	public String kind;;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getPainter() {
		return painter;
	}

	public void setPainter(String painter) {
		this.painter = painter;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public boolean isVoice() {
		return voice;
	}

	public void setVoice(boolean voice) {
		this.voice = voice;
	}

	public String painter;
	public String country;
	public String plot;
	public boolean voice;

}
