package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW", 1, 2010));
        cars.add(new Car("Audi", 2, 2005));
        cars.add(new Car("Lada", 8, 2020));
        cars.add(new Car("VW", 7, 2009));
        cars.add(new Car("Bugatti", 10, 1990));

    }

    public List<Car> getCarsByCount(Integer count) {
        if (count > 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
