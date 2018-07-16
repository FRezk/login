package br.com.rezk.id8.service.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginResource {

	@RequestMapping(method=RequestMethod.GET, value = "/tryLogin")
	public Boolean tryLogin(){
		return true;
	}

}
