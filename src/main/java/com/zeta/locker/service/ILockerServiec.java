package com.zeta.locker.service;

import java.util.Map;

import com.zeta.locker.dto.Locker;
import com.zeta.locker.response.LockerDetails;

public interface ILockerServiec {

	public void addLocker(Locker locker);
	public LockerDetails assignLocker();
	public void openLocker(int otp, int lockerId) throws Exception;
	public void freeLocker(int lockerId) throws Exception;
	public Map<Integer, LockerDetails> getAssignedLockerMap() ;
}
