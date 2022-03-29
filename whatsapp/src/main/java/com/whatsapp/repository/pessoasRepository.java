package com.whatsapp.repository;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.whatsapp.models.Pessoas;

import java.util.List;

@Repository
public interface pessoasRepository extends PagingAndSortingRepository<Pessoas, Integer> {
	
	  @Query("select u FROM Pessoas u WHERE u.STATUS = 1 ")
	  List<Pessoas> retornar_todos( Pageable paginacao);    
	  
	  @Query("select u FROM Pessoas u WHERE u.IDPESSOA = ?1 ")
	  List<Pessoas> retornar_por_id( @Param("IDPESSOA") int IDPESSOA);    

	  @Query("select u FROM Pessoas u WHERE u.EMAIL = ?1 AND u.SENHA = ?2 ")
	  List<Pessoas> retornar_por_email( @Param("EMAIL") String EMAIL,@Param("SENHA") String SENHA);    
	  
}