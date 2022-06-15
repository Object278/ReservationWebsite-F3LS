package reservation.f3ls.service;

import org.springframework.stereotype.Component;
import reservation.f3ls.model.Restaurant;

import java.util.List;
@Component
public interface RestaurantService {
    public boolean insert(Restaurant restaurant);

    public Restaurant selectById(Integer id);

    public List<Restaurant> selectAll();

    public boolean updateRestaurant(Restaurant restaurant);

    public boolean delete(Integer id);
}
