package br.com.erudio.operations;

import br.com.erudio.components.Conversion;
import br.com.erudio.components.Numeric;
import br.com.erudio.exception.UnsupportedMathOperationException;

public class Mean {

    Numeric numeric = new Numeric();

    Conversion conversion = new Conversion();

    public double calcMean(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
        if (!numeric.isNumeric(numberOne) || !numeric.isNumeric(numberTwo))
            throw new UnsupportedMathOperationException("Please Set a Numeric Value");
        return (conversion.convertToDouble(numberOne) + conversion.convertToDouble(numberTwo)) / 2;
    }
}
