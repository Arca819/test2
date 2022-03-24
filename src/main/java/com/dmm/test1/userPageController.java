package com.dmm.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userPageController {
	@GetMapping("userPage")
	public String userPage() {
		return "userPage";
	}
}