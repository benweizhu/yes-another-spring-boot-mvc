package mvc.advice;

import mvc.controller.ExceptionController;
import mvc.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(assignableTypes = ExceptionController.class)
public class ExceptionAdvice {

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public String handleControllerException() {
        return "error";
    }

}
