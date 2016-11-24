package com.spboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hzq on 16/11/24.
 */
@Controller
public class IndexController {

	@RequestMapping(value = {"", "/", "/index"})
	public String index(){
		return "index";
	}

}
