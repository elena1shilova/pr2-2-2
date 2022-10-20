package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private static int CAR_COUNT;
    private List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(++CAR_COUNT, "BMW", "3"));
        car.add(new Car(++CAR_COUNT, "Mazda ", "b"));
        car.add(new Car(++CAR_COUNT, "Toyota Camry", "XV10"));
        car.add(new Car(++CAR_COUNT, "Lada Niva", "2121"));
        car.add(new Car(++CAR_COUNT, "Opel Astra", "F"));
    }

    public List<Car> printCar() {
        return car;
    }

    public Car show(int id) {
        return car.stream().filter(car -> car.getId() == id).findAny().orElse(null);
    }
}
