// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ishladi");
        String url = "https://imlo.uz/letter/B?sort=&size=500&page=";
        for (int i = 0; i < 13; i++) {
            System.out.println(i + "- page\n\n\n");
            getWords(url + i);
        }
    }

    public static void getWords(String url) {

        try {
            URL apiUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                int count = 0, c1 = 0;
                while ((line = reader.readLine()) != null) {
                    if (line.contains("<a href=\"https://imlo.uz/word/")) {
                        System.out.println("reader.readLine() = " + reader.readLine().replace("&#039;", "'"));
                        c1++;
                    }
//                    System.out.println(++count + ". line = " + line);
                    response.append(line);
                }
                reader.close();
                System.out.println("\n\nc1 = " + c1);
                String responseData = response.toString();
//                System.out.println(responseData);
            } else {
                System.out.println("HTTP Request Error: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
