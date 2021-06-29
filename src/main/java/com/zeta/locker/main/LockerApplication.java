package com.zeta.locker.main;

import com.zeta.locker.dto.Locker;
import com.zeta.locker.dto.enums.LockerStatus;
import com.zeta.locker.response.LockerDetails;
import com.zeta.locker.service.ILockerServiec;
import com.zeta.locker.service.impl.LockerService;

public class LockerApplication {

	public static void main(String args[]) {
		ILockerServiec lockerService = new LockerService();
		
		lockerService.addLocker(getLocker(1,31300));
		lockerService.addLocker(getLocker(2,31300));
		lockerService.addLocker(getLocker(3,31300));
		lockerService.addLocker(getLocker(4,31300));
		
		LockerDetails lockerDetails1 = lockerService.assignLocker();
		LockerDetails lockerDetails2 = lockerService.assignLocker();
		
		try {
			lockerService.openLocker(lockerDetails1.getOtp(), lockerDetails1.getLocker().getId());
			
			lockerService.openLocker(1234, lockerDetails2.getLocker().getId());
			
			lockerService.freeLocker(lockerDetails2.getLocker().getId());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Locker getLocker(int id,int zipcode ) {
		Locker locker = new Locker();
		locker.setId(id);
		locker.setLockerStatus(LockerStatus.FREE);
		locker.setZipCode(zipcode);
		return locker;
	}
}
