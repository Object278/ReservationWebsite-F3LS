package reservation.f3ls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reservation.f3ls.mapper.RestaurantMapper;
import reservation.f3ls.model.Restaurants;
import reservation.f3ls.service.SearchService;

import java.util.ArrayList;
import java.util.List;

@Component
public class SearchServiceImpl implements SearchService{
    private final RestaurantMapper mapper;

    @Autowired
    public SearchServiceImpl(RestaurantMapper mapper){
        this.mapper = mapper;
    }


    @Override
    public List<Restaurants> filter(String name, Integer distance) {
        List<Restaurants> ret = new ArrayList<>();
        Restaurants target = mapper.selectByName(name);
        Integer targetX = target.getxCoordination();
        Integer targetY = target.getyCoordination();
        List<Restaurants> allRestaurants = mapper.selectAll();
        //target Restaurant is the first in the list.
        ret.add(target);
        for(Restaurants restaurants : allRestaurants){
            if(!restaurants.getId().equals(target.getId())) {
                Integer x = restaurants.getxCoordination();
                Integer y = restaurants.getyCoordination();
                double curDistance = Math.sqrt(Math.pow(targetX - x, 2) + Math.pow(targetY - y, 2));
                if (curDistance < distance) {
                    ret.add(restaurants);
                }
            }
        }
        return ret;
    }

    @Override
    public Restaurants search(String name) {
        return mapper.selectByName(name);
    }
}
