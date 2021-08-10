package com.falabella.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.falabella.domain.Terminal;
@Mapper
public interface TerminalsRepository {

	@Select("select pt.id, pt.cod_store as codStore, pt.cod_ter as codTer, pt.is_active as active, pt.cod_status as codStatus "
			+ "from pos_documents_terminals pdt , pos_terminals pt "
			+ "where pt.id = pdt.terminals_id and pt.tenants_id = #{idTenant} and pt.is_active =1 and pdt.cod_doc= #{codDoc}")
	public List<Terminal> getTerminalsByTenantAndDocument(int idTenant, int codDoc);
	
	
	@Select("select cod_doc from pos_documents_terminals where terminals_id = #{idTerminal}")
	public List<Integer> getDocumentsByTerminal(int idTerminal);
	
}
