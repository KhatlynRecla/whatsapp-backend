package com.whatsapp.repository;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.whatsapp.models.Idiomas;

import java.util.List;

@Repository
public interface idiomasRepository extends PagingAndSortingRepository<Idiomas, Integer> {
	
	  @Query("select u FROM Idiomas u WHERE u.STATUS = 1 ")
	  List<Idiomas> retornar_todos( Pageable paginacao);    
	  
	  
}
