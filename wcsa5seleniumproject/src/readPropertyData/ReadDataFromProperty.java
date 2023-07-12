package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	
	public static void main(String[] args) throws IOException {
		//Read the data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/Config.properties");
		
		//create a obj of properties class
		Properties prop = new Properties();
		//make a file ready to read
		prop.load(fis);
		//read the perticular property from file
		String data = prop.getProperty("Browser");
		System.out.println(data);
		
	}

}
