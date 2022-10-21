package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
@Controller
//@RequestMapping(value = "/cars")
public class CarController {

    private final CarServiceImpl carSer;
    @Autowired
    public CarController(CarServiceImpl carSer) {
        this.carSer = carSer;
    }
    @GetMapping("/cars")
    public String printCar(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> car = carSer.show(count);
        model.addAttribute("cars", car);
        return "cars";
    }
    /*@GetMapping()
    public String printCar(ModelMap model) {
        model.addAttribute("cars", carSer.printCar());
        return "cars";
    }
    @GetMapping(value = "?count={count}") //?count={id}
    public String printWelcome1(@PathVariable("count") int count, ModelMap model) {
        model.addAttribute("carsId", carSer.show(count));
        return "carsCount";
}*/
}
