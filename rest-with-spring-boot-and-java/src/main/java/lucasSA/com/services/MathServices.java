package lucasSA.com.services;

import lombok.RequiredArgsConstructor;
import lucasSA.com.exception.UnsupportedMathOperationException;
import lucasSA.com.utils.MathUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MathServices {

    private final MathUtils mathUtils;

    public Double sum(String numberOne, String numberTwo){
        if(!mathUtils.isNumeric(numberOne) || !mathUtils.isNumeric(numberTwo) ) throw new UnsupportedMathOperationException("please set a numeric value");
        return mathUtils.convertToDouble(numberOne) + mathUtils.convertToDouble(numberTwo);
    }

    public Double subtraction(String numberOne, String numberTwo){
        if(!mathUtils.isNumeric(numberOne) || !mathUtils.isNumeric(numberTwo) ) throw new UnsupportedMathOperationException("please set a numeric value");
        return mathUtils.convertToDouble(numberOne) - mathUtils.convertToDouble(numberTwo);
    }

    public Double mean(String numberOne, String numberTwo){
        if(!mathUtils.isNumeric(numberOne) || !mathUtils.isNumeric(numberTwo) ) throw new UnsupportedMathOperationException("please set a numeric value");
        return (mathUtils.convertToDouble(numberOne) + mathUtils.convertToDouble(numberTwo)) / 2;
    }


    public Double division(String numberOne, String numberTwo){
        if(!mathUtils.isNumeric(numberOne) || !mathUtils.isNumeric(numberTwo) ) throw new UnsupportedMathOperationException("please set a numeric value");
        return mathUtils.convertToDouble(numberOne) / mathUtils.convertToDouble(numberTwo);
    }

    public Double squareRoot(String number){
        if(!mathUtils.isNumeric(number)) throw new UnsupportedMathOperationException("please set a numeric value");
        return Math.sqrt(mathUtils.convertToDouble(number));
    }

}
