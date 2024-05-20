package io.github.ayechanaungthwin.java_basic.reflection;

public class TypeConverter {

	public static String getDbmsType(String data) {
		String value = null;
		switch(data.toLowerCase()) {
			case "long":
				value = "BIGINT";
				break;
			case "string":
				value = "VARCHAR(255)";
				break;
			default:
				value = data.toUpperCase();
		}
		return value;
	}
}
