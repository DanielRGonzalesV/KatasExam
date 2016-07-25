package org.fundacionjala.katas;

/**
 * Created by danielgonzales on 7/25/2016.
 */
public class EANValidator {

    private static final int INT_ZERO = 0;
    private static final int INT_ONE = 1;
    private static final int INT_TWO = 2;
    private static final int INT_THREE = 3;
    private static final int INT_TEN = 10;


    public static boolean validate (String ean) {
        int myEan, checkSum, finalEan = INT_ZERO;
        int finalPosition = ean.length ();
        for (int i = INT_ZERO; i < finalPosition - INT_ONE; i++) {
            myEan = Character.getNumericValue (ean.charAt (i));
            finalEan = (((i + INT_ONE) % INT_TWO == INT_ZERO)) ? finalEan + (myEan * INT_THREE) : finalEan + myEan;
        }
        checkSum = (finalEan % INT_TEN == INT_ZERO) ? INT_ZERO : (INT_TEN - (finalEan % INT_TEN));
        return checkSum == Character.getNumericValue (ean.charAt (finalPosition - INT_ONE));
    }
}
