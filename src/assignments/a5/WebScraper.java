package assignments.a5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebScraper {
    public static void main(String[] args) {
        try{
            String url = "https://www.youtube.com/watch?v=s0sc6vDX3BI";
            String htmlContent = fetchHtmlContent(url);
            String extractedData = extractData(htmlContent);
            writeToTextFile(extractedData, "output.txt");
            System.out.println("Web scraping and data extraction completed successfully!");
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static String fetchHtmlContent(String urlString) throws IOException {
        StringBuilder htmlContent = new StringBuilder();

        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                htmlContent.append(line).append("\n");
            }
        } finally {
            connection.disconnect();
        }
        return htmlContent.toString();
    }

    private static String extractData(String htmlContent) {
        String regex = "<title>(.*?)</title>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(htmlContent);

        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return "No data found";
        }
    }

    private static void writeToTextFile(String data, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        }
    }
}
