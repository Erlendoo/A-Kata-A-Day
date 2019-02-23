public class Solution {

    public static boolean validatePin(String pin) {

        char[] pinArray = pin.toCharArray();

        if (!pin.isEmpty()) {
            for (char c : pinArray) {
                if (Character.getNumericValue(c) <= 9 && 0 < Character.getNumericValue(c)) {
                    if (pin.length() == 4 || pin.length() == 6) {
                    } else return false;
                } else return false;
            }
        }else return false;
        return true;
    }

}