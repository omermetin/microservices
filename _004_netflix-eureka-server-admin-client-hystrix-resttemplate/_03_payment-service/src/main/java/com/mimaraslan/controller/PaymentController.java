package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	// http://localhost:8083/payment/pay
	@GetMapping("/pay")
	public String paymentProcess() {
		return "Payment service called....";
	}
}