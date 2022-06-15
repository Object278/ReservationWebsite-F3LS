package reservation.f3ls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reservation.f3ls.mapper.RestaurantMapper;
import reservation.f3ls.model.Restaurant;
import reservation.f3ls.service.RestaurantService;

import java.util.List;

@Component
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantMapper mapper;

    @Autowired
    public RestaurantServiceImpl(RestaurantMapper mapper){
        this.mapper = mapper;
    }

    @Override
    public boolean insert(Restaurant restaurant) {
        return mapper.insertRestaurant(restaurant) > 0;
    }

    @Override
    public Restaurant selectById(Integer id) {
        return mapper.selectById(id);
    }

    @Override
    public List<Restaurant> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public boolean updateRestaurant(Restaurant restaurant) {
        return mapper.updateRestaurant(restaurant) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return mapper.delete(id) > 0;
    }
}
