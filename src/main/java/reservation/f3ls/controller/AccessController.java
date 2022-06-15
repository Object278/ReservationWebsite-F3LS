package reservation.f3ls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccessController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/search")
    public String search(){
        return "search";
    }

    @GetMapping("/restaurant")
    public String restaurant(){
        return "restaurant";
    }


}
