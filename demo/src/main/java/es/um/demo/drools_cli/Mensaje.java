package es.um.demo.drools_cli;

import java.io.Serializable;

public class Mensaje implements Serializable {
	private static final long serialVersionUID = 1L;
	private String mensaje;
	private Integer tipo;
	
	public Mensaje(String mensaje, Integer tipo) {
		this.mensaje = mensaje;
		this.tipo = tipo;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public Integer getTipo() {
		return tipo;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
}
