package com.example;

import com.example.MyBigNumber;
import java.util.ArrayList;
import java.util.List;

public class Service {

    private final MyBigNumber core = new MyBigNumber();
    private final List<String> steps = new ArrayList<>();

    public String sum(String a, String b) {

        steps.clear();

        steps.add("Start calculation");

        String result = core.sum(a, b);

        steps.addAll(core.getSteps());

        steps.add("Final result = " + result);

        return result;
    }

    public List<String> getSteps() {
        return steps;
    }
}