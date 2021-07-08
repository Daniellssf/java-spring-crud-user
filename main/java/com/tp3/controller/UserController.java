package com.tp3.controller;

import com.tp3.model.User;
import com.tp3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.RequestDispatcher;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/user/criar", method = RequestMethod.GET)
    public String cadastrar() {
        return "/user/criar";
    }

    @RequestMapping(value = "/user/criar", method = RequestMethod.POST)
    public void cadastrarUser(@RequestParam("name") String name,
                              @RequestParam("email") String email,
                              @RequestParam("password") String password,
                              Map<String, Object> model){

        try{
            User user = new User(name, email, password);
            userRepository.save(user);
            model.put("message", "O usuário " + user.getName() + " foi salvo com email: " + user.getEmail()
                    + " e senha: " + user.getPassword() + " no nosso banco de dados.");

        } catch (Exception ex) {
            model.put("message", "Não foi possível salvar o usuário.");
        }
    }
}
