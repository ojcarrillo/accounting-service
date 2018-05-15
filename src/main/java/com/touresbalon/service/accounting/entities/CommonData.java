package com.touresbalon.service.accounting.entities;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CommonData implements Serializable{	
	
		
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private Float porcentajeDescuento;
	
	private Float descuentoProntoPago;
	
	private Float porcentajeImpuestos;
	
	private Float valorImpuestos;
	
	private Float valor;	
	
	private String estadoFactura;

	public Float getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(Float porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public Float getDescuentoProntoPago() {
		return descuentoProntoPago;
	}

	public void setDescuentoProntoPago(Float descuentoProntoPago) {
		this.descuentoProntoPago = descuentoProntoPago;
	}

	public Float getPorcentajeImpuestos() {
		return porcentajeImpuestos;
	}

	public void setPorcentajeImpuestos(Float porcentajeImpuestos) {
		this.porcentajeImpuestos = porcentajeImpuestos;
	}

	public Float getValorImpuestos() {
		return valorImpuestos;
	}

	public void setValorImpuestos(Float valorImpuestos) {
		this.valorImpuestos = valorImpuestos;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getEstadoFactura() {
		return estadoFactura;
	}

	public void setEstadoFactura(String estadoFactura) {
		this.estadoFactura = estadoFactura;
	}
	
	
	
}
