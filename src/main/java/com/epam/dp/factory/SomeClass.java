package com.epam.dp.factory;

import com.epam.dp.factory.annotations.Component;
import com.epam.dp.factory.annotations.InjectRandomInt;

/**
 * @author Ivan_Zhuravel
 */
@Component("SomeClass")
public class SomeClass {
    @InjectRandomInt
    private int superTest;
    private String test = "test";

    public String getTest() {
        return test;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "superTest=" + superTest +
                ", test='" + test + '\'' +
                '}';
    }
}
