package com.example.library.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface BookRepository extends JpaRepository<Book, String> {
//	@Query(value = "Select * from Book b where b.name like ?1 or b.author like ?1", countQuery = "Select count(b.ids) from Book b where b.name like ?1 or b.author like ?1")
//	Page<Book> findBook(String key, Pageable pageable);
	Page<Book> findByBookNameContainingOrAuthorContaining(String name,String author, Pageable pageable);
	
}
