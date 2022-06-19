package reservation.f3ls.service;

import org.springframework.stereotype.Component;
import reservation.f3ls.model.Restaurants;

import java.util.List;
@Component
public interface RestaurantService {
    public boolean insert(Restaurants restaurants);

    public Restaurants selectById(Integer id);

    public List<Restaurants> selectAll();

    public boolean updateRestaurant(Restaurants restaurants);

    public boolean delete(Integer id);
}
