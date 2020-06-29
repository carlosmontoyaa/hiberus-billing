package com.example.hiberusbilling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hiberusbilling.dto.BillDto;
import com.example.hiberusbilling.dto.OrderDto;
import com.example.hiberusbilling.service.BillingOrderService;

@RestController
public class BillingOrderController {

	HttpHeaders headers;

	public BillingOrderController() {
		headers = new HttpHeaders();
		headers.add("Content-Type", "application/json; charset=utf-8");
	}

	@Autowired
	private BillingOrderService billingOrderService;

	/**
	 * 
	 * @param OrderDto
	 */
	@PostMapping(path = "/")
	public @ResponseBody ResponseEntity<BillDto> checkOutOrder(@RequestBody OrderDto orderDto) {
		return new ResponseEntity<>(billingOrderService.generateBill(orderDto), HttpStatus.OK);
	}
}
