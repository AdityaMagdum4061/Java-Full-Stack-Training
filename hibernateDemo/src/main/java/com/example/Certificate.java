package com.example;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private int duration;
	private String course;
	private String uni;
	public String getUni() {
		return uni;
	}
	public void setUni(String uni) {
		this.uni = uni;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Certificate(int duration, String course ,String uni) {
		super();
		this.duration = duration;
		this.course = course;
		this.uni=uni;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
