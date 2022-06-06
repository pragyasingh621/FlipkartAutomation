package com.FlipkartAutomation.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigProperties implements IRead {

	private Properties properties;

	private void initPropertiesFile(String fileName) {
		if (isDefaultPropertiesFile(fileName)) {
			properties = getDataFromProperties("config.properties");
		} else {
			properties = getDataFromProperties(fileName);
		}
	}

	public ReadConfigProperties(String fileName) {
		initPropertiesFile(fileName);
	}

	public ReadConfigProperties() {
		initPropertiesFile("");
	}

	private Properties getDataFromProperties(String fileName) {
		String path = ResourceUtils.getResourcePath(fileName);
		Properties prop = new Properties();

		try {
			InputStream stream = new FileInputStream(new File(path));
			prop.load(stream);
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
		return prop;
	}

	private boolean isDefaultPropertiesFile(String fileName) {
		if ("".equalsIgnoreCase(fileName))
			return true;
		return false;
	}

	@Override
	public String getFlipkartUrl() {
		return properties.getProperty("FlipkartUrl");
	}

	@Override
	public String getAmazonUrl() {
		return properties.getProperty("AmazonUrl");
	}
}
