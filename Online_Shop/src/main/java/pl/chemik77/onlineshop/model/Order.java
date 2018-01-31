package pl.chemik77.onlineshop.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

	private static final long serialVersionUID = -6012118561666460774L;

	@Column(name = "total", scale = 2)
	private BigDecimal total;
	@Enumerated(EnumType.STRING)
	private Status status;

	@ManyToOne
	private Customer customer;
	@OneToMany
	private Set<CartItem> items;

	public Order() {
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set<CartItem> getItems() {
		return items;
	}

	public void setItems(Set<CartItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [total=" + total + ", customer=" + customer + "]";
	}

}
