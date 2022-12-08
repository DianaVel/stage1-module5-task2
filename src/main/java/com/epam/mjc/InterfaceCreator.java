package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation <Integer> op = l -> {
            List <Integer> divided = new ArrayList<>();
            for (int temp : l){
                divided.add(temp/divider);
            }
            return divided;
        };
        return op;
    }
}
