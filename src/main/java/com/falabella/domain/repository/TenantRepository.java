package com.falabella.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.falabella.domain.Tenant;
import com.falabella.domain.Terminal;


@Mapper
public interface TenantRepository {
	@Select("select id, cod_country as codCountry, cod_business as codCommerce, des_name as name, des_timezone as timeZone,hora_on as horaOn, hora_off as horaOff, "
			+ " is_active as active, dt_create  as created from pos_tenants")
	public List<Tenant> getAllTenants();
	
	@Select("select id, cod_country as codCountry, cod_business as codCommerce, des_name as name, des_timezone as timeZone,hora_on as horaOn, hora_off as horaOff ,is_active as active, dt_create  as created from pos_tenants where id=#{id}")
	public Tenant getTenantById(int id);
	
	@Select("select id, cod_country as codCountry, cod_business as codCommerce, des_name as name, des_timezone as timeZone,hora_on \r\n"
			+ "as horaOn, hora_off as horaOff ,is_active as active, dt_create  as created from pos_tenants pt \r\n"
			+ "where pt.cod_country = #{country} and pt.cod_business = #{commerce}")
	public Tenant getTenantByCountryCommerce(String country, String commerce);
	
	
	@Select("select id, cod_store as codStore, cod_ter as codTer, is_active as active , cod_status as codStatus from pos_terminals"
			+ " where tenants_id = #{tenant}")
	public List<Terminal> getTerminalsByTenant(int idTenant);
	

	
	/**
	 * Dato un tenant y un documento, retorna los terminales activos
	 */
}
