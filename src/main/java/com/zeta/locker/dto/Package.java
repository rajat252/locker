package com.zeta.locker.dto;

import com.zeta.locker.dto.enums.PackageStatus;

public class Package {

	private int id;
	private int userId;
	private int lockerId;
	private String packageSize;
	private PackageStatus packageStatus;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getLockerId() {
		return lockerId;
	}
	public void setLockerId(int lockerId) {
		this.lockerId = lockerId;
	}
	public String getPackageSize() {
		return packageSize;
	}
	public void setPackageSize(String packageSize) {
		this.packageSize = packageSize;
	}
	public PackageStatus getPackageStatus() {
		return packageStatus;
	}
	public void setPackageStatus(PackageStatus packageStatus) {
		this.packageStatus = packageStatus;
	}
	
}
