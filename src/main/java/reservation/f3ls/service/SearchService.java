package reservation.f3ls.service;

import org.springframework.stereotype.Component;
import reservation.f3ls.model.Restaurants;

import java.util.List;

@Component
public interface SearchService {

    public List<Restaurants> filter(String name, Integer distance);
}
