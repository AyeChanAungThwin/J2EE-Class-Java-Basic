package io.github.ayechanaungthwin.java_basic.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomField {

	private String name;
	private String type;
	private Object value;
}
