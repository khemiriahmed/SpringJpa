package com.codewithahmed.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithahmed.springjpa.model.Voucher;

public interface VoucherRepo extends JpaRepository<Voucher, Long> {

}
