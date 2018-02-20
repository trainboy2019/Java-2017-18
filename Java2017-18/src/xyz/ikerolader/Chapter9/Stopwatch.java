package xyz.ikerolader.Chapter9;

import java.util.Date;

public class Stopwatch {
	private Date date=new Date();
	private long startTime;
	private long endTime;
	public Stopwatch() {
		this.startTime=this.date.getTime();
	}
	public void start() {
		Date date=new Date();
		setStartTime(date.getTime());
	}
	public void stop() {
		Date date=new Date();
		setEndTime(date.getTime());
	}
	public long getElapsedTime() {
		return getEndTime()-getStartTime();
	}
	public long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

}
