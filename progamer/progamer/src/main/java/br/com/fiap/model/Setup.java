package br.com.fiap.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SETUP")
@SequenceGenerator(name = "setup", sequenceName ="SQ_TB_SETUP", allocationSize = 1)
public class Setup {
		
	@Id
	@Column(name = "cd_setup")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "setup")
	private int codigo;
	
	@Column(name = "nm_nome", length = 30, nullable =false)
	private String name;
	
	@Column(name = "ds_descricao", length = 80, nullable= false)
	private String description;
	
	@Column(name = "nr_preco", nullable = false)
	private BigDecimal price;
		
	
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "setupBean [name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	
	

}
