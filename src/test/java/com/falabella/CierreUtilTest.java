package com.falabella;


import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.falabella.usecase.util.CierreUtil;

public class CierreUtilTest {

	@Test
	public void testCierre() {
		Date ahora = Calendar.getInstance().getTime();
		boolean i=CierreUtil.evaluarProcesarOrden(ahora, "18:20","20:00", "America/Santiago");
		System.out.println(i);
	}
}
