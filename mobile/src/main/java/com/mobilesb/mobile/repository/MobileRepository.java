package com.mobilesb.mobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilesb.mobile.model.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile,Long>{
	

}
