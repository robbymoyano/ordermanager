package com.falabella.domain.sequence;

public class Sequence {
	private int terminalId;
	private long numInc;
	private long numMin;
	private long numMax;
	private long curValue;



	public long getNumInc() {
		return numInc;
	}

	public void setNumInc(long numInc) {
		this.numInc = numInc;
	}

	public long getNumMin() {
		return numMin;
	}

	public void setNumMin(long numMin) {
		this.numMin = numMin;
	}

	public long getNumMax() {
		return numMax;
	}

	public void setNumMax(long numMax) {
		this.numMax = numMax;
	}

	public long getCurValue() {
		return curValue;
	}

	public void setCurValue(long curValue) {
		this.curValue = curValue;
	}

	

	public int getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
	}

	@Override
	public String toString() {
		return "Sequence [terminalId=" + terminalId + ", numInc=" + numInc + ", numMin=" + numMin + ", numMax=" + numMax
				+ ", curValue=" + curValue + "]";
	}

	


	
	

	
}
