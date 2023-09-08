package Poltrona;

import java.util.Arrays;

import Cliente.Cliente;

public class Poltronas {
	
	private int  numPoltrona;
	private String lugar;
    private Cliente cliente;
    
    public Poltronas() {
		
	}
    
    
	
	public Poltronas(int numPoltrona ,String lugar, Cliente cliente) {
		super();
		this.numPoltrona = numPoltrona;
		this.cliente = cliente;
		this.lugar = lugar;
	}



	public int getNumPoltrona() {
		return numPoltrona;
	}

	public void setNumPoltrona(int numPoltrona) {
		this.numPoltrona = numPoltrona;
	}



	public String getLugar() {
		return lugar;
	}



	public void setLugar(String lugar) {
		this.lugar = lugar;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		
	}



	@Override
	public String toString() {
		return "Poltronas [numPoltrona=" + numPoltrona + ", lugar=" + lugar + ", cliente=" + cliente + "]";
	}
	
	
	

}
