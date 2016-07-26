package org.fundacionjala.katas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by danielgonzales on 7/25/2016.
 */
public class SearchEngine {


    private static final int INT_ZERO = 0;
    private static final String STRING_SPACE = " ";
    private static final String STRING_WILDCARD = "_";
    private static final String STRING_DOT = ".";

    public static int find(String needle, String haystack) {
        Pattern p = Pattern.compile(STRING_WILDCARD);
        Matcher m = p.matcher(needle);

        if (m.find()) {
            int pos = INT_ZERO;
            String[] inParts = haystack.split(STRING_SPACE);
            for (String mySearch : inParts) {
                if (mySearch.matches(needle.replace(STRING_WILDCARD, STRING_DOT)))
                    pos = haystack.indexOf(mySearch);
            }
            return pos;
        } else {
            return haystack.indexOf(needle);
        }

//        CLEAN CODE ?

//        int pos = INT_ZERO;
//        String[] inParts = haystack.split(STRING_SPACE);
//
//        for (String mySearch : inParts) {
//            if (mySearch.matches(needle.replace(STRING_WILDCARD, STRING_DOT))) pos= haystack.indexOf(mySearch); }
//
//        return (m.find()) ? pos : haystack.indexOf(needle);
//
//        }
//    }
    }
}
