package reservation.f3ls.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reservation.f3ls.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

@Component
public interface SearchService {

    public List<Restaurant> filter(String name, Integer distance);
}
