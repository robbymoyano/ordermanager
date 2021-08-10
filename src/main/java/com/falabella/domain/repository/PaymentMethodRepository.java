package com.falabella.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.falabella.domain.PaymentMethod;


@Mapper
public interface PaymentMethodRepository {
	@Select("select pm.cod_payment as codPayment, pm.des_method as description, pt.is_active as active from pos_payment_tenants pt, pos_payment_method pm "
			+ "where pt.tenants_id = #{id} and pt.cod_payment = pm.cod_payment")
	public List<PaymentMethod> getPaymentMethodByTenant(int id);
	
	
	@Select("select pm.cod_payment as codPayment, pm.des_method as description, pt.is_active as active from pos_payment_tenants pt, pos_payment_method pm "
			+ "where pt.tenants_id = #{id} and pt.cod_payment = pm.cod_payment and pm.is_active = 1")
	public List<PaymentMethod> getPaymentMethodByTenantActive(int id);
}
