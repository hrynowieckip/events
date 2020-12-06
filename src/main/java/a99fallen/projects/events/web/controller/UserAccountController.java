package a99fallen.projects.events.web.controller;

import a99fallen.projects.events.domain.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j @RequiredArgsConstructor
public class UserAccountController {

    private User user;

    @GetMapping("/account")
    public String getUserAccount() {

    return "/account";
    }
}