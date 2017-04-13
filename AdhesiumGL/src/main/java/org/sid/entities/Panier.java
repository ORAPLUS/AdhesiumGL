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
@Table(name="t_paniers")
public class Panier implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id_panier;
	private int qt;
	private String modules;
	private String type;
	private String install;
	private String os;
	private String target;
	private String commentaire;
	private Date date_achat;
	private Date date_activation;
	private Date date_expiration;
	private Date date_stop;
	private Long userCreator;
	private Date dateCreation;
	private Long userUpdator;
	private Date dateUpdate;
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;
	@ManyToOne
	@JoinColumn(name="id_produit")
	private Produit produit;
	
	
	public Panier() {
		super();
	}
	
	public Panier(int qt, String modules, String type, String install, String os, String target, String commentaire,
			Date date_achat, Date date_activation, Date date_expiration, Date date_stop, Long userCreator,
			Date dateCreation, Long userUpdator, Date dateUpdate, Client client, Produit produit) {
		super();
		this.qt = qt;
		this.modules = modules;
		this.type = type;
		this.install = install;
		this.os = os;
		this.target = target;
		this.commentaire = commentaire;
		this.date_achat = date_achat;
		this.date_activation = date_activation;
		this.date_expiration = date_expiration;
		this.date_stop = date_stop;
		this.userCreator = userCreator;
		this.dateCreation = dateCreation;
		this.userUpdator = userUpdator;
		this.dateUpdate = dateUpdate;
		this.client = client;
		this.produit = produit;
	}

	public Long getId_panier() {
		return id_panier;
	}
	public void setId_panier(Long id_panier) {
		this.id_panier = id_panier;
	}
	public int getQt() {
		return qt;
	}
	public void setQt(int qt) {
		this.qt = qt;
	}
	public String getModules() {
		return modules;
	}
	public void setModules(String modules) {
		this.modules = modules;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getInstall() {
		return install;
	}
	public void setInstall(String install) {
		this.install = install;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Date getDate_achat() {
		return date_achat;
	}
	public void setDate_achat(Date date_achat) {
		this.date_achat = date_achat;
	}
	public Date getDate_activation() {
		return date_activation;
	}
	public void setDate_activation(Date date_activation) {
		this.date_activation = date_activation;
	}
	public Date getDate_expiration() {
		return date_expiration;
	}
	public void setDate_expiration(Date date_expiration) {
		this.date_expiration = date_expiration;
	}
	public Date getDate_stop() {
		return date_stop;
	}
	public void setDate_stop(Date date_stop) {
		this.date_stop = date_stop;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
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
	
	

}
