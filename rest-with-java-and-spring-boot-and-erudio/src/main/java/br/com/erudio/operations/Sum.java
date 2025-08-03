package br.com.erudio.operations;

import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.components.Conversion;
import br.com.erudio.components.Numeric;

public class Sum {

    Numeric numeric = new Numeric();

    Conversion conversion = new Conversion();

    public double calcSum(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
        if (!numeric.isNumeric(numberOne) || !numeric.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please Set a Numeric Value");
        return conversion.convertToDouble(numberOne) + conversion.convertToDouble(numberTwo);
    }

}
