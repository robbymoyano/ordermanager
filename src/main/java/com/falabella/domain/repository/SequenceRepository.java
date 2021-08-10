package com.falabella.domain.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.falabella.domain.sequence.Sequence;

@Mapper
public interface SequenceRepository {
	/**
	 * Método para resetear una secuencia
	 * @param local Local
	 * @param terminal Terminal
	 */
	@Update("update pos_sequence set cur_value = 1 where terminals_id = #{terminalId}")
	public void resetSeq(int terminalId);

	@Select(" LOCK TABLE pos_sequence READ; "
			+ " LOCK TABLE pos_sequence WRITE; "
			+ " SELECT terminals_Id as terminalId, num_inc as numInc, num_min as numMin, num_max as numMax, cur_value as curValue "
			+ " FROM pos_sequence where terminals_id = #{terminalId};"
			+ " update pos_sequence set cur_value = cur_value + 1 where terminals_id = #{terminalId}; "
			+ " UNLOCK TABLE")
	public Sequence getSequenceTerminal(int terminalId);
}
