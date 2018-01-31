package pl.chemik77.onlineshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review extends BaseEntity {

	private static final long serialVersionUID = -4745162110245702848L;

	@Column(name = "score")
	private int score;
	@Column(name = "feedback")
	private String feedback;

	@ManyToOne
	private Customer customer;
	@ManyToOne
	private Product product;

	public Review() {
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Review [score=" + score + ", feedback=" + feedback + ", product=" + product + "]";
	}

}
