package calculator.model;

import calculator.model.exceptions.InvalidNumberException;

public class NumberTransformation {
    public int convertRomanToArabicNumber(final String[] data, final int indexNumber) throws InvalidNumberException {
        if (data[indexNumber].equals(RomanNumbersEnum.I.toString())) {
            return 1;
        }
        if (data[indexNumber].equals(RomanNumbersEnum.II.toString())) {
            return 2;
        }
        if (data[indexNumber].equals(RomanNumbersEnum.III.toString())) {
            return 3;
        }
        if (data[indexNumber].equals(RomanNumbersEnum.IV.toString())) {
            return 4;
        }
        if (data[indexNumber].equals(RomanNumbersEnum.V.toString())) {
            return 5;
        }
        if (data[indexNumber].equals(RomanNumbersEnum.VI.toString())) {
            return 6;
        }
        if (data[indexNumber].equals(RomanNumbersEnum.VII.toString())) {
            return 7;
        }
        if (data[indexNumber].equals(RomanNumbersEnum.VIII.toString())) {
            return 8;
        }
        if (data[indexNumber].equals(RomanNumbersEnum.IX.toString())) {
            return 9;
        }
        if (data[indexNumber].equals(RomanNumbersEnum.X.toString())) {
            return 10;
        }
        if (data[indexNumber].equals("1") || data[indexNumber].equals("2") || data[indexNumber].equals("3") || data[indexNumber].equals("4") || data[indexNumber].equals("5") ||
                data[indexNumber].equals("6") || data[indexNumber].equals("7") || data[indexNumber].equals("8") || data[indexNumber].equals("9") || data[indexNumber].equals("10")) {
            return Integer.parseInt(data[indexNumber]);
        }
        return Integer.MAX_VALUE;
    }


    public String convertArabicToRomanNumberFirstVersion(final String number) {
        int intNumber = Integer.parseInt(number);

        if (intNumber == 1) {
            return RomanNumbersEnum.I.toString();
        }
        if (intNumber == 2) {
            return RomanNumbersEnum.II.toString();
        }
        if (intNumber == 3) {
            return RomanNumbersEnum.III.toString();
        }
        if (intNumber == 4) {
            return RomanNumbersEnum.IV.toString();
        }
        if (intNumber == 5) {
            return RomanNumbersEnum.V.toString();
        }
        if (intNumber == 6) {
            return RomanNumbersEnum.VI.toString();
        }
        if (intNumber == 7) {
            return RomanNumbersEnum.VII.toString();
        }
        if (intNumber == 8) {
            return RomanNumbersEnum.VIII.toString();
        }
        if (intNumber == 9) {
            return RomanNumbersEnum.IX.toString();
        }
        if (intNumber == 10) {
            return RomanNumbersEnum.X.toString();
        }
        if (intNumber == -1) {
            return "-" + RomanNumbersEnum.I.toString();
        }
        if (intNumber == -2) {
            return "-" + RomanNumbersEnum.II.toString();
        }
        if (intNumber == -3) {
            return "-" + RomanNumbersEnum.III.toString();
        }
        if (intNumber == -4) {
            return "-" + RomanNumbersEnum.IV.toString();
        }
        if (intNumber == -5) {
            return "-" + RomanNumbersEnum.V.toString();
        }
        if (intNumber == -6) {
            return "-" + RomanNumbersEnum.VI.toString();
        }
        if (intNumber == -7) {
            return "-" + RomanNumbersEnum.VII.toString();
        }
        if (intNumber == -8) {
            return "-" + RomanNumbersEnum.VIII.toString();
        }
        if (intNumber == -9) {
            return "-" + RomanNumbersEnum.IX.toString();
        }
        if (intNumber == -10) {
            return "-" + RomanNumbersEnum.X.toString();
        }

        if (intNumber == 11) {
            return RomanNumbersEnum.X.toString() + RomanNumbersEnum.I.toString();
        }
        if (intNumber == 12) {
            return RomanNumbersEnum.X.toString() + RomanNumbersEnum.II.toString();
        }
        if (intNumber == 13) {
            return RomanNumbersEnum.X.toString() + RomanNumbersEnum.III.toString();
        }
        if (intNumber == 14) {
            return RomanNumbersEnum.X.toString() + RomanNumbersEnum.IV.toString();
        }
        if (intNumber == 15) {
            return RomanNumbersEnum.X.toString() + RomanNumbersEnum.V.toString();
        }
        if (intNumber == 16) {
            return RomanNumbersEnum.X.toString() + RomanNumbersEnum.VI.toString();
        }
        if (intNumber == 17) {
            return RomanNumbersEnum.X.toString() + RomanNumbersEnum.VII.toString();
        }
        if (intNumber == 18) {
            return RomanNumbersEnum.X.toString() + RomanNumbersEnum.VIII.toString();
        }
        if (intNumber == 19) {
            return RomanNumbersEnum.X.toString() + RomanNumbersEnum.IX.toString();
        }
        if (intNumber == 20) {
            return RomanNumbersEnum.XX.toString();
        }

        if (intNumber == 21) {
            return RomanNumbersEnum.XX.toString() + RomanNumbersEnum.I.toString();
        }
        if (intNumber == 22) {
            return RomanNumbersEnum.XX.toString() + RomanNumbersEnum.II.toString();
        }
        if (intNumber == 23) {
            return RomanNumbersEnum.XX.toString() + RomanNumbersEnum.III.toString();
        }
        if (intNumber == 24) {
            return RomanNumbersEnum.XX.toString() + RomanNumbersEnum.IV.toString();
        }
        if (intNumber == 25) {
            return RomanNumbersEnum.XX.toString() + RomanNumbersEnum.V.toString();
        }
        if (intNumber == 26) {
            return RomanNumbersEnum.XX.toString() + RomanNumbersEnum.VI.toString();
        }
        if (intNumber == 27) {
            return RomanNumbersEnum.XX.toString() + RomanNumbersEnum.VII.toString();
        }
        if (intNumber == 28) {
            return RomanNumbersEnum.XX.toString() + RomanNumbersEnum.VIII.toString();
        }
        if (intNumber == 29) {
            return RomanNumbersEnum.XX.toString() + RomanNumbersEnum.IX.toString();
        }
        if (intNumber == 30) {
            return RomanNumbersEnum.XXX.toString();
        }

        if (intNumber == 31) {
            return RomanNumbersEnum.XXX.toString() + RomanNumbersEnum.I.toString();
        }
        if (intNumber == 32) {
            return RomanNumbersEnum.XXX.toString() + RomanNumbersEnum.II.toString();
        }
        if (intNumber == 33) {
            return RomanNumbersEnum.XXX.toString() + RomanNumbersEnum.III.toString();
        }
        if (intNumber == 34) {
            return RomanNumbersEnum.XXX.toString() + RomanNumbersEnum.IV.toString();
        }
        if (intNumber == 35) {
            return RomanNumbersEnum.XXX.toString() + RomanNumbersEnum.V.toString();
        }
        if (intNumber == 36) {
            return RomanNumbersEnum.XXX.toString() + RomanNumbersEnum.VI.toString();
        }
        if (intNumber == 37) {
            return RomanNumbersEnum.XXX.toString() + RomanNumbersEnum.VII.toString();
        }
        if (intNumber == 38) {
            return RomanNumbersEnum.XXX.toString() + RomanNumbersEnum.VIII.toString();
        }
        if (intNumber == 39) {
            return RomanNumbersEnum.XXX.toString() + RomanNumbersEnum.IX.toString();
        }
        if (intNumber == 40) {
            return RomanNumbersEnum.XL.toString();
        }

        if (intNumber == 41) {
            return RomanNumbersEnum.XL.toString() + RomanNumbersEnum.I.toString();
        }
        if (intNumber == 42) {
            return RomanNumbersEnum.XL.toString() + RomanNumbersEnum.II.toString();
        }
        if (intNumber == 43) {
            return RomanNumbersEnum.XL.toString() + RomanNumbersEnum.III.toString();
        }
        if (intNumber == 44) {
            return RomanNumbersEnum.XL.toString() + RomanNumbersEnum.IV.toString();
        }
        if (intNumber == 45) {
            return RomanNumbersEnum.XL.toString() + RomanNumbersEnum.V.toString();
        }
        if (intNumber == 46) {
            return RomanNumbersEnum.XL.toString() + RomanNumbersEnum.VI.toString();
        }
        if (intNumber == 47) {
            return RomanNumbersEnum.XL.toString() + RomanNumbersEnum.VII.toString();
        }
        if (intNumber == 48) {
            return RomanNumbersEnum.XL.toString() + RomanNumbersEnum.VIII.toString();
        }
        if (intNumber == 49) {
            return RomanNumbersEnum.XL.toString() + RomanNumbersEnum.IX.toString();
        }
        if (intNumber == 50) {
            return RomanNumbersEnum.L.toString();
        }

        if (intNumber == 51) {
            return RomanNumbersEnum.L.toString() + RomanNumbersEnum.I.toString();
        }
        if (intNumber == 52) {
            return RomanNumbersEnum.L.toString() + RomanNumbersEnum.II.toString();
        }
        if (intNumber == 53) {
            return RomanNumbersEnum.L.toString() + RomanNumbersEnum.III.toString();
        }
        if (intNumber == 54) {
            return RomanNumbersEnum.L.toString() + RomanNumbersEnum.IV.toString();
        }
        if (intNumber == 55) {
            return RomanNumbersEnum.L.toString() + RomanNumbersEnum.V.toString();
        }
        if (intNumber == 56) {
            return RomanNumbersEnum.L.toString() + RomanNumbersEnum.VI.toString();
        }
        if (intNumber == 57) {
            return RomanNumbersEnum.L.toString() + RomanNumbersEnum.VII.toString();
        }
        if (intNumber == 58) {
            return RomanNumbersEnum.L.toString() + RomanNumbersEnum.VIII.toString();
        }
        if (intNumber == 59) {
            return RomanNumbersEnum.L.toString() + RomanNumbersEnum.IX.toString();
        }
        if (intNumber == 60) {
            return RomanNumbersEnum.LX.toString();
        }

        if (intNumber == 61) {
            return RomanNumbersEnum.LX.toString() + RomanNumbersEnum.I.toString();
        }
        if (intNumber == 62) {
            return RomanNumbersEnum.LX.toString() + RomanNumbersEnum.II.toString();
        }
        if (intNumber == 63) {
            return RomanNumbersEnum.LX.toString() + RomanNumbersEnum.III.toString();
        }
        if (intNumber == 64) {
            return RomanNumbersEnum.LX.toString() + RomanNumbersEnum.IV.toString();
        }
        if (intNumber == 65) {
            return RomanNumbersEnum.LX.toString() + RomanNumbersEnum.V.toString();
        }
        if (intNumber == 66) {
            return RomanNumbersEnum.LX.toString() + RomanNumbersEnum.VI.toString();
        }
        if (intNumber == 67) {
            return RomanNumbersEnum.LX.toString() + RomanNumbersEnum.VII.toString();
        }
        if (intNumber == 68) {
            return RomanNumbersEnum.LX.toString() + RomanNumbersEnum.VIII.toString();
        }
        if (intNumber == 69) {
            return RomanNumbersEnum.LX.toString() + RomanNumbersEnum.IX.toString();
        }
        if (intNumber == 70) {
            return RomanNumbersEnum.LXX.toString();
        }

        if (intNumber == 71) {
            return RomanNumbersEnum.LXX.toString() + RomanNumbersEnum.I.toString();
        }
        if (intNumber == 72) {
            return RomanNumbersEnum.LXX.toString() + RomanNumbersEnum.II.toString();
        }
        if (intNumber == 73) {
            return RomanNumbersEnum.LXX.toString() + RomanNumbersEnum.III.toString();
        }
        if (intNumber == 74) {
            return RomanNumbersEnum.LXX.toString() + RomanNumbersEnum.IV.toString();
        }
        if (intNumber == 75) {
            return RomanNumbersEnum.LXX.toString() + RomanNumbersEnum.V.toString();
        }
        if (intNumber == 76) {
            return RomanNumbersEnum.LXX.toString() + RomanNumbersEnum.VI.toString();
        }
        if (intNumber == 77) {
            return RomanNumbersEnum.LXX.toString() + RomanNumbersEnum.VII.toString();
        }
        if (intNumber == 78) {
            return RomanNumbersEnum.LXX.toString() + RomanNumbersEnum.VIII.toString();
        }
        if (intNumber == 79) {
            return RomanNumbersEnum.LXX.toString() + RomanNumbersEnum.IX.toString();
        }
        if (intNumber == 80) {
            return RomanNumbersEnum.LXXX.toString();
        }

        if (intNumber == 81) {
            return RomanNumbersEnum.LXXX.toString() + RomanNumbersEnum.I.toString();
        }
        if (intNumber == 82) {
            return RomanNumbersEnum.LXXX.toString() + RomanNumbersEnum.II.toString();
        }
        if (intNumber == 83) {
            return RomanNumbersEnum.LXXX.toString() + RomanNumbersEnum.III.toString();
        }
        if (intNumber == 84) {
            return RomanNumbersEnum.LXXX.toString() + RomanNumbersEnum.IV.toString();
        }
        if (intNumber == 85) {
            return RomanNumbersEnum.LXXX.toString() + RomanNumbersEnum.V.toString();
        }
        if (intNumber == 86) {
            return RomanNumbersEnum.LXXX.toString() + RomanNumbersEnum.VI.toString();
        }
        if (intNumber == 87) {
            return RomanNumbersEnum.LXXX.toString() + RomanNumbersEnum.VII.toString();
        }
        if (intNumber == 88) {
            return RomanNumbersEnum.LXXX.toString() + RomanNumbersEnum.VIII.toString();
        }
        if (intNumber == 89) {
            return RomanNumbersEnum.LXXX.toString() + RomanNumbersEnum.IX.toString();
        }

        if (intNumber == 90) {
            return RomanNumbersEnum.XC.toString();
        }
        if (intNumber == 91) {
            return RomanNumbersEnum.XC.toString() + RomanNumbersEnum.I.toString();
        }
        if (intNumber == 92) {
            return RomanNumbersEnum.XC.toString() + RomanNumbersEnum.II.toString();
        }
        if (intNumber == 93) {
            return RomanNumbersEnum.XC.toString() + RomanNumbersEnum.III.toString();
        }
        if (intNumber == 94) {
            return RomanNumbersEnum.XC.toString() + RomanNumbersEnum.IV.toString();
        }
        if (intNumber == 95) {
            return RomanNumbersEnum.XC.toString() + RomanNumbersEnum.V.toString();
        }
        if (intNumber == 96) {
            return RomanNumbersEnum.XC.toString() + RomanNumbersEnum.VI.toString();
        }
        if (intNumber == 97) {
            return RomanNumbersEnum.XC.toString() + RomanNumbersEnum.VII.toString();
        }
        if (intNumber == 98) {
            return RomanNumbersEnum.XC.toString() + RomanNumbersEnum.VIII.toString();
        }
        if (intNumber == 99) {
            return RomanNumbersEnum.XC.toString() + RomanNumbersEnum.IX.toString();
        }
        if (intNumber == 100) {
            return RomanNumbersEnum.C.toString();
        }
        return number;
    }
}
