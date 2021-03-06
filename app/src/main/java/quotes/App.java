/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import javax.xml.transform.Result;
import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class App {

    private static final Type REVIEW_TYPE = new TypeToken<List<qout>>() {
    }.getType();
    public static void main(String[] args) throws Exception {
        try {
            URL url = new URL("http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestMethod("GET");
           BufferedReader reader=new BufferedReader((new InputStreamReader(connection.getInputStream())));

            String qo= reader.readLine();
            reader.close();
            Gson gson = new Gson();
            qout data = gson.fromJson(qo,qout.class);
            System.out.println(data);

            BufferedReader reader_file = new BufferedReader(new FileReader("./app/src/main/resources/recentquotes.json"));
            List<qout> data_in = gson.fromJson(reader_file, REVIEW_TYPE);
            data_in.add(data);
            String jsonInString = gson.toJson(data_in);
            BufferedWriter write = new BufferedWriter(new FileWriter("./app/src/main/resources/recentquotes.json" , false));
            write.write(jsonInString);
            write.flush();

            write.close();
        } catch (IOException e) {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("./app/src/main/resources/recentquotes.json"));
            List<qout> data = gson.fromJson(reader, REVIEW_TYPE);
            int range = (data.size()) + 1;
            int x = (int) (Math.random() * range) ;
            System.out.println(data.get(x));
            System.out.println("-----------------------------------------------------------------------------");
        }
    }
}
