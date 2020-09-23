package org.learnwithllew.testinglegacycodecourse.exercise2;

import java.io.FileWriter;
import java.nio.file.Files;

public class Loop {

    public static void square(int number) throws Exception {
        try (FileWriter f = new FileWriter(Files.createTempFile("", ".txt").toFile())) {
            for (int i = 1; i < number; i++) {
                int squared = i * i;
                f.append(String.format("%s -> %s\n", i, squared));
            }
        }
    }
}
