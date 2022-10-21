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

    public List<Car> printCar(int id) {
        List<Car> carsId = new ArrayList<>();
        if(id<0||id>5) {
            for (int i = 0; i < 5; i++) {
                carsId.add(car.get(i));
            }
        } else {
            for (int i = 0; i < id; i++) {
                carsId.add(car.get(i));
            }
        }
        return carsId;
    }
}
