package com.example.findband;

public class Artistas {
	private String nombre;
	private String estilo;
	private String enlace;
	
	public Artistas(String nom,String est,String enl){
		this.nombre = nom;
		this.estilo = est;
		this.enlace = enl;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getEstilo(){
		return estilo;
	}
	
	public String getEnlace(){
		return enlace;
	}

}
