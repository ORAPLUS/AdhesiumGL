package org.sid.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityServices extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery("select username as principal,password as credentials,user_enabled from t_users where username=?")
		.authoritiesByUsernameQuery("select u.username as principal, r.nom_role as role" 
				 +" from t_privileges p,t_users u,t_roles r"
				 +" where p.id_user=u.id_user and p.id_role=r.id_role and u.username=?")
		.rolePrefix("ROLE_")
		.passwordEncoder(new Md5PasswordEncoder());
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.formLogin().loginPage("/login");
		http.authorizeRequests().antMatchers("/").hasRole("USER");
		//http.authorizeRequests().antMatchers("/","/taxes").hasRole("ADMIN");
		//http.exceptionHandling().accessDeniedPage("/login");
	}
}
