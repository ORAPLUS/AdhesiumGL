package org.sid.controllers;

import javax.mail.MessagingException;

import org.sid.configuration.SmtpMailServices;
import org.sid.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private SmtpMailServices smtpMailSender;
	
	@RequestMapping(value="/pck_clients/display_clients")
	public String pck_clients(Model model) {
		model.addAttribute("display_clients",true);
		return "/pck_clients/display_clients";
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
			smtpMailSender.send("sis.ayoub.youb@gmail.com", "test", "merci");
			model.addAttribute("forgot",true);
		}else{
			model.addAttribute("forgot",false);
		}
		return "login";
	}
}
