package com.cqwo.web.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "mob")
public class BaseMobileController extends BaseController {

	public String content = "";

	public BaseMobileController() {

		content = "12333";

	}
}
