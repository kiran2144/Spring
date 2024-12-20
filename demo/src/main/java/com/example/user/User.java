package com.example.user;

public class User {
	
	private Integer userId;
	private String userName;
	private String address;

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the addreess
	 */
	public String getAddreess() {
		return address;
	}

	/**
	 * @param addreess the addreess to set
	 */
	public void setAddreess(String addreess) {
		address = addreess;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", Addreess=" + address + "]";
	}

}
