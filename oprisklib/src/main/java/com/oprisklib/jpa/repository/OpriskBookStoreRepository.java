package com.oprisklib.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oprisklib.jpa.model.OpriskBookStoreDTO;

public interface OpriskBookStoreRepository extends JpaRepository<OpriskBookStoreDTO, Integer> {
	
	@Query("select u from OpriskBookStoreDTO u where u.isbnNumber = :isbnNumber") 
	List<OpriskBookStoreDTO> findByISBN(@Param("isbnNumber") String isbnNumber); 
	
}
