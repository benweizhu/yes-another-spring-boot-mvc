package mvc.controller;

import mvc.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class CarController {
    @RequestMapping(value = "/car", method = GET)
    public String getCar(Model model) {
        model.addAttribute(new Car(1));
        return "car";
    }
}
