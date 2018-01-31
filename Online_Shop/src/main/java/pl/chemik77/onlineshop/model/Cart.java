package pl.chemik77.onlineshop.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carts")
public class Cart extends BaseEntity {

	private static final long serialVersionUID = -9179810675339546172L;

	@Column(name = "total", scale = 2)
	private BigDecimal total;

	@OneToOne
	private Customer customer;

	@OneToMany
	private Set<CartItem> cartItems = new HashSet<>();

	public Cart() {
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Set<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	@Override
	public String toString() {
		return "Cart [total=" + total + ", customer=" + customer + "]";
	}

}
