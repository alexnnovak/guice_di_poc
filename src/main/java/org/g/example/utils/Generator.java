package org.g.example.utils;

import lombok.experimental.UtilityClass;

import java.util.Date;
import java.util.Random;

@UtilityClass
public class Generator {
    public static String randomEmail(String prefix) {
        prefix = (prefix == null) ? "" : prefix;
        String mainEmail = prefix + "@test.com";
        Date dateUnique = new Date();
        return mainEmail.split("@")[0] + "-auto-" + randomStringWithDigits(7) + dateUnique.getTime() + "@" + mainEmail.split("@")[1];
    }

    public static String randomStringWithDigits(int length) {
        Random rng = new Random();
        String characters = "1234567890";
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}
