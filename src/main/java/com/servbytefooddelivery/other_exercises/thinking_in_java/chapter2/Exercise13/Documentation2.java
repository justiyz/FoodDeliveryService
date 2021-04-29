package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter2.Exercise13;


//Question
/* Run Documentation1.java, Documentation2.java and Documentation3.java
 * through Javadoc. Verify the resulting documentation with your Web browser.
 */

import java.util.*;

// object/Documentation2.java
/**
 * <pre>
 * Uses
 * System.out.println(new Date());
 * </pre>
 */
public class Documentation2 {
    Date d = new Date();
    void showDate() {
        System.out.println("Date = " + d);
    }
}
