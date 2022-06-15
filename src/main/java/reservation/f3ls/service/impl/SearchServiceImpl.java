package reservation.f3ls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import reservation.f3ls.mapper.RestaurantMapper;
import reservation.f3ls.model.Restaurant;
import reservation.f3ls.service.SearchService;

import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl implements SearchService{
    private final RestaurantMapper mapper;

    @Autowired
    public SearchServiceImpl(RestaurantMapper mapper){
        this.mapper = mapper;
    }


    @Override
    public List<Restaurant> filter(String name, Integer distance) {
        List<Restaurant> ret = new ArrayList<>();
        Restaurant target = mapper.selectByName(name);
        Integer targetX = target.getxCoordination();
        Integer targetY = target.getyCoordination();
        List<Restaurant> allRestaurant = mapper.selectAll();
        //target Restaurant is the first in the list.
        ret.add(target);
        for(Restaurant restaurant : allRestaurant){
            if(!restaurant.getId().equals(target.getId())) {
                Integer x = restaurant.getxCoordination();
                Integer y = restaurant.getyCoordination();
                double curDistance = Math.sqrt(Math.pow(targetX - x, 2) + Math.pow(targetY - y, 2));
                if (curDistance < distance) {
                    ret.add(restaurant);
                }
            }
        }
        return ret;
    }
}
