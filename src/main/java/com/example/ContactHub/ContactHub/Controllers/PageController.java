package com.example.ContactHub.ContactHub.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model ){
        System.out.println("home pageeeeeeeeeeeeeee");
        model.addAttribute("name", "JAVA PROJECT");

        return "home";
    }

@RequestMapping("/about")
public String aboutpage(Model model ){
    System.out.println("about pageeeeeeeeeeeeeee");
    return "about";
}

    @RequestMapping("/services")
    public String servicepage(Model model ){
        System.out.println("services pageeeeeeeeeeeeeee");


        return "services";
    }

    @GetMapping("/contacts")
    public String contact() {
        return new String("contact");
    }

    // this is showing login page
    @GetMapping("/loginhtml")
    public String login() {
        return new String("login");
    }

    // registration page
    @GetMapping("/register")
    public String register(Model model) {

//        UserForm userForm = new UserForm();
//        // default data bhi daal sakte hai
//        // userForm.setName("Durgesh");
//        // userForm.setAbout("This is about : Write something about yourself");
//        model.addAttribute("userForm", userForm);

        return "register";
    }

}
