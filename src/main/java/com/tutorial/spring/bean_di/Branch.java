package com.tutorial.spring.bean_di;

public abstract class Branch {
	private int branchCode;
	private String branchName;
	
	public Branch(){
		
	}

	public Branch(int branchCode, String branchName) {
		super();
		this.branchCode = branchCode;
		this.branchName = branchName;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
}
