package com.jts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jts.entity.CryptoData;
import com.jts.repository.CryptoDataRepository;

@Service
public class CryptoDataService {

    @Autowired
    private CryptoDataRepository repository;

    @Scheduled(cron = "0 0 19 * * *") // Runs every day at 7 PM
    public <S> void downloadCryptoData() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.wazirx.com/sapi/v1/tickers/24hr";

        ResponseEntity<CryptoData[]> response = restTemplate.getForEntity(url, CryptoData[].class);
        CryptoData[] cryptoDataArray = response.getBody();

        if (cryptoDataArray != null) {
            for (CryptoData data : cryptoDataArray) {
                repository.save((Iterable<S>) data);
            }
        }
    }
}
