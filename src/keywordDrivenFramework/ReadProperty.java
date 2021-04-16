package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./data/config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String value = prop.getProperty("browser");
		System.out.println(value);
		

	}

}



