import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class Main {

    public static void main(String[] args){
//        List<DAOObject>  daoObjects = new ArrayList<DAOObject>();
//        daoObjects.add(new DAOObject(2.7,4.0));
//        daoObjects.add(new DAOObject(3.7,2.0));
//        daoObjects.add(new DAOObject(5.7,1.0));
//        daoObjects.add(new DAOObject(4.7,3.0));
        String jsonStr = null;
       try {
           Scanner in = new Scanner(new FileReader("D://TextIn.txt"));
           jsonStr = in.toString();
       } catch (IOException ex) {
           ex.printStackTrace();
       }
        JsonParser parser = new JsonParser();
        JsonElement jsonTree = parser.parse(jsonStr);
        Type type = new TypeToken<List<DAOObject>>() {}.getType();
        List<DAOObject> daoObjects = new Gson().fromJson(jsonTree, type);
        Gson gson = new Gson();
        //gson.toJson(daoObjects);
        Collections.sort(daoObjects, new DAOComparator());
        FileWriter fw;
        try {
            fw = new FileWriter(new File("D://TextOut.txt"));
            fw.write(String.format(gson.toJson(daoObjects)));
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //Collections.sort(daoObjects, new DAOComparator());
        System.out.println("JSON sorted:" + gson.toJson(daoObjects));
        //System.out.print(daoObjects.toString());
    }
}
