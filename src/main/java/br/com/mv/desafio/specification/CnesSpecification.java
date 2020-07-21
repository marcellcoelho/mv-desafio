package br.com.mv.desafio.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import br.com.mv.desafio.entity.Cnes;

/**
 * The Class CnesSpecification.
 */
public class CnesSpecification implements Specification<Cnes> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -938014258312880579L;
	
	/** The filter. */
	private Cnes filter;

	/**
	 * Instantiates a new cnes specification.
	 *
	 * @param filter the filter
	 */
	public CnesSpecification(Cnes filter) {
		super();
		this.filter = filter;
	}

	/**
	 * To predicate.
	 *
	 * @param root the root
	 * @param criteriaQuery the criteria query
	 * @param criteriaBuilder the criteria builder
	 * @return the predicate
	 */
	public Predicate toPredicate(Root<Cnes> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
		List<Predicate> predicateList = new ArrayList<>();
		Predicate predicate = criteriaBuilder.conjunction();

		if (filter.getTipoUnidade() != null) {
			predicateList.add(criteriaBuilder.like(criteriaBuilder.upper(root.get("tipoUnidade")), "%" + filter.getTipoUnidade().toUpperCase() + "%"));
		}
		
		if (filter.getTipoGestao() != null) {
			predicateList.add(criteriaBuilder.like(criteriaBuilder.upper(root.get("tipoGestao")), "%" + filter.getTipoGestao().toUpperCase() + "%"));
		}
		
		if (filter.getUf() != null) {
			predicateList.add(criteriaBuilder.like(criteriaBuilder.upper(root.get("uf")), "%" + filter.getUf().toUpperCase() + "%"));
		}
		
		if (!predicateList.isEmpty()) {
			predicate.getExpressions().add(criteriaBuilder.and(predicateList.toArray(new Predicate[predicateList.size()])));
		}

		return predicate;
	}
}