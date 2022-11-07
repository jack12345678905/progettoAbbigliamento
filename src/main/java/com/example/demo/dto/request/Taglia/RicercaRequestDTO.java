package com.example.demo.dto.request.Taglia;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RicercaRequestDTO {
	
	private String taglia;

	public RicercaRequestDTO() {
		super();
	}

	public String getTaglia() {
		return taglia;
	}

	public void setTaglia(String taglia) {
		this.taglia = taglia;
	}
	
	@JsonIgnore
	public boolean isValid() {
		return taglia != null && !taglia .isEmpty();
	}
	

}
