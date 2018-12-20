package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld")
public class HelloWorld {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "index";
    }
}
