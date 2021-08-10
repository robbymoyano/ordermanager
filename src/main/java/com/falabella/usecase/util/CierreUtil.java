package com.falabella.usecase.util;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CierreUtil {

	public static final boolean PROCESAR = true;
	public static final boolean RETARDAR = false;
	
	private static final Logger log = LoggerFactory.getLogger(CierreUtil.class);

	private CierreUtil() {
		throw new IllegalStateException("Utility class");
	}
	
	/**
	 * Método que evalua la hora y decide si procesar la info o enviarla a la cola
	 * 
	 * @param date   Fecha actual
	 * @param inicio Hora de inicio en formato HH:mm
	 * @param fin    Hora de fin en formato HH:mm
	 * @return true si se procesa normal, false si se debe retardar
	 */
	public static boolean evaluarProcesarOrden(Date date, String inicio, String fin, String timeZone) {

		String format = "yyyy-MM-dd HH:mm:ss a";

		// transformo la hora actual a hora Bogotá en String
		String horaBogota = Conversiones.getFechabyTimeZone(date, format, timeZone);
		System.out.println("Hora en el pais: "+horaBogota);
		String hora = horaBogota.substring(11, 16);
		hora = hora.replace(":", "");
		int actual = Integer.parseInt(hora);
		int horaApertura = Integer.parseInt(inicio.replace(":", ""));
		int horaCierre = Integer.parseInt(fin.replace(":", ""));
		if (actual >= horaApertura && actual < horaCierre) {
			return PROCESAR;
		} else {
			return RETARDAR;
		}
	}

	/**
	 * Dado un string en formato HH:mm retorna el instant utc
	 * 
	 * @param horaMinuto String con la hora que el terminal vuelve a estár
	 *                   operativo, formato HH:mm
	 * @return Instant en formato utc
	 */
	public static Instant calculaFechaInstant(String horaMinuto, String timeZone) {

		// Obtengo la hora de colombia y la transformo para manipularla
		String dateColombia = Conversiones.getFechabyTimeZone(Calendar.getInstance().getTime(), "yyyy-MM-dd HH:mm:ss",
				timeZone);
		Calendar date = Conversiones.stringToDateFormat(dateColombia, "yyyy-MM-dd HH:mm:ss");
		log.info("hora en bogota: {}", date.getTime());
		// Seteo la hora y minuto de apertura
		int hora = Integer.parseInt(horaMinuto.substring(0, 2));
		int minutos = Integer.parseInt(horaMinuto.substring(3, 5));
		date.set(Calendar.HOUR_OF_DAY, hora);
		date.set(Calendar.MINUTE, minutos);
		date.set(Calendar.SECOND, 0);
		TimeZone bogota = TimeZone.getTimeZone(timeZone);
		date.setTimeZone(bogota);

		// transformo el date a Instant
		Instant t1 = date.toInstant();

		
		
		// Compruebo si t1 es menor que tActual, si es asi, le sumo 1 dia
		Instant tActual = Instant.now();
		log.info("{}", t1);
		log.info("{}", tActual);

		if (t1.compareTo(tActual) < 0) {
			log.info("es mayor");
			Instant t2 = t1.plus(1, ChronoUnit.DAYS);
			log.info("t2 {}", t2);
			return t2;
		} else {
			log.info("es menor");
			return t1;
		}

	}
}
