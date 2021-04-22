package br.com.fiap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USER")
@SequenceGenerator(name = "user", sequenceName ="SQ_TB_USER", allocationSize = 1)
public class User {
	
	@Id
	@Column(name = "cd_user")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user")
	private int codigo;
	
	@Column(name = "nm_user", length = 30, nullable =false)
	private String name;
	
	@Column(name = "ds_email", length = 80, nullable= false)
	private String email;
	
	@Column(name = "nr_number", nullable = false)
	private int number;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "userBean [name=" + name + ", email=" + email + ", number=" + number + "]";
	}
	
	

}
