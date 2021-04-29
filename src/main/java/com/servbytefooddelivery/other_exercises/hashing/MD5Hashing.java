package com.servbytefooddelivery.other_exercises.hashing;

import lombok.extern.slf4j.Slf4j;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Slf4j
public class MD5Hashing {

    private static void getSecuredFullName(String fullName){
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            //Add password bytes to digest
            md.update(fullName.getBytes());

            //Get the hash's bytes
            byte[] bytes = md.digest();

            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (byte aByte : bytes) {
                sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hexadecimal format
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e) {

            e.printStackTrace();
        }
        log.info(fullName +" has been hashed with MD5 algorithm,"+" The encrypted result is -> {}", generatedPassword);
    }



    public static void main(String[] args){

        MD5Hashing.getSecuredFullName("Inyang Ernest");


    }






}
