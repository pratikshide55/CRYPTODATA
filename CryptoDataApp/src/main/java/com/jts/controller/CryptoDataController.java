package com.jts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.jts.model.CryptoData;
import com.jts.repository.CryptoDataRepository;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/cryptodata")
public class CryptoDataController {

    @Autowired
    private CryptoDataRepository repository;

   
    @PostMapping(value = "/search", consumes = "application/json", produces = "application/json")
	public ResponseEntity<List> searchBySymbol(@RequestBody Map<String, String> request) {
	    String symbol = request.get("symbol");
	    Object repository = null;
		List result = ((CryptoDataRepository) repository).findBySymbol(symbol);

	    return ResponseEntity.ok(result);
	}
}
