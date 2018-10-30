package negocio;

import java.util.Calendar;

public class Candidato {
	
	private String nome;
	private String email;
	private String emailRed;
	private String rg;
	private Calendar expedicao;
	private String orgao;
	private String uf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmailRed() {
		return emailRed;
	}
	public void setEmailRed(String emailRed) {
		this.emailRed = emailRed;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public Calendar getExpedicao() {
		return expedicao;
	}
	public void setExpedicao(Calendar expedicao) {
		this.expedicao = expedicao;
	}
	
	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	private boolean validacao() {
		return validaEmail();
	}
	
	public boolean validaEmail() {
	
		return getEmail().equals(getEmailRed());
	}
	

}
