package com.zeta.locker.test;

import com.zeta.locker.dto.Locker;
import com.zeta.locker.dto.enums.LockerStatus;
import com.zeta.locker.response.LockerDetails;
import com.zeta.locker.service.ILockerServiec;
import com.zeta.locker.service.impl.LockerService;
import org.junit.*;
public class LockerServceTest {

	public static Locker getLocker(int id,int zipcode ) {
		Locker locker = new Locker();
		locker.setId(id);
		locker.setLockerStatus(LockerStatus.FREE);
		locker.setZipCode(zipcode);
		return locker;
	}
	
	@Test
	public void testAddLocker() {
		try {
		ILockerServiec lockerService  = new LockerService();
		lockerService.addLocker(getLocker(1,31300));
		
		Assert.assertEquals(lockerService.getAssignedLockerMap().size(),0);
		lockerService.addLocker(getLocker(2,31300));
		
		LockerDetails locker = lockerService.assignLocker();
		
		Assert.assertEquals(lockerService.getAssignedLockerMap().size(),1);
		
		lockerService.freeLocker(locker.getLocker().getId());
		
		Assert.assertEquals(lockerService.getAssignedLockerMap().size(),0);
		
		LockerDetails locker1 = lockerService.assignLocker();
		lockerService.openLocker(locker1.getOtp(), locker1.getLocker().getId());
		
		Assert.assertEquals(lockerService.getAssignedLockerMap().size(),0);
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
