package com.coderscampus.domain;

public class Message {
	private String text;
	private String chanelId;
	private String user;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getChanelId() {
		return chanelId;
	}
	public void setChanelId(String chanelId) {
		this.chanelId = chanelId;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
}
