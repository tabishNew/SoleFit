package GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtility {

	public String readDataFromPropertyFile(String key) throws Throwable {
		FileInputStream file=new FileInputStream(IPathConstants.PROPERTYFILEPATH);
		Properties prop=new Properties();
		prop.load(file);
		String value=prop.getProperty(key);
		return value;
		
	}
}
