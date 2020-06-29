package com.example.hiberusbilling.service;

import com.example.hiberusbilling.dto.BillDto;
import com.example.hiberusbilling.dto.OrderDto;

public interface BillingOrderService {

	public BillDto generateBill(OrderDto orderDto);

}
