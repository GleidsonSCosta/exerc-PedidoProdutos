package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import classes.enums.Status;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private Status status;
	private Cliente cliente;
	
	private List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido() {
		
	}

	public Pedido(Date momento, Status status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItem() {
		return itens;
	}
	
	public void addItem(ItemPedido item) {
		itens.add(item);
	}
	public void removeItem(ItemPedido item) {
		itens.remove(item);
	}
	public double total() {
		Double soma = 0.0;
		for(ItemPedido item : itens) {
			soma += item.subTotal();
		}
		return soma;
	}
	@Override
	public String toString() {
		StringBuilder sb = new  StringBuilder();
		sb.append("Data: " + momento + "\n");
		sb.append("Status: " + status + "\n");
		sb.append("Cliente: " + cliente.getNome() + "\n");
		sb.append("Itens:" + "\n");
		for(ItemPedido item : itens) {
			sb.append(item.getProduto().getNome().toUpperCase() 
					+ ", R$ "
					+ String.format("%.2f", item.getPreco())
					+ ", Quantidade: "
					+  item.getQuantidade()
					+ ", Subtutal: R$" 
					+ String.format("%.2f", item.subTotal())   
					+ "\n");
		}
		sb.append("Preço total: R$" + String.format("%.2f", total()));
				
		return sb.toString();
	}
	
}
