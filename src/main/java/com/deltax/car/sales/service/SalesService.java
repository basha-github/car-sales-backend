package com.deltax.car.sales.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deltax.car.sales.model.SalesDashBoardIndex;
import com.deltax.car.sales.model.SalesForm;
import com.deltax.car.sales.repo.SalesRepo;

@Service
public class SalesService {
	
	
	@Autowired
	SalesRepo salesRepo;

	public SalesForm saveNewSalesForm(SalesForm salesForm) {
		
		
		return salesRepo.save(salesForm);
		
		
	}

	public List<SalesForm> getAllSalesForms() {
		// TODO Auto-generated method stub
		return salesRepo.findAll();
	}

	public SalesForm getSalesFormById(int id) {
		// TODO Auto-generated method stub
		return salesRepo.findById(id).orElse(new SalesForm());
	}

	public void deleteForm(int id) {
		// TODO Auto-generated method stub
		salesRepo.deleteById(id);
	}

	public List<SalesForm> saveAllNewSalesForm(List<SalesForm> salesFormList) {
		return salesRepo.saveAllAndFlush(salesFormList);
	}

	public SalesDashBoardIndex getSalesDashBoard() {
		
		int total =0;
		int newTot = 0;
		int notTotal = 0;
		int intTot = 0;
		
		SalesDashBoardIndex salesDashBoardIndex = new SalesDashBoardIndex();
		
		List<SalesForm> allSalesFrom = salesRepo.findAll();
		total = allSalesFrom.size();
		
		for(int i=0;i<total;i++) {
			
			SalesForm salesForm = allSalesFrom.get(i);
			if(salesForm != null) {
				if(salesForm.getStatus().contentEquals("New")){
					newTot++;
				}
				else if(salesForm.getStatus().contentEquals("Interested")){
					intTot++;
				}
				else if(salesForm.getStatus().contentEquals("Not Interested")){
					notTotal++;
				}
			}
		}
		
		salesDashBoardIndex.setTotalSales(total);
		salesDashBoardIndex.setInterestedSales(intTot);
		salesDashBoardIndex.setNotSales(notTotal);
		salesDashBoardIndex.setNewSales(newTot);
	
		return salesDashBoardIndex;
	}

	public List<SalesForm> getAllNewSalesForms() {
		
		List<SalesForm> resSalesFrom = new ArrayList<SalesForm>();
		List<SalesForm> allSalesFrom = salesRepo.findAll();
		int total = allSalesFrom.size();
		
		for(int i=0;i<total;i++) {
			
			SalesForm salesForm = allSalesFrom.get(i);
			if(salesForm != null) {
				if(salesForm.getStatus().contentEquals("New")){
					resSalesFrom.add(salesForm);
				}
				
			}
		}
		
		
		return resSalesFrom;
		
	}

	public List<SalesForm> getAllInterestedSalesForms() {
		List<SalesForm> resSalesFrom = new ArrayList<SalesForm>();
		List<SalesForm> allSalesFrom = salesRepo.findAll();
		int total = allSalesFrom.size();
		
		for(int i=0;i<total;i++) {
			
			SalesForm salesForm = allSalesFrom.get(i);
			if(salesForm != null) {
				if(salesForm.getStatus().contentEquals("Interested")){
					resSalesFrom.add(salesForm);
				}
				
			}
		}
		
		
		return resSalesFrom;
		
	}

	public List<SalesForm> getAllNotInterestedSalesForms() {
		List<SalesForm> resSalesFrom = new ArrayList<SalesForm>();
		List<SalesForm> allSalesFrom = salesRepo.findAll();
		int total = allSalesFrom.size();
		
		for(int i=0;i<total;i++) {
			
			SalesForm salesForm = allSalesFrom.get(i);
			if(salesForm != null) {
				if(salesForm.getStatus().contentEquals("Not Interested")){
					resSalesFrom.add(salesForm);
				}
				
			}
		}
		
		
		return resSalesFrom;
	}

}
