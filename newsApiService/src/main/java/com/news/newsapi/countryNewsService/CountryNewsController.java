package com.news.newsapi.countryNewsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryNewsController {
	@Autowired
	private NewsApiOrgServiceImpl newsApiOrgServiceImpl;
	
	@GetMapping(value = "/country/{id}")
	public ResponseEntity<NewsAPIResponse>getCountryNews(@PathVariable("id") String id){
		ResponseEntity<NewsAPIResponse> newsAPIResponse = null;
		try {
			newsAPIResponse = newsApiOrgServiceImpl.getCountryNewsDetails(id);
		} catch (Exception e) {
		}
		return newsAPIResponse;
		
	}

}
