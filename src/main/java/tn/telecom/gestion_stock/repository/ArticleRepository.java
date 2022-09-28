package tn.telecom.gestion_stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.telecom.gestion_stock.model.Article;
@Repository

public interface ArticleRepository extends JpaRepository<Article, Long>{

}
