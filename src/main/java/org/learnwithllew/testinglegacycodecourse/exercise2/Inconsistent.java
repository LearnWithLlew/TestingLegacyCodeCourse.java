package org.learnwithllew.testinglegacycodecourse.exercise2;

import java.time.LocalDateTime;
import java.util.Random;

public class Inconsistent {

    // public static boolean TESTING = false;

    public static String print(String name) {
        LocalDateTime localDateTime = LocalDateTime.now();
        return String.format("started at %s by %s", localDateTime, name);
    }

    public static int getID() {
        return new Random().nextInt() % 10 + 1;
    }
}
