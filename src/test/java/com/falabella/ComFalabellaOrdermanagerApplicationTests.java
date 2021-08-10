package com.falabella;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.falabella.domain.PaymentMethod;
import com.falabella.domain.Tenant;
import com.falabella.domain.Terminal;
import com.falabella.domain.repository.PaymentMethodRepository;
import com.falabella.domain.repository.TenantRepository;

@SpringBootTest
class ComFalabellaOrdermanagerApplicationTests {

	@Autowired
	TenantRepository repo;
	
	@Autowired
	PaymentMethodRepository mdpRepo;

	@Test
	void contextLoads() {
		List<Tenant> lista = repo.getAllTenants();
		for (Tenant t : lista) {
			System.out.println(t.toString());
		}
	}

	@Test
	void getTenats() {
		Tenant t = repo.getTenantById(1);
		System.out.println(t.toString());
	}
	
	@Test
	void getTerminalByTenant() {
		List<Terminal> lista = repo.getTerminalsByTenant(1);
		for (Terminal t : lista) {
			System.out.println(t.toString());
		}
	}
	
	@Test
	void getPaymentMethodByTenant() {
		List<PaymentMethod> lista = mdpRepo.getPaymentMethodByTenant(1);
		for (PaymentMethod t : lista) {
			System.out.println(t.toString());
		}
	}
}
