package com.servbytefooddelivery.other_exercises.thinking_in_java.chapter6;

// Show that protected methods have package access but are not public.

/* In directory Cookie2:
 * //access/cookie2/Cookie.java
 * //Creates a library
 * package access.cookie2;
 *
 * public class Cookie {
 *	public Cookie() {
 *		System.out.println("Cookie contstructor");
 *	}
 *	protected void bite() { System.out.println("bite"); }
 * }
 */

public class Chapter6Exercise4 {
    public static void main(String[] args) {
//        Cookie x = new Cookie();
        // x.bite(); // package access to protected method
    }
}
