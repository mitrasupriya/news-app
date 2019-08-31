package com.news.newsapi.newsSources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SourcesController {
	

		@Autowired
		private NewsApiOrgServiceImpl newsApiOrgServiceImpl;
		
		@GetMapping(value = "/sources")
		public ResponseEntity<SourcesResponse>getSources(){
			ResponseEntity<SourcesResponse> sourcesResponse = null;
			try {
				sourcesResponse = newsApiOrgServiceImpl.getSourcesDetails();
			} catch (Exception e) {
			}
			return sourcesResponse;
			
		}
}

