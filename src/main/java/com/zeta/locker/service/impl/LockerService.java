package com.zeta.locker.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.zeta.locker.dto.Locker;
import com.zeta.locker.response.LockerDetails;
import com.zeta.locker.service.ILockerServiec;

public class LockerService implements ILockerServiec{

	private List<Locker> lockerList = new ArrayList<Locker>();
	private Map<Integer, LockerDetails> assignedLockerMap = new HashMap<Integer, LockerDetails>();
	
	public List<Locker> getLockerList() {
		return lockerList;
	}

	public void setLockerList(List<Locker> lockerList) {
		this.lockerList = lockerList;
	}
	
	
	public Map<Integer, LockerDetails> getAssignedLockerMap() {
		return assignedLockerMap;
	}

	public void setAssignedLockerMap(Map<Integer, LockerDetails> map) {
		this.assignedLockerMap = map;
	}

	private int generateOtp() {
		Random random = new Random();
		return random.nextInt(9999);
	}
	
	public void addLocker(Locker locker) {
		lockerList.add(locker);
	}
	
	public void freeLocker(int lockerId) throws Exception {
		if(assignedLockerMap.get(lockerId)==null) {
			throw new Exception("Loocker is not freed");
		}else {
			assignedLockerMap.remove(lockerId);
		}
	}
	
	public LockerDetails assignLocker() {
		
		Locker retLocker = null;
		for(Locker locker : lockerList) {
			if(assignedLockerMap.get(locker.getId())==null) {
				retLocker = locker;
				break;
			}
		}
		int otp = generateOtp();
		LockerDetails lockerDetailResponse = new LockerDetails();
		lockerDetailResponse.setLocker(retLocker);
		lockerDetailResponse.setOtp(otp);
		assignedLockerMap.put(retLocker.getId(), lockerDetailResponse);
		return lockerDetailResponse;
	}
	
	public void openLocker(int otp, int lockerId) throws Exception {
		LockerDetails lockerDetails = assignedLockerMap.get(lockerId);
		if(lockerDetails==null) {
			throw new Exception(" Locker is not allocated");
		}
		else {
			if(lockerDetails.getOtp()==otp) {
				System.out.println("opened successfully. Vacating it now");
				assignedLockerMap.remove(lockerId);
			}
			else {
				throw new Exception("Otp is incorrect");
			}
		}
	}
}
