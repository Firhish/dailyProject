package interviewfaq.qinetics;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64;

public class q3 {

  public static void main(String[]args) throws UnsupportedEncodingException {                      

		String strip = "***";        	
		strip = URLEncoder.encode(strip, "UTF-8");
		
		byte[] encodedByteArray = Base64.getEncoder().encode(strip.getBytes());        
		String encodedString = new String(encodedByteArray, "UTF-8");   
		System.out.println("Enc   >>  "+ encodedString);
             // Enc   >>  YXBwbGUlMjZvcmFuZ2U=

        
        byte[] decodedByteArray = Base64.getDecoder().decode("YXBwbGUlMjZvcmFuZ2U=".getBytes());
        String decodedString = new String(decodedByteArray, "UTF-8");
        String result = URLDecoder.decode(decodedString, "UTF-8");

        System.out.println(result);

  }
}

