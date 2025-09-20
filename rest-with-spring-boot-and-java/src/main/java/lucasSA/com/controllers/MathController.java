package lucasSA.com.controllers;

import lucasSA.com.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    //http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo) ) throw new UnsupportedMathOperationException("please set a numeric value");
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    //http://localhost:8080/math/subtraction/3/5
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo) ) throw new UnsupportedMathOperationException("please set a numeric value");
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    //http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo) ) throw new UnsupportedMathOperationException("please set a numeric value");
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    //http://localhost:8080/math/mean/3/5
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo) ) throw new UnsupportedMathOperationException("please set a numeric value");
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    //http://localhost:8080/squareRoot/division/3/5
    @RequestMapping("/squareRoot/{numberOne}/{numberTwo}")
    public String squareRoot(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo) ) throw new UnsupportedMathOperationException("please set a numeric value");
        String resultado;
        return resultado = "A raiz quadrada de "+numberOne+ " é: " + Math.sqrt(convertToDouble(numberOne)) +
                "\n A raiz quadrada de "+numberTwo+ " é: " + Math.sqrt(convertToDouble(numberTwo));

    }

    private Double convertToDouble(String strNumber) throws UnsupportedMathOperationException {
        if(strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("please set a numeric value");
        String number = strNumber.replace(",",".");
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber){
        if(strNumber == null || strNumber.isEmpty())return false;
        String number = strNumber.replace(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }





}
