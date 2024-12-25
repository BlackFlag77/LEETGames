package com.forum;

public class Forum {
	private int fid;
	private String title;
	private String description;
	
	public Forum(int fid, String title, String description) {
		this.fid = fid;
		this.title = title;
		this.description = description;
	}

	public int getFid() {
		return fid;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
}