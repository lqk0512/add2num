package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MyBigNumber {

    private static final Logger logger = Logger.getLogger(MyBigNumber.class.getName());

    private final List<String> steps = new ArrayList<>();

    public String sum(String a, String b) {

        steps.clear();

        logger.info("Start sum: " + a + " + " + b);
        steps.add("Start sum: " + a + " + " + b);

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;
        StringBuilder result = new StringBuilder();
        int step = 1;

        while (i >= 0 || j >= 0 || carry > 0) {

            int x = (i >= 0) ? a.charAt(i) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j) - '0' : 0;

            int total = x + y + carry;

            carry = total / 10;
            int digit = total % 10;

            result.append(digit);

            String log = "Step " + step +
                    ": " + x + " + " + y +
                    " + carry => digit = " + digit;

            logger.info(log);
            steps.add(log);

            i--;
            j--;
            step++;
        }

        String finalResult = result.reverse().toString();

        logger.info("Final result = " + finalResult);
        steps.add("Final result = " + finalResult);

        return finalResult;
    }

    public List<String> getSteps() {
        return steps;
    }
}