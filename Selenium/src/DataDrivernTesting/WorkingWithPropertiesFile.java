package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WorkingWithPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\raki9\\OneDrive\\Documents\\SeleniumWeekendBatch2\\testdata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String url=pobj.getProperty("url");
		System.out.println(url);
		System.out.println(pobj.getProperty("email"));
		System.out.println(pobj.getProperty("pwd"));
	}

}
