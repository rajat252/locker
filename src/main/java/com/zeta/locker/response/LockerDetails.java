package com.zeta.locker.response;

import com.zeta.locker.dto.Locker;

public class LockerDetails {

	private Locker locker;
	private int otp;
	public Locker getLocker() {
		return locker;
	}
	public void setLocker(Locker locker) {
		this.locker = locker;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
}
