package com.dmm.test1;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userPageController {
	@GetMapping("userPage")
	@PreAuthorize("hasRole('ROLE_USER')") // ROLE_USERのユーザのみアクセスを許可
	public String userPage() {
		return "userPage";
	}
}