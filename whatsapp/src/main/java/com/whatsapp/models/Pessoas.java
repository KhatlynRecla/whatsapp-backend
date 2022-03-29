package com.whatsapp.models;

import javax.persistence.*;

@Entity
@Table(name = "pessoas")

public class Pessoas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDPESSOA", nullable = false)
	private int IDPESSOA;
	
	@Column(name = "NOME_PESSOA", length = 50,nullable = false)	
	private String NOME_PESSOA; 
	
	@Column(name = "FOTO_PESSOA", length = 250,nullable = false)	
	private String FOTO_PESSOA; 

	@Column(name = "EMAIL", length = 250,nullable = false)	
	private String EMAIL; 
	
	@Column(name = "SENHA", length = 250,nullable = false)	
	private String SENHA; 
	
	@Column(name = "STATUS", nullable = false)	
	private int STATUS;

	public int getIDPESSOA() {
		return IDPESSOA;
	}

	public void setIDPESSOA(int iDPESSOA) {
		IDPESSOA = iDPESSOA;
	}

	public String getNOME_PESSOA() {
		return NOME_PESSOA;
	}

	public void setNOME_PESSOA(String nOME_PESSOA) {
		NOME_PESSOA = nOME_PESSOA;
	}

	public String getFOTO_PESSOA() {
		return FOTO_PESSOA;
	}

	public void setFOTO_PESSOA(String fOTO_PESSOA) {
		FOTO_PESSOA = fOTO_PESSOA;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getSENHA() {
		return SENHA;
	}

	public void setSENHA(String sENHA) {
		SENHA = sENHA;
	}

	public int getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}
	
	
}