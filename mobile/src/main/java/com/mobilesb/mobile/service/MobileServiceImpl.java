package com.mobilesb.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobilesb.mobile.model.Mobile;
import com.mobilesb.mobile.repository.MobileRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MobileServiceImpl implements MobileService {
	@Autowired
	private MobileRepository mobileRepository;

	@Override
	public List<Mobile> getMobile() {
		return mobileRepository.findAll();
	}

	@Override
	public Mobile createMobile(Mobile mobile) {
		return mobileRepository.save(mobile);
	}

	@Override
	public String deleteMobile(long id) {
		mobileRepository.deleteById(id);
		return "Delete Successful for id: " + id;
	}

	@Override
	public Mobile updateMobile(Mobile mobile) {
		return mobileRepository.save(mobile);
	}

	@Override
	public Mobile getMobilebyId(long id) {
		
		return mobileRepository.findById(id).get() ;
	}

	
}
