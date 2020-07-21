package br.com.mv.desafio.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.mv.desafio.dto.CnesDTO;
import br.com.mv.desafio.entity.Cnes;
import br.com.mv.desafio.service.CnesService;
import br.com.mv.desafio.specification.CnesSpecification;

/**
 * The Class CnesController.
 */
@RestController
@RequestMapping(path = "/cnes")
public class CnesController {

	/** The cnes service. */
	@Autowired
	private CnesService cnesService;
	
	/** The model mapper. */
	@Autowired
	private ModelMapper modelMapper;

	/**
	 * Find all.
	 *
	 * @param tipoUnidade the tipo unidade
	 * @param tipoGestao the tipo gestao
	 * @param uf the uf
	 * @param pagina the pagina
	 * @param tamanho the tamanho
	 * @param propriedadeParaOrdenar the propriedade para ordenar
	 * @param direcao the direcao
	 * @return the list
	 */
	@GetMapping
	public List<CnesDTO> findAll(
			@RequestParam(value = "tipoUnidade", required = false) String tipoUnidade,
			@RequestParam(value = "tipoGestao", required = false) String tipoGestao,
			@RequestParam(value = "uf", required = false) String uf,
			@RequestParam(value = "pagina", required = false, defaultValue = "0") Integer pagina,
			@RequestParam(value = "tamanho", required = false, defaultValue = "10") Integer tamanho,
			@RequestParam(value = "propriedadeParaOrdenar", required = false, defaultValue = "nomeFantasia") String propriedadeParaOrdenar,
			@RequestParam(value = "direcao", required = false, defaultValue = "ASC") Sort.Direction direcao) {
		return cnesService.findAll(new CnesSpecification(new Cnes(tipoUnidade, tipoGestao, uf)), PageRequest.of(pagina, tamanho, direcao, propriedadeParaOrdenar)).stream().map(this::convertToDto).collect(Collectors.toList());
	}
	
	/**
	 * Convert to dto.
	 *
	 * @param cnes the cnes
	 * @return the cnes DTO
	 */
	private CnesDTO convertToDto(Cnes cnes) {
		return modelMapper.map(cnes, CnesDTO.class);
	}

	/**
	 * Convert to entity.
	 *
	 * @param cnesDTO the cnes DTO
	 * @return the cnes
	 */
	private Cnes convertToEntity(CnesDTO cnesDTO) {
		return modelMapper.map(cnesDTO, Cnes.class);
	}
	
}
