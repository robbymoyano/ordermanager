package com.falabella.domain.folio;

import java.sql.Timestamp;
import java.util.Date;

public class Folio {

	private long numPrefix;
	private long numCur;
	private long numEnd;
	private long numInit;

	private String resolucion;

	private Date inicioResolucion;
	private Date finResolucion;

	private int vigencia;

	private Timestamp tsValid;

	public long getNumPrefix() {
		return numPrefix;
	}

	public void setNumPrefix(long numPrefix) {
		this.numPrefix = numPrefix;
	}

	public long getNumCur() {
		return numCur;
	}

	public void setNumCur(long numCur) {
		this.numCur = numCur;
	}

	public long getNumEnd() {
		return numEnd;
	}

	public void setNumEnd(long numEnd) {
		this.numEnd = numEnd;
	}

	public long getNumInit() {
		return numInit;
	}

	public void setNumInit(long numInit) {
		this.numInit = numInit;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public Timestamp getTsValid() {
		return tsValid;
	}

	public void setTsValid(Timestamp tsValid) {
		this.tsValid = tsValid;
	}

	@Override
	public String toString() {
		return "Folio [numPrefix=" + numPrefix + ", numCur=" + numCur + ", numEnd=" + numEnd + ", numInit=" + numInit
				+ ", resolucion=" + resolucion + ", inicioResolucion=" + inicioResolucion + ", finResolucion="
				+ finResolucion + ", vigencia=" + vigencia + ", tsValid=" + tsValid + "]";
	}

	public Date getInicioResolucion() {
		return inicioResolucion;
	}

	public void setInicioResolucion(Date inicioResolucion) {
		this.inicioResolucion = inicioResolucion;
	}

	public Date getFinResolucion() {
		return finResolucion;
	}

	public void setFinResolucion(Date finResolucion) {
		this.finResolucion = finResolucion;
	}

	public int getVigencia() {
		return vigencia;
	}

	public void setVigencia(int vigencia) {
		this.vigencia = vigencia;
	}

	/**
	 * 
	 * @return Retorna el folio en formato 12 digitos
	 */
	public String vistaFolioSrx() {
		String prx = String.valueOf(this.numPrefix);
		String folio = String.valueOf(this.numCur);

		String largo = String.valueOf(this.numEnd);

		int max = largo.length();

		if (folio.length() < max) {
			StringBuilder cero = new StringBuilder();
			for (int i = 0; i < max - folio.length(); i++) {
				cero.append("0");
			}
			return prx + cero.toString() + folio;

		} else {
			return folio;
		}
	}

	/**
	 * 
	 * @return Retorna el folio en formato 12 digitos
	 */
	public String vistaFolioImpresion() {
		String prx = String.valueOf(this.numPrefix);
		String folio = String.valueOf(this.numCur);

		String largo = String.valueOf(this.numEnd);

		int max = largo.length();

		if (folio.length() < max) {
			StringBuilder cero = new StringBuilder();
			for (int i = 0; i < max - folio.length(); i++) {
				cero.append("0");
			}
			return prx + "-" + cero.toString() + folio;

		} else {
			return folio;
		}
	}

}
