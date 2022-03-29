package com.whatsapp.models;

import javax.persistence.*;

@Entity
@Table(name = "idiomas")

public class Idiomas {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDIDIOMA", nullable = false)
	private int IDIDIOMA;
	
	@Column(name = "NOME_IDIOMA", length = 50,nullable = false)	
	private String NOME_IDIOMA; 
	
	@Column(name = "STATUS", nullable = false)	
	private int STATUS;

	public int getIDIDIOMA() {
		return IDIDIOMA;
	}

	public void setIDIDIOMA(int iDIDIOMA) {
		IDIDIOMA = iDIDIOMA;
	}

	public String getNOME_IDIOMA() {
		return NOME_IDIOMA;
	}

	public void setNOME_IDIOMA(String nOME_IDIOMA) {
		NOME_IDIOMA = nOME_IDIOMA;
	}

	public int getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}
	
}