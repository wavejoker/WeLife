package com.welife.common.pojo;

public class EUTreeNode {

	private long parentId;
	private long id;
	private String text;
	private String state;

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "EUTreeNode [parentId=" + parentId + ", id=" + id + ", text=" + text + ", state=" + state + "]";
	}
}
