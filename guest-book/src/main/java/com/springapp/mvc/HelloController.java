package com.springapp.mvc;

import com.springapp.mvc.dao.UserDAO;
import com.sun.xml.internal.bind.v2.runtime.Name;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home"; // view id
    }

    @RequestMapping(value = "/helloVasya", method = RequestMethod.GET)
    public String helloVasya(ModelMap model) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
        User vasya = userDAO.getUserById(1);
        model.addAttribute("message", "Hello, " + vasya.getName());
        return "helloVasya"; // view id
    }

    @RequestMapping(value = "/addNewUser", method = RequestMethod.GET)
    public String addNewUser(String name) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
        User user = new User();
        if (name != null) {
            user.setName(name);
            userDAO.addUser(user);
        }
        return "addNewUser";
    }
}