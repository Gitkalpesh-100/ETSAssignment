package com.framework.utilities;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class CommonUtils {
    public static String randomMailId() {
        int length =4;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        return "user"+generatedString+"@gmail.com";
    }
    public static String tenDigitRandomNum() {
        int length = 9;
        boolean useLetters = false;
        boolean useNumbers = true;
        String number ="9"+ RandomStringUtils.random(length, useLetters, useNumbers);
        return number;
    }
}