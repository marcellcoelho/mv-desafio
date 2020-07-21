package br.com.mv.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import br.com.mv.desafio.entity.Cnes;

/**
 * The Interface CnesRepository.
 */
@Repository
public interface CnesRepository extends JpaRepository<Cnes, Long>, JpaSpecificationExecutor<Cnes> {

}
