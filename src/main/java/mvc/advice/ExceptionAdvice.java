package mvc.advice;

import mvc.controller.ExceptionController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(assignableTypes = ExceptionController.class)
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleControllerException() {
        return "error";
    }

}
