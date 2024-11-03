package com.mobilesb.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobilesb.mobile.model.Mobile;
import com.mobilesb.mobile.service.MobileService;


@RestController

@RequestMapping("/mobile")
public class MobileController {
	@Autowired
	private MobileService mobileService;

	@GetMapping("/getMobile")
	public ResponseEntity<List<Mobile>> getMobile() {
		return ResponseEntity.ok().body(mobileService.getMobile());
	}

	@DeleteMapping("/deleteMobilebyId/{id}")
	public ResponseEntity<String> deleteMobileById(@PathVariable long id) {
		return ResponseEntity.ok().body(mobileService.deleteMobile(id));

	}

	@PostMapping("/createMobile")
	public ResponseEntity<Mobile> createMobile(@RequestBody Mobile mobile) {
		return ResponseEntity.ok().body(mobileService.createMobile(mobile));
	}
	@PutMapping("/updateMobile")
	public ResponseEntity<Mobile> updateMobile(@RequestBody Mobile mobile){
		return ResponseEntity.ok().body(mobileService.createMobile(mobile));
	}
	@GetMapping("/getMobilebyId/{id}")
	public ResponseEntity<Mobile> getMobileById(@PathVariable long id){
		return ResponseEntity.ok().body(mobileService.getMobilebyId(id));
	}
	
}
