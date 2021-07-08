package com.tp3.controller;

import com.tp3.model.User;
import com.tp3.repository.UserRepository;
import com.tp3.session.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserSession userSession;

    @RequestMapping(value = "/login/loginPage", method = RequestMethod.GET)
    public String loginPage() {
        return "/login/loginPage";
    }

    @RequestMapping(value = "/login/loginPage", method = RequestMethod.POST)
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        Map<String, Object> model) {
        User u = userRepository.findByEmail(email);
        if (u != null && u.getEmail().equals(email) && u.getPassword().equals(password) ) {
            userSession.addLoggedUser(u);
            return "redirect:/autentication/autenticationPage";
        } else {
            model.put("message", "Login ou senha inválidos");
            return "/login/loginPage";
        }
    }

//    @RequestMapping(value = "/autentication/autenticationPage", method = RequestMethod.POST)
//    public String autentication(@RequestParam("email") String email,
//                        @RequestParam("password") String password,
//                        Map<String, Object> model) {
//        User u = userRepository.findByEmail(email);
//        if (u != null && u.getEmail().equals(email) && u.getPassword().equals(password)) {
//            userSession.addLoggedUser(u);
//            model.put("messageAutentication", "O Usuário " + u.getName() + " foi autorizado.");
//            return "/autentication/autenticationPage";
//        }
//        return "/login/loginPage";
//    }

    @RequestMapping(value = "/login/logout", method = RequestMethod.GET)
    public String logout() {
        userSession.removeLoggedUser();
        return "/login/loginPage";
    }
}
