package reservation.f3ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reservation.f3ls.model.Restaurants;
import reservation.f3ls.service.RestaurantService;

import java.util.List;

@Controller
public class RestaurantsController {
    private final RestaurantService service;

    @Autowired
    public RestaurantsController(RestaurantService service){
        this.service = service;
    }

    /*
    Database test, return json string
     */
    @GetMapping("/selectAll")
    @ResponseBody
    public List<Restaurants> selectAll(){
        return service.selectAll();
    }
}
