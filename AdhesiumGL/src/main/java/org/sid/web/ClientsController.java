package org.sid.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientsController {
	
	@RequestMapping(value ="/pck_gestion.clients/display_clients")
	public String display_clients(){
		return "pck_gestion.clients/display_clients";
	}

}
