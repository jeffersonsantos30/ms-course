package com.jeffersonsantos.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.jeffersonsantos.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
