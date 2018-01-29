package mvc.controller;

import mvc.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ExceptionController {

    @RequestMapping(value = "/throw-an-exception", method = GET)
    public String throwAnException() throws Exception {
        throw new Exception("throw an exception");
    }


    @RequestMapping(value = "/throw-my-exception", method = GET)
    public String throwMyException() throws Exception {
        throw new MyException("throw my exception");
    }
}
