package com.improving.bootcamp.client;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookClient {

    private final RestTemplate restTemplate;

    public BookClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Volumes volumeSearch(String query) {
        return restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes?q={}",
                Volumes.class, query);
    }
}
