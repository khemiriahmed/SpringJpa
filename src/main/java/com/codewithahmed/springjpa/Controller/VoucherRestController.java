package com.codewithahmed.springjpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codewithahmed.springjpa.model.Voucher;
import com.codewithahmed.springjpa.repo.VoucherRepo;

@RestController

public class VoucherRestController {
	@Autowired
	VoucherRepo repo;
	
	@PostMapping("/vouchers")
	public Voucher create(@RequestBody Voucher voucher) {
		return repo.save(voucher);
	}
	
	@GetMapping("/voucher/{code}")
	public Voucher getVoucher(@PathVariable("code")String code) {
		return repo.findByCode(code);
	}

}
