package com.zeta.locker.service.impl;

import com.zeta.locker.response.LockerDetails;
import com.zeta.locker.service.ILockerServiec;
import com.zeta.locker.service.IUserService;

public class UserService implements IUserService{

	public LockerDetails allocateLocker(ILockerServiec lockerService) {
		return lockerService.assignLocker();
		
	}
	
	public void openLocker(ILockerServiec lockerService, int otp, int lockerId) throws Exception {
		lockerService.openLocker(otp, lockerId);
	}
	
	
}
