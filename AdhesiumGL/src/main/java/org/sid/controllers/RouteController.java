package org.sid.controllers;

import javax.mail.MessagingException;

//import org.sid.configuration.SmtpMailServices;
import org.sid.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RouteController {

	@Autowired
	private UserRepository userRepository;
	//@Autowired
	//private SmtpMailServices smtpMailSender;
	
	@RequestMapping(value="/pck_clients/display_manage_clients")
	public String pck_clients_add(Model model) {
		model.addAttribute("display_manage_clients",true);
		model.addAttribute("display_manage_clients_active",true);
		return "/pck_clients/display_manage_clients";
	}
	
	@RequestMapping(value="/pck_clients/display_details_client")
	public String pck_clients_search(Model model,@RequestParam(value = "id", defaultValue = "") Long id) {
		model.addAttribute("display_manage_clients",true);
		model.addAttribute("display_details_client_active",true);
		model.addAttribute("id",id);
		return "/pck_clients/display_details_client";
	}
	
	@RequestMapping(value="/pck_produits/display_produits")
	public String pck_produits(Model model) {
		model.addAttribute("display_produits",true);
		return "/pck_produits/display_produits";
	}
	
	@RequestMapping(value = "/login")
	public String login(Model model) {
		return "login";
	}

	@RequestMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("index",true);
		return "index";
	}
	
	@RequestMapping(value="/forgot")
	public String forget(Model model,String email) throws MessagingException{
		if(userRepository.isExisteEmail(email)) {
			//smtpMailSender.send("sis.ayoub.youb@gmail.com", "test", "merci");
			model.addAttribute("forgot",true);
		}else{
			model.addAttribute("forgot",false);
		}
		return "login";
	}
}
