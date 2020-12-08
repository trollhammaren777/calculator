package calculator.model;

import calculator.model.exceptions.InvalidCombinationOfNumberTypesException;
import calculator.model.exceptions.InvalidNumberException;
import calculator.model.exceptions.InvalidOperationException;

public class Operations {
    private final int FIRSTNUMBERINDEX = 0;
    private final int SECONDNUMBERINDEX = 1;
    private int result;

    NumberTransformation numberTransformation = new NumberTransformation();

    public int getFIRSTNUMBERINDEX() {
        return FIRSTNUMBERINDEX;
    }

    public int getSECONDNUMBERINDEX() {
        return SECONDNUMBERINDEX;
    }

    public String getNumber(final String[] data, int indexNumber) throws InvalidNumberException {
        String stringNumber = data[indexNumber];
        boolean isRomanNumber = false;

        for (RomanNumbersEnum roman: RomanNumbersEnum.values()) {
            if (stringNumber.equals(roman.toString())) {
                isRomanNumber = true;
                break;
            }
        }

        if (!isRomanNumber) {
            isRightRomanNumber(data, indexNumber);
        }

        if (!isRomanNumber) {
            if (Integer.parseInt(stringNumber) > 10 || Integer.parseInt(stringNumber) < 1) {
                throw new InvalidNumberException();
            }
        }
        return stringNumber;
    }

    public String getOperation(final String data) throws InvalidOperationException {
        int maxIndex = data.length() - 1;
        boolean isIncorrectOperation = true;
        char option;
        String operation = new String();

        for (int index = 0; index <= maxIndex; index++) {
            if (data.charAt(index) == '+' || data.charAt(index) == '-' ||
                    data.charAt(index) == '*' || data.charAt(index) == '/') {
                option = data.charAt(index);
                operation = Character.toString(option);
                isIncorrectOperation = false;
                break;
            }
        }

        if (isIncorrectOperation) {
            throw new InvalidOperationException();
        }
        return operation;
    }

    public boolean isRomanNumber(final String[] data, final int indexNumber) throws InvalidNumberException {
        boolean isRomanNumber = false;

        if (!getNumber(data, indexNumber).equals("1") && !getNumber(data, indexNumber).equals("2") &&
                !getNumber(data, indexNumber).equals("3") && !getNumber(data, indexNumber).equals("4") &&
                !getNumber(data, indexNumber).equals("5") && !getNumber(data, indexNumber).equals("6") &&
                !getNumber(data, indexNumber).equals("7") && !getNumber(data, indexNumber).equals("8") &&
                !getNumber(data, indexNumber).equals("9") && !getNumber(data, indexNumber).equals("10")) {
            isRomanNumber = true;
        }
        return isRomanNumber;
    }

    public void isRightRomanNumber(final String[] data, final int indexNumber) throws InvalidNumberException {
        int inspectedNumber = numberTransformation.convertRomanToArabicNumber(data, indexNumber);
        if (inspectedNumber == Integer.MAX_VALUE) {
            throw new InvalidNumberException();
        }
    }

    public String convertResult(final String[] data, final String operation) throws InvalidNumberException, InvalidCombinationOfNumberTypesException {
        int firstNumber = Integer.MAX_VALUE;
        int secondNumber = Integer.MIN_VALUE;

        try {
            if (isRomanNumber(data, FIRSTNUMBERINDEX) && isRomanNumber(data, SECONDNUMBERINDEX)) {
                firstNumber = numberTransformation.convertRomanToArabicNumber(data, FIRSTNUMBERINDEX);
                secondNumber = numberTransformation.convertRomanToArabicNumber(data, SECONDNUMBERINDEX);
            }
            else if (isRomanNumber(data, FIRSTNUMBERINDEX) || isRomanNumber(data, SECONDNUMBERINDEX)) {
                throw new InvalidCombinationOfNumberTypesException();
            }
            else {
                firstNumber = Integer.parseInt(getNumber(data, FIRSTNUMBERINDEX));
                secondNumber = Integer.parseInt(getNumber(data, SECONDNUMBERINDEX));
            }
        } catch (InvalidNumberException e) {
            e.printStackTrace();
        }

        switch(operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }

        String stringResult;
        if(isRomanNumber(data, FIRSTNUMBERINDEX) && isRomanNumber(data, SECONDNUMBERINDEX)) {
            stringResult = numberTransformation.convertArabicToRomanNumberFirstVersion(Integer.toString(result));
            return stringResult;
        }
        stringResult = Integer.toString(result);
        return stringResult;
    }

    public String getResult(final String[] data, final String operation) throws InvalidNumberException, InvalidCombinationOfNumberTypesException {
        return convertResult(data, operation);
    }
}


