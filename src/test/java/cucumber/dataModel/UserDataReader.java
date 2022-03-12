package cucumber.dataModel;

import com.google.gson.GsonBuilder;
import gherkin.deps.com.google.gson.Gson;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import cucumber.utils.ConfigLoader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class UserDataReader {
//    private static String currentUser = "";

    public UserDataReader()
    {

    }

    private static final Gson GSON = new Gson();

    public UserData getUserProfile(String type) {
        try {
            return GSON.fromJson(new FileReader(readFile(type)), UserData.class);
        }
        catch(Exception e) {
            throw new RuntimeException("other problem, test was looking for customer with test type "+type + " message " + e.getMessage());
        }
    }

    private File readFile(String type) throws FileNotFoundException,
            URISyntaxException,
            NullPointerException {
        String fileName = getDataRootFolder() + File.separator + type.replaceAll(" ", "_").toString() + ".json";
        String path = this.getClass().getClassLoader().getResource(fileName).getPath().replaceAll("%5c","/");
        path = path.substring(1,path.length());
        return new File(path);
    }

    public static String getDataRootFolder() {
        String dataRootFolder = "datamodel";
        String isEnvironmentAvailable = ConfigLoader.getInstance().getEnv();
        if (isEnvironmentAvailable.equalsIgnoreCase(""))
//            below line - if no environment is defined then default to DEV.
            {dataRootFolder = dataRootFolder + File.separator + "stage";}
        else
//            below line - supports additional environments in future without modifying the class
            {dataRootFolder = dataRootFolder + File.separator + isEnvironmentAvailable.toLowerCase();}
        return  dataRootFolder;
    }
}
