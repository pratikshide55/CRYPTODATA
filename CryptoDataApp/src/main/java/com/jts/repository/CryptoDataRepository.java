package com.jts.repository;

import java.util.List; // Correct import statement
import org.springframework.data.jpa.repository.JpaRepository;
import com.jts.model.CryptoData;

public interface CryptoDataRepository<S> extends JpaRepository<CryptoData, Long> {
    List<CryptoData> findBySymbol(String symbol);

	void save(Iterable<S> data);
}
