package com.yuritrier.entites;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, updatable = false, nullable = false)
	private UUID id;
	
	@OneToMany(mappedBy = "id.pedido")
	private Set<ItemPedido> itens = new HashSet<>();
	
	private Double desconto;
	
	public Pedido() {
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getDesconto() {
		return desconto;
	}

	public Pedido(UUID id, Double desconto) {
		super();
		this.id = id;
		this.desconto = desconto;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Set<ItemPedido> getItens() {
		return itens;
	}
	
	public Double getTotalDesconto() {
		double sum = 0.0;
		for (ItemPedido x : itens) {
			if (x.getItem().getTipoItem().equals(1)) {
				sum += x.getSubTotal();
			}
		}
		return sum * (desconto/100);
	}
	
	public Double getTotal() {
		double sum = 0.0;
		for (ItemPedido x : itens) {
			sum += x.getSubTotal();
		}
		return sum - getTotalDesconto();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
