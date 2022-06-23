package reservation.f3ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import reservation.f3ls.model.Restaurants;
import reservation.f3ls.model.SearchSubmit;
import reservation.f3ls.service.SearchService;

import java.util.List;


@Controller
public class SearchController {
    private final SearchService service;


    @Autowired
    public SearchController(SearchService service){
        this.service = service;
    }

    @PostMapping("/search")
    public String searchSubmit(@ModelAttribute SearchSubmit submit, Model model){
        Restaurants restaurants = service.search(submit.getName());

        SearchSubmit submit1 = new SearchSubmit();
        if(restaurants == null){
            submit1.setName(submit.getName() + " is not on the map.");
        }else {
            submit1.setName(restaurants.getName());
        }
        model.addAttribute("result", submit1);
        return "result";
    }


    //暂时返回字符串
    @PostMapping("/filter")
    @ResponseBody
    public List<Restaurants> filter(@RequestBody String name, @RequestBody Integer distance){
        return service.filter(name, distance);
    }
}
