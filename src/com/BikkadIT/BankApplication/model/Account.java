package com.BikkadIT.BankApplication.model;

public class Account {
	int accNo;
	String accName;
	String accAddress;
	String accPan;
	Double accAmt;
	private String accAddr;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo=accNo;
	}
	public String getaccNAme() {
		return accName;
	}
	public void setAccNAme(String accName) {
		this.accName =accName;
	}
	public String getAccAddr() {
		return accAddr;
	}
	public void setAccAddr(String accAddr) {
		this.accAddr = accAddr;
	}

	public String getAccPan() {
		return accPan;
	}

	public void setAccPan(String accPan) {
		this.accPan = accPan;
	}

	public Double getAccAmt() {
		return accAmt;
	}

	public void setAccAmt(Double accAmt) {
		this.accAmt = accAmt;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", accAddr=" + accAddr + ", accPan=" + accPan
				+ ", accAmt=" + accAmt + "]";
	
}
}
