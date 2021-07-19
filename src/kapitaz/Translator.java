package kapitaz;

import java.util.HashMap;

public class Translator {

//    HashMap<String, Integer> numeric = new HashMap<>();
//
//    public HashMap<String, Integer> completeHashMap() {
//        numeric.put("I", 1);
//        numeric.put("II", 1);
//        numeric.put("III", 1);
//        numeric.put("IV", 1);
//        numeric.put("V", 1);
//        numeric.put("VI", 1);
//        numeric.put("VII", 1);
//        numeric.put("VIII", 1);
//        numeric.put("IX", 1);
//        numeric.put("X", 1);
//
//        return numeric;
//
//    }

    public int romanToNumber (String roman) {
        try {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException ("Неверный формат данных");
        }
        return -1;
    }

}
