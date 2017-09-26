package com.cqwo.web.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "admin")
public class BaseAdminController extends BaseController {

	public String content = "";

	public BaseAdminController() {

		content = "12333";

	}
}
