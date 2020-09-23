package org.learnwithllew.testinglegacycodecourse.exercise2;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class ValidateDevelopmentEnvironment {

    @Test
    void it_works() {
        // When you run this test the first time, it should fail,
        // and open some sort of file-comparison tool.
        // After that, please change the message in the call below to
        // "it works" and re-run it to see it pass.
        Approvals.verify("it does not work yet");
    }
}
