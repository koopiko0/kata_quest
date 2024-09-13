package web.service;

import model.Car;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service  // Это важно для создания бина
public class CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Corolla", 2015),
            new Car("Honda", "Civic", 2018),
            new Car("Ford", "Mustang", 2020),
            new Car("Chevrolet", "Camaro", 2019),
            new Car("BMW", "M3", 2021)
    );

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}

