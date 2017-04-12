package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id_user;
	private String username;
	private String password;
	private String email;
	private int userEnabled;
	private int userCreator;
	private Date dateCreation;
	private int userUpdator;
	private Date dateUpdate;

	@OneToMany(mappedBy = "user")
	private Collection<Privilege> privileges;

	public User(String username, String password,String email, int userEnabled, int userCreator, Date dateCreation,
			int userUpdator, Date dateUpdate) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.userEnabled = userEnabled;
		this.userCreator = userCreator;
		this.dateCreation = dateCreation;
		this.userUpdator = userUpdator;
		this.dateUpdate = dateUpdate;
	}

	public User() {
		super();
	}

	
	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserEnabled() {
		return userEnabled;
	}

	public void setUserEnabled(int userEnabled) {
		this.userEnabled = userEnabled;
	}

	public int getUserCreator() {
		return userCreator;
	}

	public void setUserCreator(int userCreator) {
		this.userCreator = userCreator;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public int getUserUpdator() {
		return userUpdator;
	}

	public void setUserUpdator(int userUpdator) {
		this.userUpdator = userUpdator;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public Collection<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Collection<Privilege> privileges) {
		this.privileges = privileges;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
