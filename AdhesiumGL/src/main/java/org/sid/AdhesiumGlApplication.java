package org.sid;

import java.util.Date;

import org.sid.dao.PrivilegeRepository;
import org.sid.dao.RoleRepository;
import org.sid.dao.UserRepository;
import org.sid.entities.Privilege;
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
	
	public static void main(String[] args) {
		SpringApplication.run(AdhesiumGlApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		PasswordEncoder encoder = new Md5PasswordEncoder();
		String password = encoder.encodePassword("123456", null);
		User superAdmin = new User("ADMIN",password ,"ayoub@adhesium.com", 1, 1, new Date(), 1, new Date());
		userRepository.save(superAdmin);
		Role roleAdmin = new Role("ADMIN", 1, 1, new Date(), 1, new Date());
		roleRepository.save(roleAdmin);
		Role roleUser = new Role("USER", 1, 1, new Date(), 1, new Date());
		roleRepository.save(roleUser);
		Privilege privilegeI = new Privilege(1, new Date(), 1, new Date(), superAdmin, roleAdmin);
		Privilege privilegeII = new Privilege(1, new Date(), 1, new Date(), superAdmin, roleUser);
		privilegeRepository.save(privilegeI);
		privilegeRepository.save(privilegeII);
		
	}
}
