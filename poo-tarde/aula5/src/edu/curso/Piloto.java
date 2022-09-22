package edu.curso;

public class Piloto extends Pessoa {
	private String breve;
	private int horasVoo;
	private String uniforme;
	private String empresa;
	private boolean descansado;
	
	public String getBreve() {
		return breve;
	}
	public void setBreve(String breve) {
		this.breve = breve;
	}
	
	public int getHorasVoo() {
		return horasVoo;
	}
	public void setHorasVoo(int horasVoo) {
		this.horasVoo = horasVoo;
	}
	
	public String getUniforme() {
		return uniforme;
	}
	public void setUniforme(String uniforme) {
		this.uniforme = uniforme;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public boolean isDescansado() {
		return descansado;
	}
	public void setDescansado(boolean descansado) {
		this.descansado = descansado;
	}
}
