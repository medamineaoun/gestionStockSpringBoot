package tn.telecom.gestion_stock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.telecom.gestion_stock.model.Article;
import tn.telecom.gestion_stock.repository.ArticleRepository;

@Service
public class ArticleServiceinpl implements ArticleService{
	@Autowired
	private ArticleRepository articleRepository;

	@Override
	public void deletearticle(Long id) {
		// TODO Auto-generated method stub
		articleRepository.deleteById(id);
	}

	@Override
	public Article saveArticle(Article articles) {
		// TODO Auto-generated method stub
		Article article=articleRepository.save(articles);
		return article;
	}

	@Override
	public List<Article> listearticle() {
		// TODO Auto-generated method stub
		return articleRepository.findAll();
	}

	@Override
	public Article updateArticle(Long id, Article article) {
		// TODO Auto-generated method stub
		Optional<Article> optionalarticle=articleRepository.findById(id);
		if (optionalarticle.isPresent()) {
			Article articles=optionalarticle.get();
			articles.setDesignation(article.getDesignation());
			articles.setNumArticle(article.getNumArticle());
			
			articles.setUnite(article.getUnite());
			articles.setPrixUnitaire(article.getPrixUnitaire());
				return articleRepository.save(articles);
		}
		else {
			return null;
		}
	}

	@Override
	public Article findByIdArticle(Long id) {
		// TODO Auto-generated method stub
		Article article=articleRepository.findById(id).get();
		return article;
	}

}
