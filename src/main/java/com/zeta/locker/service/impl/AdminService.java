package com.zeta.locker.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.zeta.locker.dto.Locker;
import com.zeta.locker.dto.enums.LockerStatus;
import com.zeta.locker.service.IAdminService;
import com.zeta.locker.service.ILockerServiec;

public class AdminService implements IAdminService{

	public void addLocker(Locker locker, ILockerServiec lockerService) {
		// TODO Auto-generated method stub
		
	}

	public void freeLocker(int lockerId, ILockerServiec lockerService) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public List<Locker> viewLockers(LockerStatus lockerStatus, ILockerServiec lockerService) {
		// TODO Auto-generated method stub
		return null;
	}

	/*public void addLocker(Locker locker, ILockerServiec lockerService) {
		
		lockerService.addLocker(locker);
		
	}
	public void freeLocker(int lockerId, ILockerServiec lockerService) throws Exception {
		
		
		lockerService.freeLocker(lockerId);
	}
	public List<Locker> viewAvailableLockers(LockerStatus lockerStatus,  ILockerServiec lockerService){
		
		return retList;
	}*/
	

}
