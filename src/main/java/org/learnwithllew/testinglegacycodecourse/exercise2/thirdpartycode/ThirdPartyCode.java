package org.learnwithllew.testinglegacycodecourse.exercise2.thirdpartycode;

/**
 * Do Not Touch This Code
 */
public class ThirdPartyCode {

    public static boolean SECURE = false;

    public static int restCall(String url, String action, int key) {
        if (SECURE) {
            throw new RuntimeException("I pitty the fool that tries to call this service without the proper authorization");
        }
        return 200;
    }
}
