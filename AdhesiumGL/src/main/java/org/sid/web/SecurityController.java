package org.sid.web;

import javax.mail.MessagingException;

import org.sid.dao.UserRepository;
import org.sid.services.SmtpMailServices;
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
	
	@RequestMapping(value = "/login")
	public String login(Model model) {
		model.addAttribute("","");
		return "login";
	}

	@RequestMapping(value = "/")
	public String home() {
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
