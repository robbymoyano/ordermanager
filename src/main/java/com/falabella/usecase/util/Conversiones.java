package com.falabella.usecase.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Conversiones {

	private static final Logger LOG = LoggerFactory.getLogger(Conversiones.class);

	private Conversiones() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * Metodo que convierte un objeto a String con notación Json
	 * 
	 * @param object Objeto que se desea serializar
	 * @return Cadena Json
	 */
	public static String serializarObjeto(Object objeto) {
		ObjectMapper mapper = new ObjectMapper();

		String json = "";
		try {
			json = mapper.writeValueAsString(objeto);
			return json;
		} catch (JsonProcessingException e) {
			LOG.error("Error al serializar: {} ", e.getMessage());
			return "";
		}
	}

	/**
	 * Permite convertir un Date a String de acuerdo al formato indicado
	 * 
	 * @param fecha  Date que se desea convetir
	 * @param format String con formato, ejemplo yyyyMMdd
	 * @return fecha formateada a String
	 */
	public static String dateToString(Date fecha, String format) {
		DateFormat df = new SimpleDateFormat(format);
		return df.format(fecha);
	}

	/**
	 * Permite validar si un String representa una fecha
	 * 
	 * @param fecha  String que se desea validar
	 * @param format String con formato, ejemplo yyyyMMdd
	 * @throws ParseException
	 */
	public static void validaFecha(String fecha, String format) throws ParseException {
		DateFormat df = new SimpleDateFormat(format);
		df.parse(fecha);
	}

	/**
	 * 
	 * @param rut Dni del Cliente
	 * @return Rut sin guion, si el digito verificador es K, se reemplaza por 11
	 */
	public static String convierteRut(String rut) {
		if (rut.contains("-k") || rut.contains("-K")) {
			if (rut.contains("K"))
				rut = rut.replace("-K", "11");
			if (rut.contains("k"))
				rut = rut.replace("-k", "11");
		}
		if (rut.contains("-"))
			rut = rut.replace("-", "");
		return rut;

	}

	/* funcion de formato de fecha */
	public static Calendar stringToDate(String strDate) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(strDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}

	/**
	 * 
	 * @param date     Fecha
	 * @param formato  Formato de salida, por ejemplo yyyy-MM-dd HH:mm:ss:SSS
	 * @param timeZone Zona horaria: America/Bogota, America/Santiago
	 * @return Fecha representada por un String
	 */
	public static String getFechabyTimeZone(Date date, String formato, String timeZone) {

		try {
			final SimpleDateFormat sdf = new SimpleDateFormat(formato);
			final TimeZone zona = TimeZone.getTimeZone(timeZone);
			sdf.setTimeZone(zona);
			return sdf.format(date);
		} catch (Exception e) {
			LOG.error("Erro al transformar la fecha {}", e.getMessage());
			return "";
		}
	}

	/* funcion de formato de fecha */
	public static Calendar stringToDateFormat(String strDate, String format) {

		SimpleDateFormat sdf = new SimpleDateFormat(format);

		
		Date date;
		try {
			date = sdf.parse(strDate);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			return cal;
		} catch (ParseException e) {
			return null;
		}
	}
	
	 public static boolean validarEmail(String email) {
		 	String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
	  "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
		 	Pattern pattern = Pattern.compile(emailPattern);
		  System.out.println("analizando el mail "+email);
		 	if (email != null) {
		      Matcher matcher = pattern.matcher(email);
		      if (matcher.matches()) 
		    	  return true;
		      else 
		    	  return false;
		 	}
		 	else return false;
		 
	 }
		 
}
