package ua.marchenko.springcourse.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showFrom")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName").toUpperCase();
        String result = "Yo! " + name;
        model.addAttribute("message", result);
        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFromVersionThree(@RequestParam("studentName") String theName, Model model) {
        String name = theName.toUpperCase();
        String result = "Hey My Friend! " + name;
        model.addAttribute("message", result);
        return "helloworld";
    }
}
