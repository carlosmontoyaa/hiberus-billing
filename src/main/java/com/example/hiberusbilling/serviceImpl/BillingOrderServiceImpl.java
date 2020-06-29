package com.example.hiberusbilling.serviceImpl;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.hiberusbilling.dto.BillDto;
import com.example.hiberusbilling.dto.OrderDto;
import com.example.hiberusbilling.dto.ProductDto;
import com.example.hiberusbilling.service.BillingOrderService;

@Service
public class BillingOrderServiceImpl implements BillingOrderService {

	/*
	 * This service returns the bill of the order
	 * i assumm the cost is by unit of the product, so multiply the cost x quantity
	 * 
	 * The total quantity is the sum of each quantity of the product
	 * 
	 */
	@Override
	public BillDto generateBill(OrderDto orderDto) {

		List<ProductDto> productDtoList = orderDto.getProductDtoList();

		return new BillDto(new Random().nextInt(10000), productDtoList.stream().mapToInt(x -> (x.getQuantity())).sum(),
				productDtoList.stream().mapToInt(x -> (x.getCost() * x.getQuantity())).sum());
	}

}
