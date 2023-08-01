package model;

import java.util.Date;

public class Pedido {
	private int idPedido;
	private int quantidade;
	private Date data;
	private Cliente cliente;
	private Produto produto;
	
	public Pedido(int idPedido, int quantidade, Date data, Cliente cliente, Produto produto) {
		this.idPedido = idPedido;
		this.quantidade = quantidade;
		this.data = data;
		this.cliente = cliente;
		this.produto = produto;
	}
	
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public Date getData() {
		return data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	

}
