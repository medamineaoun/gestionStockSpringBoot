package tn.telecom.gestion_stock.service;

import java.util.List;

import tn.telecom.gestion_stock.model.Article;

public interface ArticleService {
	void deletearticle(Long id);
	  Article saveArticle(Article article);
	  List<Article> listearticle(); 
	  Article updateArticle(Long id,Article article); 
	  Article  findByIdArticle(Long id);
}