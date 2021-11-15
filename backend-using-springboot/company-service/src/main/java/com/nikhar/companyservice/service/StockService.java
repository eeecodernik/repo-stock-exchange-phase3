package com.nikhar.companyservice.service;

import java.util.List;

import com.nikhar.companyservice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikhar.companyservice.entity.Stock;

@Service
public class StockService {

	@Autowired
	private StockRepository stockRepository;
	
	public List<Stock> getAllStocks() {
		return stockRepository.findAll();
	}
	
	public Stock addStock(Stock stock) {
		return stockRepository.save(stock);
	}

}
