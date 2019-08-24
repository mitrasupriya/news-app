package com.news.newsapi.newsApiService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NewsApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsApiServiceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	
	@Bean
	public ResponseEntity<NewsAPIResponse> run(RestTemplate restTemplate) throws Exception{
		ResponseEntity<NewsAPIResponse> apiResponse = null;
			NewsAPIResponse apiResponse2 = new NewsAPIResponse();
			HttpHeaders headers = new HttpHeaders();
		    headers.set("X-Api-Key", "655c0e841ae047b39e67371d48f157bc");
		    HttpEntity entity = new HttpEntity(headers);
		    try {
			
		    	apiResponse = restTemplate.exchange("https://newsapi.org/v2/top-headlines?country=us", HttpMethod.GET, entity, NewsAPIResponse.class); 
					
		    	Articles [] articles  = new Articles [38];
		    	apiResponse2 = apiResponse.getBody();
		    	articles = apiResponse2.getArticles();
		    	 for (Articles articles2 : articles) {
					System.out.println(articles2.getSource().getId());
					System.out.println(articles2.getSource().getName());
					System.out.println(articles2.getAuthor());
					System.out.println(articles2.getTitle());
					System.out.println(articles2.getDescription());
					System.out.println(articles2.getUrl());
					if(null != articles2.getUrlToImage())
					System.out.println(articles2.getUrlToImage());
					System.out.println(articles2.getPublishedAt());
					if(null != articles2.getContent())
					System.out.println(articles2.getContent());
				}
			} catch (Exception e) {
				e.printStackTrace();
	
			}
		    return apiResponse;
	}
}
