package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;
@Controller
public class CarController {

    private final CarServiceImpl carSer;
    @Autowired
    public CarController(CarServiceImpl carSer) {
        this.carSer = carSer;
    }
    @GetMapping("/cars")
    public String printCarNew(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> car = carSer.printCar(count);
        model.addAttribute("cars", car);
        return "cars";
    }
}
