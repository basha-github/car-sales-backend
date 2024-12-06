package com.deltax.car.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deltax.car.sales.model.SalesDashBoardIndex;
import com.deltax.car.sales.model.SalesForm;
import com.deltax.car.sales.service.SalesService;

@RestController
@CrossOrigin("*")
public class SalesController {
	
	
	@Autowired
	SalesService salesService;
	
	
	
	@GetMapping("/deltax/sales/getDashBoard")
	public SalesDashBoardIndex getSalesForm() {
		
		
		return salesService.getSalesDashBoard();
	}
	
	
	
	
	
	@PostMapping("/deltax/sales/add")
	public SalesForm addNewSalesForm(@RequestBody SalesForm salesForm) {
		
		salesForm.setStatus("New");
		
		System.out.println("from client salesform..."+salesForm);
		
		
		return salesService.saveNewSalesForm(salesForm);
	}
	
	
	
	@PostMapping("/deltax/sales/add/all")
	public List<SalesForm> addNewSalesForm(@RequestBody List<SalesForm> salesFormList) {
		
		
		
		return salesService.saveAllNewSalesForm(salesFormList);
	}
	
	
	@GetMapping("/deltax/sales/all")
	public List<SalesForm> getAllSalesForms() {
		
		
		
		return salesService.getAllSalesForms();
	}
	
	@GetMapping("/deltax/sales/allNew")
	public List<SalesForm> getAllNewSalesForms() {
		
		
		
		return salesService.getAllNewSalesForms();
	}
	@GetMapping("/deltax/sales/allInterested")
	public List<SalesForm> getAllInterestedSalesForms() {
		
		
		
		return salesService.getAllInterestedSalesForms();
	}
	@GetMapping("/deltax/sales/allNotInterested")
	public List<SalesForm> getAllNotInterestedSalesForms() {
		
		
		
		return salesService.getAllNotInterestedSalesForms();
	}
	
	@GetMapping("/deltax/sales/get")
	public SalesForm getSalesForm(@RequestParam int id) {
		
		
		return salesService.getSalesFormById(id);
	}
	
	
	@PutMapping("/deltax/sales/update")
	public SalesForm updateSalesForm(@RequestBody SalesForm salesForm) {
		
		
		System.out.println("from client for update salesform..."+salesForm);
		
		
		return salesService.saveNewSalesForm(salesForm);
	}
	
	@DeleteMapping("/deltax/sales/delete")
	public void updateSalesForm(@RequestParam int id) {
		
		
		System.out.println("from client for delete id..."+id);
		
		
		 salesService.deleteForm(id);
	}
	

}
