package mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ExceptionController {

    @RequestMapping(value = "/throw-an-exception", method = GET)
    public String throwAnException() throws Exception {
        throw new Exception("throw an exception");
    }

}
