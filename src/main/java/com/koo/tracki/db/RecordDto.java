package com.koo.tracki.db;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

@Repository
public class RecordDto {

	private String rid;
	private String uid;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date rdate;

	private int scrMood;
	private int scrF1;
	private int scrF2;
	private int scrF3;
	private int scrF4;
	private String memo;

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Date getRdate() {
		return rdate;
	}

	public void setRdate(Date date) {
		this.rdate = date;
	}

	public int getScrMood() {
		return scrMood;
	}

	public void setScrMood(int scrMood) {
		this.scrMood = scrMood;
	}

	public int getScrF1() {
		return scrF1;
	}

	public void setScrF1(int scrF1) {
		this.scrF1 = scrF1;
	}

	public int getScrF2() {
		return scrF2;
	}

	public void setScrF2(int scrF2) {
		this.scrF2 = scrF2;
	}

	public int getScrF3() {
		return scrF3;
	}

	public void setScrF3(int scrF3) {
		this.scrF3 = scrF3;
	}

	public int getScrF4() {
		return scrF4;
	}

	public void setScrF4(int scrF4) {
		this.scrF4 = scrF4;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "RecordDto [rid=" + rid + ", uid=" + uid + ", rdate=" + rdate + ", scrMood=" + scrMood + ", scrF1="
				+ scrF1 + ", scrF2=" + scrF2 + ", scrF3=" + scrF3 + ", scrF4=" + scrF4 + ", memo=" + memo + "]";
	}
}
