package tn.telecom.gestion_stock.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.telecom.gestion_stock.model.Article;
import tn.telecom.gestion_stock.service.ArticleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/Article")
public class ArticleController {
	private ArticleService articleservice;

	public ArticleController(ArticleService articleservice) {
		super();
		this.articleservice = articleservice;
	}
	@PostMapping("/save")
	public Article ajouterArticle(@RequestBody Article article) {
	return articleservice.saveArticle(article);
	}
	
	@GetMapping("/")
	public List<Article> listeArticle(){
		return articleservice.listearticle();
	}
	@DeleteMapping("/delete/{id}")
	public void deleteArticle(@PathVariable Long id) {
		articleservice.deletearticle(id);
	}
	@GetMapping("/chercher/{id}")
	public Article findArticle(@PathVariable Long id) {
		Article article=articleservice.findByIdArticle(id);
		return article;
	}
	
	@PutMapping("/update/{id}")
	public Article updateArticle(@PathVariable Long id, @RequestBody Article article) {
		return articleservice.updateArticle(id, article);
	}
	
}
