package com.news.newsapi.countryNewsService;

public class NewsAPIResponse {
	private String status;
	private Integer totalResults;
	private Articles[] articles = new Articles[38];
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}
	public Articles[] getArticles() {
		return articles;
	}
	public void setArticles(Articles[] articles) {
		this.articles = articles;
	}
	
}
