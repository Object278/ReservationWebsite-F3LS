package reservation.f3ls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import reservation.f3ls.model.SearchSubmit;


@Controller
public class AccessController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/search")
    public String search(@ModelAttribute("SearchSubmit") SearchSubmit submit, Model model){
        return "search";
    }

    @GetMapping("/html_example")
    public String html_example(){
        return "html_example";
    }

    @GetMapping("/s")
    public String s(){
        return "s";
    }

    @GetMapping("/restaurant")
    public String restaurant(){
        return "restaurant";
    }

    @GetMapping("/toolbar")
    public String toolbar(){
        return "toolbar";
    }

}
