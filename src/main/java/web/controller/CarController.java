package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping(value = "/cars")
public class CarController {

    /*public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!11111");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "cars";
    }*/
    @Autowired
    private CarServiceImpl carSer;
    @GetMapping()
    public String printCar(ModelMap model) {
        model.addAttribute("cars", carSer.printCar());
        return "cars";
    }
    @GetMapping(value = "/{id}") //?count={id}
    public String printWelcome1(@PathVariable("id") int id, ModelMap model) {
        model.addAttribute("caar", carSer.show(id));
        return "cars";
}
}
