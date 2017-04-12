package org.sid.web;

import javax.mail.MessagingException;

import org.sid.dao.UserRepository;
import org.sid.services.SmtpMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private SmtpMailSender smtpMailSender;
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/forget")
	public String forget(Model model,String email) throws MessagingException{
		if(userRepository.isExisteEmail(email)) {
			smtpMailSender.send("sis.ayoub.youb@gmail.com", "test", "merci");
			model.addAttribute("forget",true);
		}else{
			model.addAttribute("forget",false);
		}
		return "login";
	}
}
