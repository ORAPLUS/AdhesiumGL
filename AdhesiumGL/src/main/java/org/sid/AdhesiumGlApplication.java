package org.sid;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

import org.sid.dao.ClientRepository;
import org.sid.dao.PanierRepository;
import org.sid.dao.PrivilegeRepository;
import org.sid.dao.ProduitRepository;
import org.sid.dao.RoleRepository;
import org.sid.dao.UserRepository;
import org.sid.entities.Client;
import org.sid.entities.Panier;
import org.sid.entities.Privilege;
import org.sid.entities.Produit;
import org.sid.entities.Role;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;

@SuppressWarnings("deprecation")
@SpringBootApplication
public class AdhesiumGlApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private PrivilegeRepository privilegeRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private PanierRepository panierRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AdhesiumGlApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		/*//Super Admin (Très Important)
		PasswordEncoder encoder = new Md5PasswordEncoder();
		String superAdminPassword = encoder.encodePassword("123456", null);
		User superAdmin = new User("ADMIN", superAdminPassword, "ayoub@adhesium.com", 1, null, new Date(), null, null);
		userRepository.save(superAdmin);
		Role roleAdmin = new Role("ADMIN", 1, superAdmin.getIdUser(), new Date(), null, null);
		roleRepository.save(roleAdmin);
		Role roleUser = new Role("USER", 1, superAdmin.getIdUser(), new Date(), null, null);
		roleRepository.save(roleUser);
		Privilege privilegeI = new Privilege(superAdmin.getIdUser(), new Date(), null, null, superAdmin, roleAdmin);
		Privilege privilegeII = new Privilege(superAdmin.getIdUser(), new Date(), null, null, superAdmin, roleUser);
		privilegeRepository.save(privilegeI);
		privilegeRepository.save(privilegeII);
		//Testing JAVA 8 (API)
		Client client = new Client("ALTRAN", "0675106030", "0522221080", "sis.ayoub.youb@gmail.com", 
								  "Ici votre commentaire Client", "Ici votre remarque Client", "altran_logo.jpg", 
								  superAdmin.getIdUser(), new Date(), null, null);
		clientRepository.save(client);
		Produit produit1 = new Produit("MD2", superAdmin.getIdUser(), new Date(), null, null);
		produitRepository.save(produit1);
		Produit produit2 = new Produit("ZAD", superAdmin.getIdUser(), new Date(), null, null);
		produitRepository.save(produit2);
		Produit produit3 = new Produit("HD2", superAdmin.getIdUser(), new Date(), null, null);
		produitRepository.save(produit3);
		Produit produit4 = new Produit("MD2", superAdmin.getIdUser(), new Date(), null, null);
		produitRepository.save(produit4);
		Panier panier1 = new Panier(1, "", "ALC", "DSLS", "Windows 7", "JUK-42591013D3B014AA", "Ici votre commentaire Panier", 
					new Date(), Date.from(Instant.now().plus(Duration.ofDays(1))), Date.from(Instant.now().plus(Duration.ofDays(300))), null, 
					superAdmin.getIdUser(), new Date(), null, null, 
					client, produit1);
		panierRepository.save(panier1);
		Panier panier2 = new Panier(2, "", "ALC", "DSLS", "Windows 7", "JUK-42591013D3B014AA", "Ici votre commentaire Panier", 
					new Date(), Date.from(Instant.now().plus(Duration.ofDays(1))), Date.from(Instant.now().plus(Duration.ofDays(300))), null, 
					superAdmin.getIdUser(), new Date(), null, null, 
					client, produit2);
		panierRepository.save(panier2);
		Panier panier3 = new Panier(6, "", "ALC", "DSLS", "Windows 7", "JUK-42591013D3B014AA", "Ici votre commentaire Panier", 
					new Date(), Date.from(Instant.now().plus(Duration.ofDays(1))), Date.from(Instant.now().plus(Duration.ofDays(300))), null, 
					superAdmin.getIdUser(), new Date(), null, null, 
					client, produit3);
		panierRepository.save(panier3);
		Panier panier4 = new Panier(4, "", "ALC", "DSLS", "Windows 7", "JUK-42591013D3B014AA", "Ici votre commentaire Panier", 
					new Date(), Date.from(Instant.now().plus(Duration.ofDays(1))), Date.from(Instant.now().plus(Duration.ofDays(300))), null, 
					superAdmin.getIdUser(), new Date(), null, null, 
					client, produit4);
		panierRepository.save(panier4);*/

	}
}
