//package hello;
//
//import hello.dao.UserDAO;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class UserController {
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(ModelMap model) {
//		return "admin"; // view id
//	}
//
//	@RequestMapping(value = "/helloVasya", method = RequestMethod.GET)
//	public String helloVasya(ModelMap model) {
//
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
//		UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
//		User vasya = userDAO.getUserById(1);
//		model.addAttribute("message", "Hello, " + vasya.getName());
//
//		return "helloVasya"; // view id
//	}
//
//	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
//	public String showAddUserForm(){
//		return "addUser";
//	}
//
//	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
//	public String handleAddUserForm(@RequestParam("name") String name, Model model){
//		model.addAttribute("name", name);
//		return "user";
//	}
//
//}