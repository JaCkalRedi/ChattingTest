package com.whitecodelab.whiteboard.core.model.entity;

/**
 * 
 * @author KimHanKyul
 *
 */
public class MemberEntity {

	/**
	 * Member login id
	 */
	private String id;
	/**
	 * Member login password
	 */
	private String pass;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
