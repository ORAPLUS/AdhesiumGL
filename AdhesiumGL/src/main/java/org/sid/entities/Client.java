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
@Table(name="t_clients")
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id_client;
	private String nom;
	private String tel_portable;
	private String tel_fix;
	private String email;
	private String commentaire;
	private String remarque;
	private String logo;
	private Long userCreator;
	private Date dateCreation;
	private Long userUpdator;
	private Date dateUpdate;
	@OneToMany(mappedBy="client")
	private Collection<Panier> paniers;

	
	public Client() {
		super();
	}

	public Client(String nom, String tel_portable, String tel_fix, String email, String commentaire, String remarque,
			String logo, Long userCreator, Date dateCreation, Long userUpdator, Date dateUpdate) {
		super();
		this.nom = nom;
		this.tel_portable = tel_portable;
		this.tel_fix = tel_fix;
		this.email = email;
		this.commentaire = commentaire;
		this.remarque = remarque;
		this.logo = logo;
		this.userCreator = userCreator;
		this.dateCreation = dateCreation;
		this.userUpdator = userUpdator;
		this.dateUpdate = dateUpdate;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTel_portable() {
		return tel_portable;
	}

	public void setTel_portable(String tel_portable) {
		this.tel_portable = tel_portable;
	}

	public String getTel_fix() {
		return tel_fix;
	}

	public void setTel_fix(String tel_fix) {
		this.tel_fix = tel_fix;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getRemarque() {
		return remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
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

	public Long getId_client() {
		return id_client;
	}

	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}

	public Collection<Panier> getPaniers() {
		return paniers;
	}

	public void setPaniers(Collection<Panier> paniers) {
		this.paniers = paniers;
	}
	
	
	
	

}
