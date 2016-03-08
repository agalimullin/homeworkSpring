package com.springapp.mvc;

import com.springapp.mvc.dao.UserDAO;
import com.sun.xml.internal.bind.v2.runtime.Name;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
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

    @RequestMapping(value = "/helloGuest", method = RequestMethod.GET)
    public String helloVasya(ModelMap model) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
        User user = userDAO.getUserById(userDAO.totalPersonsCount());
        model.addAttribute("message", "Hello, " + user.getName());
        return "helloGuest"; // view id
    }

    @RequestMapping(value = "/addNewUser", method = RequestMethod.GET)
    public String addNewUser() {
        return "addNewUser";
    }

    @RequestMapping(value = "/submitValue", method = RequestMethod.GET)
    public String submitValue(@RequestParam(value = "name") String name) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
        User user = new User();
        user.setName(name);
        user.setId(userDAO.totalPersonsCount() + 1);
        userDAO.addUser(user);
        return "redirect:helloGuest";
    }
}