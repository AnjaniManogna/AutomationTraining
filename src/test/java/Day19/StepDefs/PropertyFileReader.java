package Day19.StepDefs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
    public String getPropertyValue(String key) throws IOException {
        Properties p = new Properties();
        FileReader f = new FileReader(System.getProperty("user.dir")+"//src//test//java//Day19//Properties//Locators.properties");
        p.load(f);
        return p.getProperty(key);
    }

}
