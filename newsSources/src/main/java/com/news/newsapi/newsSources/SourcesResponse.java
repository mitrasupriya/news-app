package com.news.newsapi.newsSources;

import java.util.List;

public class SourcesResponse {
	
	private String status;
	
	private List<Sources> sources;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Sources> getSources() {
		return sources;
	}

	public void setSources(List<Sources> sources) {
		this.sources = sources;
	}
	
	

}
