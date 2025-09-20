package lucasSA.com.utils;

import lucasSA.com.exception.UnsupportedMathOperationException;
import org.springframework.stereotype.Component;

@Component
public class MathUtils {

    public boolean isNumeric(String strNumber){
        if(strNumber == null || strNumber.isEmpty())return false;
        String number = strNumber.replace(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public Double convertToDouble(String strNumber) throws UnsupportedMathOperationException {
        if(strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("please set a numeric value");
        String number = strNumber.replace(",",".");
        return Double.parseDouble(number);
    }
}
