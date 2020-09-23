package org.learnwithllew.testinglegacycodecourse.exercise2;

public class MissingInputs {

    private int count = 0;

    public int getCategory() {
        if (count == 5) {
            return 2;
        } else {
            return 1;
        }
    }
}
