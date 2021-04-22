package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.userDao;
import br.com.fiap.model.Setup;
import br.com.fiap.model.User;

@Named
@RequestScoped
public class userBean {
	
	private User user = new User();
	
	public void executar() {
		new userDao().save(this.user);
		System.out.println(this.user);
	}
	public List<User> getUsers() {
		return new userDao().getAll();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
