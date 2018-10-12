package com.test.example;

public class Time {
	
	private int hour, minute, second;

	public Time(int hour, int minute, int second) {
		
		if (hour < 0 || minute < 0 || second < 0) {
			return; //예외
		}
		
		//this.second = second % 60;
		//this.minute = second / 60;
		//this.minute += minute;
		//this.hour = this.minute / 60;
		//this.minute = this.minute % 60;		
		//this.hour += hour;
		
		this.second = second % 60;
		this.hour = (second / 60 + minute) / 60;
		this.minute = (second / 60 + minute) % 60;		
		this.hour += hour;
		
	}
	
	public String info() {
		return String.format("%d:%d:%d", this.hour, this.minute, this.second);
	}
	
}









