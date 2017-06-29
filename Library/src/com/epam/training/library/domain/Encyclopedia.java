package com.epam.training.library.domain;

public class Encyclopedia extends BaseMaterial {

	public String branch;
	public String targetAudience;
	public int volume;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
