package br.com.mv.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import br.com.mv.desafio.entity.Cnes;
import br.com.mv.desafio.repository.CnesRepository;

/**
 * The Class CnesService.
 */
@Service
public class CnesService {
	
	/** The cnes repository. */
	@Autowired
	private CnesRepository cnesRepository;
		
	/**
	 * Find all.
	 *
	 * @param specification the specification
	 * @param pageable the pageable
	 * @return the list
	 */
	public List<Cnes> findAll(Specification<Cnes> specification, Pageable pageable) {
		return cnesRepository.findAll(specification, pageable).getContent();
	}
	
}
