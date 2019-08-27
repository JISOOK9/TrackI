package com.koo.tracki.db;

public class FactorDto {

	String uid;
	String factor1;
	String factor2;
	String factor3;
	String factor4;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getFactor1() {
		return factor1;
	}

	public void setFactor1(String factor1) {
		this.factor1 = factor1;
	}
	
	public String getFactor2() {
		return factor2;
	}

	public void setFactor2(String factor2) {
		this.factor2 = factor2;
	}

	public String getFactor3() {
		return factor3;
	}

	public void setFactor3(String factor3) {
		this.factor3 = factor3;
	}

	public String getFactor4() {
		return factor4;
	}

	public void setFactor4(String factor4) {
		this.factor4 = factor4;
	}

	@Override
	public String toString() {
		return "FactorDto [uid=" + uid + ", factor1=" + factor1 + ", factor2=" + factor2 + ", factor3=" + factor3
				+ ", factor4=" + factor4 + "]";
	}



}
