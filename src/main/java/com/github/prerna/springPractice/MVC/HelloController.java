package com.github.prerna.springPractice.MVC;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/hello")
public class HelloController {
@RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model){
    model.addAttribute("message", "Hello World!! First MVC code");
    return "hello";
}
}
