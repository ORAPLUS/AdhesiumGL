package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_privileges")
public class Privilege implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private Long id;
	private Long userCreator;
	private Date dateCreation;
	private Long userUpdator;
	private Date dateUpdate;

	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	@ManyToOne
	@JoinColumn(name="id_role")
	private Role role;
	
	public Privilege() {
		super();
	}
	
	public Privilege(Long userCreator, Date dateCreation, Long userUpdator, Date dateUpdate, User user, Role role) {
		super();
		this.userCreator = userCreator;
		this.dateCreation = dateCreation;
		this.userUpdator = userUpdator;
		this.dateUpdate = dateUpdate;
		this.user = user;
		this.role = role;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserCreator() {
		return userCreator;
	}
	public void setUserCreator(Long userCreator) {
		this.userCreator = userCreator;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Long getUserUpdator() {
		return userUpdator;
	}
	public void setUserUpdator(Long userUpdator) {
		this.userUpdator = userUpdator;
	}
	public Date getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
