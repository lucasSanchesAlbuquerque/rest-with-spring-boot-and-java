package lucasSA.com.controllers;

import lombok.RequiredArgsConstructor;
import lucasSA.com.exception.UnsupportedMathOperationException;
import lucasSA.com.services.MathServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MathController {

    private final MathServices mathServices;


    //http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        return mathServices.sum(numberOne, numberTwo);
    }

    //http://localhost:8080/math/subtraction/3/5
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        return mathServices.subtraction(numberOne, numberTwo);
    }

    //http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        return mathServices.division(numberOne, numberTwo);
    }

    //http://localhost:8080/math/mean/3/5
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        return mathServices.mean(numberOne, numberTwo);
    }

    //http://localhost:8080/squareRoot/division/3/5
    @RequestMapping("/squareRoot/{number}")
    public Double squareRoot(
            @PathVariable("numberOne") String number) throws Exception {
        return mathServices.squareRoot(number);

    }









}
