package reservation.f3ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import reservation.f3ls.model.Restaurant;
import reservation.f3ls.service.SearchService;

import java.util.List;


@Controller
public class SearchController {
    private final SearchService service;


    @Autowired
    public SearchController(SearchService service){
        this.service = service;
    }
    //暂时返回字符串
    @PostMapping("/filter")
    @ResponseBody
    public List<Restaurant> filter(@RequestBody String name, @RequestBody Integer distance){
        return service.filter(name, distance);
    }
}
