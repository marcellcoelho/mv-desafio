package br.com.mv.desafio.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import br.com.mv.desafio.entity.Cnes;
import br.com.mv.desafio.repository.CnesRepository;
import br.com.mv.desafio.specification.CnesSpecification;

@RunWith(MockitoJUnitRunner.class)
public class CnesServiceTest {
	
	@Mock
	private CnesRepository cnesRepositoryMock;
	
	@InjectMocks
	private CnesService cnesService;
	
	@Test
	public void findAll() {
		List<Cnes> content = new ArrayList<>();
		content.add(new Cnes("CENTRAL DE GESTAO EM SAUDE", "M", "PB"));
		Page<Cnes> pageCnes = new PageImpl<Cnes>(content);
		
		Mockito.when(cnesRepositoryMock.findAll(Mockito.any(CnesSpecification.class), Mockito.any(PageRequest.class))).thenReturn(pageCnes);
		
		assertEquals(pageCnes.getContent(), cnesService.findAll(new CnesSpecification(new Cnes("CENTRAL", "M", "PB")), PageRequest.of(0, 10, Sort.Direction.ASC, "nomeFantasia")));
	}

}
