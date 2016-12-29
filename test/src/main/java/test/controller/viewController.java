package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class viewController {

	@RequestMapping(value = "/get")
	public String getProducts() {
		return "getProducts";
	}
}
