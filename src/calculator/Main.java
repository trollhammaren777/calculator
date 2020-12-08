package calculator;

import calculator.model.exceptions.InvalidCombinationOfNumberTypesException;
import calculator.model.exceptions.InvalidNumberException;
import calculator.model.exceptions.InvalidOperationException;
import calculator.model.Operations;

import java.util.Scanner;

public class Main {

    public static void main(String... args) throws InvalidCombinationOfNumberTypesException, InvalidNumberException, InvalidOperationException {

        Operations operations = new Operations();

        System.out.println("Пожалуйста, введите данные (для выхода введите \"-1\"):");
        while (true) {
            Scanner in = new Scanner(System.in);
            String rawData = in.nextLine();
            String newData = rawData.replaceAll("\\s", "");
            if (newData.equals("-1")) {
                break;
            }
            String[] data;

            String operation = operations.getOperation(newData);
            if (operation.equals("+")) {
                data = newData.split("\\+");
            } else if (operation.equals("*")) {
                data = newData.split("\\*");
            } else {
                data = newData.split(operation);
            }

            if ((operations.isRomanNumber(data, operations.getFIRSTNUMBERINDEX()) && !operations.isRomanNumber(data, operations.getSECONDNUMBERINDEX())) ||
                    (!operations.isRomanNumber(data, operations.getFIRSTNUMBERINDEX()) && operations.isRomanNumber(data, operations.getSECONDNUMBERINDEX()))) {
                throw new InvalidCombinationOfNumberTypesException();
            }

            String result = operations.getResult(data, operation);
            System.out.println(result);
        }
    }
}
