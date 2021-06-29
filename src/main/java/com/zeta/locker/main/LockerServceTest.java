package com.zeta.locker.main;

import com.zeta.locker.dto.Locker;
import com.zeta.locker.dto.enums.LockerStatus;
import com.zeta.locker.service.ILockerServiec;
import com.zeta.locker.service.impl.LockerService;

public class LockerServceTest {

	public static Locker getLocker(int id,int zipcode ) {
		Locker locker = new Locker();
		locker.setId(id);
		locker.setLockerStatus(LockerStatus.FREE);
		locker.setZipCode(zipcode);
		return locker;
	}
	
	
	public void testAddLocker() {
		ILockerServiec lockerService  = new LockerService();
		
	}
}
