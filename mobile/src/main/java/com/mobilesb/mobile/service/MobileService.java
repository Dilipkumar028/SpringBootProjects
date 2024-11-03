package com.mobilesb.mobile.service;

import java.util.List;

import com.mobilesb.mobile.model.Mobile;

public interface MobileService {
   List<Mobile> getMobile();  
   
String deleteMobile(long id);

Mobile createMobile(Mobile mobile);
 
Mobile updateMobile(Mobile mobile);

Mobile getMobilebyId(long id);
 
}
