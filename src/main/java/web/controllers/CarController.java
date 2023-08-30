package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;
import web.services.CarServiceImpl;


@Controller
public class CarController {

    @Autowired
    private CarService carService = new CarServiceImpl();


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") Integer count,
                            Model model) {
        model.addAttribute("cars", carService.getCarsByCount(count));
        return "cars";
    }
}
