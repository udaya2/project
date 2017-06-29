package com.epam.training.library.domain;

import java.util.Date;

public class SchedulesTelecasts extends BaseMaterial {
	public String channel;
	public Date beginDate;
	public Date endDate;

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
