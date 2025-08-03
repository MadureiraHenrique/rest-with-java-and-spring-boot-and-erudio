package br.com.erudio.operations;

import br.com.erudio.components.Conversion;
import br.com.erudio.components.Numeric;
import br.com.erudio.exception.UnsupportedMathOperationException;

public class Squareroot {

    Numeric numeric = new Numeric();

    Conversion conversion = new Conversion();

    public double calcSR(String number) throws UnsupportedMathOperationException {
        if (!numeric.isNumeric(number))
            throw new UnsupportedMathOperationException("Please Set a Numeric Value");
        return Math.sqrt(conversion.convertToDouble(number));
    }
}
