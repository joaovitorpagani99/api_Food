package com.api.food.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.api.food.domain.model.Restaurante;

public interface RestauranteRepository 
			extends CustomJpaRepository<Restaurante, Long>, 
					RestauranteRepositoryQueries,
					JpaSpecificationExecutor<Restaurante>{

	@Query("from Restaurante r join fetch r.cozinha")
	List<Restaurante> findAll();
	
//	List<Restaurante> queryByTaxaFreteBetween(BigDecimal taxaInicial, BigDecimal taxaFinal);
	
//	@Query("from Restaurante where nome like %:nome% and cozinha.id = :id")
//	List<Restaurante> consultarPorNome(String nome, @Param("id") Long cozinha);
	
//	List<Restaurante> findByNomeContainingAndCozinhaId(String nome, Long cozinha);
	
//	Optional<Restaurante> findFirstRestauranteByNomeContaining(String nome);
	
//	List<Restaurante> findTop2ByNomeContaining(String nome);
	
//	int countByCozinhaId(Long cozinha);
}
