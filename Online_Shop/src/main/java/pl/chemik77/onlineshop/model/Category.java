package pl.chemik77.onlineshop.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {

	private static final long serialVersionUID = 6255316927619351521L;

	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy = "category")
	private Set<Product> products = new HashSet<>();

	public Category() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return name;
	}

}
