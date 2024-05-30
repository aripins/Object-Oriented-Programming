import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Utils {
    public static <T> void writeJsonFile(String fileName, List<T> data) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(data);

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> List<T> readJsonFile(String fileName, Type type) {
        Gson gson = new Gson();
        List<T> data = null;

        try (FileReader reader = new FileReader(fileName)) {
            data = gson.fromJson(reader, type);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data != null ? data : new ArrayList<>();
    }
}
