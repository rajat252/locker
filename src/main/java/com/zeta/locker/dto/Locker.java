package com.zeta.locker.dto;

import com.zeta.locker.dto.enums.LockerStatus;

public class Locker {

	private int id;
	private Integer zipCode;
	private LockerStatus lockerStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	public LockerStatus getLockerStatus() {
		return lockerStatus;
	}
	public void setLockerStatus(LockerStatus lockerStatus) {
		this.lockerStatus = lockerStatus;
	}
	
}
