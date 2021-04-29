package com.servbytefooddelivery.hashing;

import lombok.extern.slf4j.Slf4j;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

@Slf4j
public class Sha512Hashing {

    public Sha512Hashing()  {
    }

    private static byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return salt;
    }


    private static void get_SHA_512_SecurePassword(String fullName) throws NoSuchAlgorithmException {
        byte[] salt = getSalt();
        String encryptedName = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt);
            byte[] bytes = md.digest(fullName.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte aByte : bytes) {
                sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
            }
            encryptedName = sb.toString();

        } catch (NoSuchAlgorithmException e ) {
            e.printStackTrace();
        }
        log.info(fullName +" has been hashed with SHA512 algorithm,"+" The encrypted result is -> {}", encryptedName);

    }

    public static void main(String[] args) throws NoSuchAlgorithmException {

        Sha512Hashing.get_SHA_512_SecurePassword("John Travolta Emmanuel");

    }
}
