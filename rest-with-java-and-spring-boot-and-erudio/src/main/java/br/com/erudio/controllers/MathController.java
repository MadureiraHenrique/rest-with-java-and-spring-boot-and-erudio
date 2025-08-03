package br.com.erudio.controllers;

import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.operations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.erudio.components.Conversion;
import br.com.erudio.components.Numeric;

@RestController
@RequestMapping("/math")
public class MathController {

    public Numeric numeric = new Numeric();
    public Conversion conversion = new Conversion();

    public Sum sum = new Sum();
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return sum.calcSum(numberOne, numberTwo);
    }

    public Subtraction subtraction = new Subtraction();
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return subtraction.calcSub(numberOne, numberTwo);
    }

    public Multiplication multiplication = new Multiplication();
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return multiplication.calcMult(numberOne, numberTwo);
    }


    public Division division = new Division();
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws UnsupportedMathOperationException {
        return division.calcDiv(numberOne, numberTwo);
    }

    public Mean mean = new Mean();
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        return mean.calcMean(numberOne, numberTwo);
    }

    public Squareroot squareroot = new Squareroot();
    @RequestMapping("/squareRoot/{number}")
    public double squareRoot(
            @PathVariable("number") String number
    ) {
        return squareroot.calcSR(number);
    }

}
