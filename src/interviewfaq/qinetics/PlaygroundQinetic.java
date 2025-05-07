package interviewfaq.qinetics;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64;

public class PlaygroundQinetic {

    public static void main(String[] args) throws UnsupportedEncodingException  {
    
        String strip = "ainur";        	
		strip = URLEncoder.encode(strip, "UTF-8");
		
		byte[] encodedByteArray = Base64.getEncoder().encode(strip.getBytes());        
		String encodedString = new String(encodedByteArray, "UTF-8");   
		System.out.println("Enc   >>  "+ encodedString);

        byte[] decodedByteArray = Base64.getDecoder().decode(encodedString.getBytes());
        String decodedString = new String(decodedByteArray,"UTF-8");
        String decodedStrip = URLDecoder.decode(decodedString, "UTF-8");

        System.out.println(decodedStrip);




    }
    
}
