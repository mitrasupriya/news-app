package com.news.newsapi.countryNewsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NewsApiOrgServiceImpl {

	@Autowired
	private RestTemplate restTemplate;

	public ResponseEntity<NewsAPIResponse> getCountryNewsDetails(String id) throws Exception {
		ResponseEntity<NewsAPIResponse> apiResponse = null;
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Api-Key", "655c0e841ae047b39e67371d48f157bc");
		HttpEntity entity = new HttpEntity(headers);
		try {
			apiResponse = restTemplate.exchange("https://newsapi.org/v2/top-headlines?country=" + id, HttpMethod.GET,
					entity, NewsAPIResponse.class);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return apiResponse;
	}
}
