package io.github.ayechanaungthwin.java_basic.reflection;

public class Java2DbmsNaming {

	public static String column(String data) {
		StringBuilder sb = new StringBuilder();
		boolean isFirstTime = true;
    	for (Character out: data.toCharArray()) {
    		if (isFirstTime) {
    			sb.append(String.valueOf(out).toLowerCase());
    			isFirstTime = false;
    			continue;
    		}
    		if (Character.isUpperCase(out)) {
    			sb.append("_");
    			sb.append(String.valueOf(out).toLowerCase()); //To lower-case char
    			continue;
    		}
    		sb.append(out);
    	}
    	return sb.toString();
	}
}
