package GenFunctions;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Properties;


public class ReadRequirementData {

    public String readData(String getParameter) {

        String workingDir = System.getProperty("user.dir");

        File file = new File(workingDir + "/src/test/java/data/requirement.properties");
        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Properties prop = new Properties();
        try {
            prop.load(new InputStreamReader(fileInput,Charset.forName("UTF-8")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty(getParameter);
    }


}

