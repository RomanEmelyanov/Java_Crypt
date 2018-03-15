import java.util.Base64;
import java.util.Arrays;
import javax.swing.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.io.*;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class decrypt {
    public static void main(String[] args) throws Exception {
try{
String c = args[0];
System.out.println("Ciphertext: " + c);
String p = args[1];
System.out.println("Password: " + p);
Security.addProvider(new BouncyCastleProvider());
StandardPBEStringEncryptor e = new StandardPBEStringEncryptor();
e.setProviderName("BC");
e.setAlgorithm("PBEWITHSHA256AND128BITAES-CBC-BC");
e.setPassword(p);
String d = e.decrypt(c);
System.out.println("Cleartext: " + d);
} catch( Exception e ) { 
 System.out.println("Exception: " + e);
 e.printStackTrace();
}}}
