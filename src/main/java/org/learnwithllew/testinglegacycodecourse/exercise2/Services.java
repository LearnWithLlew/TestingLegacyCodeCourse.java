package org.learnwithllew.testinglegacycodecourse.exercise2;

import org.learnwithllew.testinglegacycodecourse.exercise2.thirdpartycode.ThirdPartyCode;

public class Services {

    // public static StringBuffer logger;

    public static int restCall(String url, String action, int key) {
        return ThirdPartyCode.restCall(url, action, key);
    }

    public static void initialiseServices() {
        int key = 42;
        int result = restCall("https://postgresdatabase.acme.com", "start", key);
        if (result == 200) {
            key = key + 100;
            result = restCall("https://kafka.acme.com", "subscribe", key);
            if (result == 200) {
                result = restCall("https://cache.acme.com", "load", key);
                if (result != 200) {
                    System.out.println("Error starting cache");
                }
                result = restCall("https://search.acme.com", "index", key);
                if (result != 200) {
                    System.out.println("Error indexing search");
                }
                result = restCall("https://creditcardprocessor.acme.com", "charge", key);
                if (result != 200) {
                    System.out.println("Error charging credit card");
                }
            }
        }
    }
}
