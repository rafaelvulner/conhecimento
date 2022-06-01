package com.teste.balada;

import com.teste.balada.repository.BaladaRepository;
import com.teste.balada.service.BaladaService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BaladaApplicationTests {

	@InjectMocks
	public BaladaService service;

	@Mock
	public BaladaRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	void test(){
		this.service.getConhecimento();
	}

}
