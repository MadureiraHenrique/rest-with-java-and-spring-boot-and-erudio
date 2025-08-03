package br.com.erudio.components;

import br.com.erudio.exception.UnsupportedMathOperationException;

public class Conversion {
    public double convertToDouble(String strNumber) throws UnsupportedMathOperationException {
        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("Please Set a Numeric Value");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }
}
