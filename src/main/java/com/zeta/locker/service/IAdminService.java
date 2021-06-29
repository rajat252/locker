package com.zeta.locker.service;

import java.util.List;

import com.zeta.locker.dto.Locker;
import com.zeta.locker.dto.enums.LockerStatus;

public interface IAdminService {

	public void addLocker(Locker locker, ILockerServiec lockerService);
	public void freeLocker(int lockerId, ILockerServiec lockerService) throws Exception;
	public List<Locker> viewLockers(LockerStatus lockerStatus,  ILockerServiec lockerService);
}
