package com.tp3.controller;

import com.tp3.model.User;
import com.tp3.repository.UserRepository;
import com.tp3.session.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class AutenticationController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserSession userSession;

    @RequestMapping(value = "autentication/autenticationPage", method = RequestMethod.GET)
    public String autentication(Map<String, Object> model) {
        User user = userSession.getLoggedUser();
        model.put("message", "O usuário " + user.getName() + " foi autenticado com sucesso");
        return "autentication/autenticationPage";
    }

}
